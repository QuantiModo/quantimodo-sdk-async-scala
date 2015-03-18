package io.swagger.client.api

import io.swagger.client.model.MeasurementSource
import io.swagger.client.model.Measurement
import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class MeasurementsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def measurementSourcesGet()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
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

  
  def measurementSourcesPost(Measurements: List[MeasurementSource])(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[MeasurementSource]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/measurementSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Measurements))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsGet(variableName: String,
      unit: String,
      startTime: String,
      endTime: String,
      groupingWidth: Integer,
      groupingTimezone: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/measurements"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(variableName != null)   queryParams += "variableName" -> variableName.toString
    if(unit != null)   queryParams += "unit" -> unit.toString
    if(startTime != null)   queryParams += "startTime" -> startTime.toString
    if(endTime != null)   queryParams += "endTime" -> endTime.toString
    if(groupingWidth != null)   queryParams += "groupingWidth" -> groupingWidth.toString
    if(groupingTimezone != null)   queryParams += "groupingTimezone" -> groupingTimezone.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsV2Post(Measurements: List[Measurement])(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[Measurement]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/measurements/v2"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Measurements))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def measurementsRangeGet(sources: String,
      user: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/measurementsRange"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(sources != null)   queryParams += "sources" -> sources.toString
    if(user != null)   queryParams += "user" -> user.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
