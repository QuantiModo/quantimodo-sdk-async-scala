package io.swagger.client.api

import io.swagger.client.model.Correlation
import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class CorrelationsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def correlationsGet(effect: String,
      cause: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/correlations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(effect != null)   queryParams += "effect" -> effect.toString
    if(cause != null)   queryParams += "cause" -> cause.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def publicCorrelationsSearchSearchGet(search: String,
      effectOrCause: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/public/correlations/search/{search}")
        replaceAll ("\\{" + "search" + "\\}",search.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(effectOrCause != null)   queryParams += "effectOrCause" -> effectOrCause.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
