package io.swagger.client.api

import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class OauthApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def oauth2AccesstokenGet(responseType: String,
      redirectUri: String,
      realm: String,
      clientId: String,
      scope: String,
      state: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/oauth2/accesstoken"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(responseType != null)   queryParams += "response_type" -> responseType.toString
    if(redirectUri != null)   queryParams += "redirect_uri" -> redirectUri.toString
    if(realm != null)   queryParams += "realm" -> realm.toString
    if(clientId != null)   queryParams += "client_id" -> clientId.toString
    if(scope != null)   queryParams += "scope" -> scope.toString
    if(state != null)   queryParams += "state" -> state.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def oauth2AuthorizeGet(clientId: String,
      realm: String,
      redirectUri: String,
      responseType: String,
      scope: String,
      state: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/oauth2/authorize"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(clientId != null)   queryParams += "client_id" -> clientId.toString
    if(realm != null)   queryParams += "realm" -> realm.toString
    if(redirectUri != null)   queryParams += "redirect_uri" -> redirectUri.toString
    if(responseType != null)   queryParams += "response_type" -> responseType.toString
    if(scope != null)   queryParams += "scope" -> scope.toString
    if(state != null)   queryParams += "state" -> state.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
