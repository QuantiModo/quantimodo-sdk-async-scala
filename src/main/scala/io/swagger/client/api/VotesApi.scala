package io.swagger.client.api

import io.swagger.client.model.CommonResponse
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class VotesApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def v1VotesPost(cause: String,
      effect: String,
      vote: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[CommonResponse]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/votes"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(cause != null)   queryParams += "cause" -> cause.toString
    if(effect != null)   queryParams += "effect" -> effect.toStringif(vote != null) vote.foreach { v => queryParams += "vote" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1VotesDeletePost(cause: String,
      effect: String)(implicit reader: ClientResponseReader[CommonResponse]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/votes/delete"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(cause != null)   queryParams += "cause" -> cause.toString
    if(effect != null)   queryParams += "effect" -> effect.toString

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
