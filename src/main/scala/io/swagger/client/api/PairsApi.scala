package io.swagger.client.api

import io.swagger.client.model.Pairs
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class PairsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def pairsGet(cause: String,
      causeSource: String,
      causeUnit: String,
      delay: String,
      duration: String,
      effect: String,
      effectSource: String,
      effectUnit: String,
      endTime: String,
      startTime: String)(implicit reader: ClientResponseReader[List[Pairs]]): Future[List[Pairs]] = {
    // create path and map variables
    val path = (addFmt("/pairs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(cause != null)   queryParams += "cause" -> cause.toString
    if(causeSource != null)   queryParams += "causeSource" -> causeSource.toString
    if(causeUnit != null)   queryParams += "causeUnit" -> causeUnit.toString
    if(delay != null)   queryParams += "delay" -> delay.toString
    if(duration != null)   queryParams += "duration" -> duration.toString
    if(effect != null)   queryParams += "effect" -> effect.toString
    if(effectSource != null)   queryParams += "effectSource" -> effectSource.toString
    if(effectUnit != null)   queryParams += "effectUnit" -> effectUnit.toString
    if(endTime != null)   queryParams += "endTime" -> endTime.toString
    if(startTime != null)   queryParams += "startTime" -> startTime.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
