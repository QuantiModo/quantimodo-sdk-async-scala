package io.swagger.client.api

import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class PairsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def pairsGet(cause: String,
      effect: String,
      duration: String,
      delay: String,
      startTime: String,
      endTime: String,
      causeSource: String,
      effectSource: String,
      causeUnit: String,
      effectUnit: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/pairs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(cause != null)   queryParams += "cause" -> cause.toString
    if(effect != null)   queryParams += "effect" -> effect.toString
    if(duration != null)   queryParams += "duration" -> duration.toString
    if(delay != null)   queryParams += "delay" -> delay.toString
    if(startTime != null)   queryParams += "startTime" -> startTime.toString
    if(endTime != null)   queryParams += "endTime" -> endTime.toString
    if(causeSource != null)   queryParams += "causeSource" -> causeSource.toString
    if(effectSource != null)   queryParams += "effectSource" -> effectSource.toString
    if(causeUnit != null)   queryParams += "causeUnit" -> causeUnit.toString
    if(effectUnit != null)   queryParams += "effectUnit" -> effectUnit.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
