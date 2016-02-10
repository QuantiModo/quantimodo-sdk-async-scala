package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_10
import io.swagger.client.model.VariableUserSource
import io.swagger.client.model.Inline_response_200_33
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class VariableUserSourceApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def variableUserSourcesGet(accessToken: Option[String] = None,
      variableId: Option[Integer] = None,
      userId: Option[Integer] = None,
      timestamp: Option[Integer] = None,
      earliestMeasurementTime: Option[Integer] = None,
      latestMeasurementTime: Option[Integer] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_10]): Future[Inline_response_200_10] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(variableId != null) variableId.foreach { v => queryParams += "variable_id" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(timestamp != null) timestamp.foreach { v => queryParams += "timestamp" -> v.toString }if(earliestMeasurementTime != null) earliestMeasurementTime.foreach { v => queryParams += "earliest_measurement_time" -> v.toString }if(latestMeasurementTime != null) latestMeasurementTime.foreach { v => queryParams += "latest_measurement_time" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableUserSourcesPost(accessToken: Option[String] = None,
      body: Option[VariableUserSource] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_33], writer: RequestWriter[VariableUserSource]): Future[Inline_response_200_33] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableUserSourcesIdGet(id: Integer,
      sourceId: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_33]): Future[Inline_response_200_33] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }
    if(sourceId != null)   queryParams += "source_id" -> sourceId.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableUserSourcesIdPut(id: Integer,
      sourceId: Integer,
      accessToken: Option[String] = None,
      body: Option[VariableUserSource] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[VariableUserSource]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }
    if(sourceId != null)   queryParams += "source_id" -> sourceId.toString

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableUserSourcesIdDelete(id: Integer,
      sourceId: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/variableUserSources/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }
    if(sourceId != null)   queryParams += "source_id" -> sourceId.toString

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
