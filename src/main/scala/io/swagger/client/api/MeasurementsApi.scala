package io.swagger.client.api

import io.swagger.client.model.MeasurementSource
import io.swagger.client.model.Measurement
import io.swagger.client.model.MeasurementSet
import io.swagger.client.model.MeasurementRange
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class MeasurementsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def measurementSourcesGet()(implicit reader: ClientResponseReader[MeasurementSource]): Future[MeasurementSource] = {
    // create path and map variables
    val path = (addFmt("/measurementSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementSourcesPost(name: MeasurementSource)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[MeasurementSource]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/measurementSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(name))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsGet(variableName: String,
      unit: Option[String] = None,
      startTime: Option[String] = None,
      endTime: Option[String] = None,
      groupingWidth: Option[Integer] = None,
      groupingTimezone: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Measurement]): Future[Measurement] = {
    // create path and map variables
    val path = (addFmt("/measurements"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(variableName != null)   queryParams += "variableName" -> variableName.toStringif(unit != null) unit.foreach { v => queryParams += "unit" -> v.toString }if(startTime != null) startTime.foreach { v => queryParams += "startTime" -> v.toString }if(endTime != null) endTime.foreach { v => queryParams += "endTime" -> v.toString }if(groupingWidth != null) groupingWidth.foreach { v => queryParams += "groupingWidth" -> v.toString }if(groupingTimezone != null) groupingTimezone.foreach { v => queryParams += "groupingTimezone" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsV2Post(measurements: MeasurementSet)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[MeasurementSet]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/measurements/v2"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(measurements))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsRangeGet(sources: Option[String] = None,
      user: Option[Integer] = None
      )(implicit reader: ClientResponseReader[MeasurementRange]): Future[MeasurementRange] = {
    // create path and map variables
    val path = (addFmt("/measurementsRange"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(sources != null) sources.foreach { v => queryParams += "sources" -> v.toString }if(user != null) user.foreach { v => queryParams += "user" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
