package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_4
import io.swagger.client.model.Inline_response_200_19
import io.swagger.client.model.Credential
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class CredentialApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def credentialsGet(accessToken: Option[String] = None,
      userId: Option[Integer] = None,
      connectorId: Option[Integer] = None,
      attrKey: Option[String] = None,
      attrValue: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_4]): Future[Inline_response_200_4] = {
    // create path and map variables
    val path = (addFmt("/credentials"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(connectorId != null) connectorId.foreach { v => queryParams += "connector_id" -> v.toString }if(attrKey != null) attrKey.foreach { v => queryParams += "attr_key" -> v.toString }if(attrValue != null) attrValue.foreach { v => queryParams += "attr_value" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def credentialsPost(accessToken: Option[String] = None,
      body: Option[Credential] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_19], writer: RequestWriter[Credential]): Future[Inline_response_200_19] = {
    // create path and map variables
    val path = (addFmt("/credentials"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def credentialsIdGet(id: Integer,
      attrKey: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_19]): Future[Inline_response_200_19] = {
    // create path and map variables
    val path = (addFmt("/credentials/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }
    if(attrKey != null)   queryParams += "attrKey" -> attrKey.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def credentialsIdPut(id: Integer,
      attrKey: String,
      accessToken: Option[String] = None,
      body: Option[Credential] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Credential]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/credentials/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }
    if(attrKey != null)   queryParams += "attrKey" -> attrKey.toString

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def credentialsIdDelete(id: Integer,
      attrKey: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/credentials/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }
    if(attrKey != null)   queryParams += "attrKey" -> attrKey.toString

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
