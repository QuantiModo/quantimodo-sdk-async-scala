package io.swagger.client.api

import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class OauthApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def oauth2AuthorizeGet(response_type: String,
      redirect_uri: String,
      realm: String,
      client_id: String,
      scope: String,
      state: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/oauth2/authorize"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(response_type != null)   queryParams += "response_type" -> response_type.toString
    if(redirect_uri != null)   queryParams += "redirect_uri" -> redirect_uri.toString
    if(realm != null)   queryParams += "realm" -> realm.toString
    if(client_id != null)   queryParams += "client_id" -> client_id.toString
    if(scope != null)   queryParams += "scope" -> scope.toString
    if(state != null)   queryParams += "state" -> state.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
