package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_5
import io.swagger.client.model.MeasurementPost
import java.io.File
import io.swagger.client.model.Inline_response_200_20
import io.swagger.client.model.Measurement
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class MeasurementApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def measurementsGet(accessToken: Option[String] = None,
      userId: Option[Integer] = None,
      clientId: Option[String] = None,
      connectorId: Option[Integer] = None,
      variableId: Option[Integer] = None,
      sourceId: Option[Integer] = None,
      startTime: Option[String] = None,
      value: Option[Number] = None,
      unitId: Option[Integer] = None,
      originalValue: Option[Number] = None,
      originalUnitId: Option[Integer] = None,
      duration: Option[Integer] = None,
      note: Option[String] = None,
      latitude: Option[Number] = None,
      longitude: Option[Number] = None,
      location: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      error: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_5]): Future[Inline_response_200_5] = {
    // create path and map variables
    val path = (addFmt("/measurements"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(connectorId != null) connectorId.foreach { v => queryParams += "connector_id" -> v.toString }if(variableId != null) variableId.foreach { v => queryParams += "variable_id" -> v.toString }if(sourceId != null) sourceId.foreach { v => queryParams += "source_id" -> v.toString }if(startTime != null) startTime.foreach { v => queryParams += "start_time" -> v.toString }if(value != null) value.foreach { v => queryParams += "value" -> v.toString }if(unitId != null) unitId.foreach { v => queryParams += "unit_id" -> v.toString }if(originalValue != null) originalValue.foreach { v => queryParams += "original_value" -> v.toString }if(originalUnitId != null) originalUnitId.foreach { v => queryParams += "original_unit_id" -> v.toString }if(duration != null) duration.foreach { v => queryParams += "duration" -> v.toString }if(note != null) note.foreach { v => queryParams += "note" -> v.toString }if(latitude != null) latitude.foreach { v => queryParams += "latitude" -> v.toString }if(longitude != null) longitude.foreach { v => queryParams += "longitude" -> v.toString }if(location != null) location.foreach { v => queryParams += "location" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(error != null) error.foreach { v => queryParams += "error" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsPost(accessToken: Option[String] = None,
      body: Option[MeasurementPost] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_5], writer: RequestWriter[MeasurementPost]): Future[Inline_response_200_5] = {
    // create path and map variables
    val path = (addFmt("/measurements"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsCsvGet(accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[File]): Future[File] = {
    // create path and map variables
    val path = (addFmt("/measurements/csv"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsRequestCsvPost(accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Integer]): Future[Integer] = {
    // create path and map variables
    val path = (addFmt("/measurements/request_csv"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_20]): Future[Inline_response_200_20] = {
    // create path and map variables
    val path = (addFmt("/measurements/{id}")
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

  
  def measurementsIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[Measurement] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Measurement]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/measurements/{id}")
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

  
  def measurementsIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/measurements/{id}")
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
