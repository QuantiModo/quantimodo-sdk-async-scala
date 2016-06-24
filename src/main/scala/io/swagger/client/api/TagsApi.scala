package io.swagger.client.api

import io.swagger.client.model.CommonResponse
import io.swagger.client.model.UserTag
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class TagsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v1UserTagsDeletePost(taggedVariableId: Integer,
      tagVariableId: Integer)(implicit reader: ClientResponseReader[CommonResponse]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/userTags/delete"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (taggedVariableId != null) queryParams += "taggedVariableId" -> taggedVariableId.toString

    if (tagVariableId != null) queryParams += "tagVariableId" -> tagVariableId.toString



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1UserTagsPost(body: UserTag,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[CommonResponse], writer: RequestWriter[UserTag]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/userTags"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling TagsApi->v1UserTagsPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
