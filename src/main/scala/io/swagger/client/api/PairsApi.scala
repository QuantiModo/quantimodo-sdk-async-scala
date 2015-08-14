package io.swagger.client.api

import io.swagger.client.model.Pairs
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class PairsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def pairsGet(cause: String,
      effect: String,
      causeSource: Option[String] = None,
      causeUnit: Option[String] = None,
      delay: Option[String] = None,
      duration: Option[String] = None,
      effectSource: Option[String] = None,
      effectUnit: Option[String] = None,
      endTime: Option[String] = None,
      startTime: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[List[Pairs]]): Future[List[Pairs]] = {
    // create path and map variables
    val path = (addFmt("/pairs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(cause != null)   queryParams += "cause" -> cause.toStringif(causeSource != null) causeSource.foreach { v => queryParams += "causeSource" -> v.toString }if(causeUnit != null) causeUnit.foreach { v => queryParams += "causeUnit" -> v.toString }if(delay != null) delay.foreach { v => queryParams += "delay" -> v.toString }if(duration != null) duration.foreach { v => queryParams += "duration" -> v.toString }
    if(effect != null)   queryParams += "effect" -> effect.toStringif(effectSource != null) effectSource.foreach { v => queryParams += "effectSource" -> v.toString }if(effectUnit != null) effectUnit.foreach { v => queryParams += "effectUnit" -> v.toString }if(endTime != null) endTime.foreach { v => queryParams += "endTime" -> v.toString }if(startTime != null) startTime.foreach { v => queryParams += "startTime" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
