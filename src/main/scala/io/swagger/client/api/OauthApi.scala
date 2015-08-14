package io.swagger.client.api

import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class OauthApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def oauth2AccesstokenGet(clientId: String,
      clientSecret: String,
      grantType: String,
      responseType: Option[String] = None,
      scope: Option[String] = None,
      redirectUri: Option[String] = None,
      state: Option[String] = None,
      realm: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/oauth2/accesstoken"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(clientId != null)   queryParams += "client_id" -> clientId.toString
    if(clientSecret != null)   queryParams += "client_secret" -> clientSecret.toString
    if(grantType != null)   queryParams += "grant_type" -> grantType.toStringif(responseType != null) responseType.foreach { v => queryParams += "response_type" -> v.toString }if(scope != null) scope.foreach { v => queryParams += "scope" -> v.toString }if(redirectUri != null) redirectUri.foreach { v => queryParams += "redirect_uri" -> v.toString }if(state != null) state.foreach { v => queryParams += "state" -> v.toString }if(realm != null) realm.foreach { v => queryParams += "realm" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def oauth2AuthorizeGet(clientId: String,
      clientSecret: String,
      responseType: String,
      scope: String,
      redirectUri: Option[String] = None,
      state: Option[String] = None,
      realm: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/oauth2/authorize"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(clientId != null)   queryParams += "client_id" -> clientId.toString
    if(clientSecret != null)   queryParams += "client_secret" -> clientSecret.toString
    if(responseType != null)   queryParams += "response_type" -> responseType.toString
    if(scope != null)   queryParams += "scope" -> scope.toStringif(redirectUri != null) redirectUri.foreach { v => queryParams += "redirect_uri" -> v.toString }if(state != null) state.foreach { v => queryParams += "state" -> v.toString }if(realm != null) realm.foreach { v => queryParams += "realm" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
