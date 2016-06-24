package io.swagger.client.api

import io.swagger.client.model.UserTokenRequest
import io.swagger.client.model.UserTokenSuccessfulResponse
import io.swagger.client.model.UserTokenFailedResponse
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class OrganizationsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v1OrganizationsOrganizationIdUsersPost(organizationId: Integer,
      body: UserTokenRequest,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[UserTokenSuccessfulResponse], writer: RequestWriter[UserTokenRequest]): Future[UserTokenSuccessfulResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/organizations/{organizationId}/users")
        replaceAll ("\\{" + "organizationId" + "\\}",organizationId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling OrganizationsApi->v1OrganizationsOrganizationIdUsersPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
