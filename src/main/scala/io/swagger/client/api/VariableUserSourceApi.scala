package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_25
import io.swagger.client.model.VariableUserSource
import io.swagger.client.model.Inline_response_200_26
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class VariableUserSourceApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def variableUserSourcesGet(variableId: Option[Integer] = None,
      userId: Option[Integer] = None,
      timestamp: Option[Integer] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_25]): Future[Inline_response_200_25] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(variableId != null) variableId.foreach { v => queryParams += "variable_id" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(timestamp != null) timestamp.foreach { v => queryParams += "timestamp" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableUserSourcesPost(body: Option[VariableUserSource] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_26], writer: RequestWriter[VariableUserSource]): Future[Inline_response_200_26] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableUserSourcesIdGet(id: Integer,
      sourceId: Integer)(implicit reader: ClientResponseReader[Inline_response_200_26]): Future[Inline_response_200_26] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(sourceId != null)   queryParams += "source_id" -> sourceId.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableUserSourcesIdPut(id: Integer,
      sourceId: Integer,
      body: Option[VariableUserSource] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[VariableUserSource]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(sourceId != null)   queryParams += "source_id" -> sourceId.toString

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableUserSourcesIdDelete(id: Integer,
      sourceId: Integer)(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(sourceId != null)   queryParams += "source_id" -> sourceId.toString

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
