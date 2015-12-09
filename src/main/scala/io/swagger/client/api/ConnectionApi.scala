package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_5
import io.swagger.client.model.Inline_response_200_6
import io.swagger.client.model.Connection
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class ConnectionApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def connectionsGet(accessToken: Option[String] = None,
      userId: Option[Integer] = None,
      connectorId: Option[Integer] = None,
      connectStatus: Option[String] = None,
      connectError: Option[String] = None,
      updateRequestedAt: Option[String] = None,
      updateStatus: Option[String] = None,
      updateError: Option[String] = None,
      lastSuccessfulUpdatedAt: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_5]): Future[Inline_response_200_5] = {
    // create path and map variables
    val path = (addFmt("/connections"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(connectorId != null) connectorId.foreach { v => queryParams += "connector_id" -> v.toString }if(connectStatus != null) connectStatus.foreach { v => queryParams += "connect_status" -> v.toString }if(connectError != null) connectError.foreach { v => queryParams += "connect_error" -> v.toString }if(updateRequestedAt != null) updateRequestedAt.foreach { v => queryParams += "update_requested_at" -> v.toString }if(updateStatus != null) updateStatus.foreach { v => queryParams += "update_status" -> v.toString }if(updateError != null) updateError.foreach { v => queryParams += "update_error" -> v.toString }if(lastSuccessfulUpdatedAt != null) lastSuccessfulUpdatedAt.foreach { v => queryParams += "last_successful_updated_at" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectionsPost(accessToken: Option[String] = None,
      body: Option[Connection] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_6], writer: RequestWriter[Connection]): Future[Inline_response_200_6] = {
    // create path and map variables
    val path = (addFmt("/connections"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectionsIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_6]): Future[Inline_response_200_6] = {
    // create path and map variables
    val path = (addFmt("/connections/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectionsIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[Connection] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Connection]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/connections/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectionsIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/connections/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
