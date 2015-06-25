package io.swagger.client.api

import io.swagger.client.model.User
import io.swagger.client.model.UserTokenRequest
import io.swagger.client.model.UserTokenFailedResponse
import io.swagger.client.model.UserTokenSuccessfulResponse
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class UserApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def userMeGet()(implicit reader: ClientResponseReader[User]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/user/me"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1OrganizationsOrganizationIdUsersPost(organizationId: Integer,
      body: UserTokenRequest)(implicit reader: ClientResponseReader[UserTokenSuccessfulResponse], writer: RequestWriter[UserTokenRequest]): Future[UserTokenSuccessfulResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/organizations/{organizationId}/users")
        replaceAll ("\\{" + "organizationId" + "\\}",organizationId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
