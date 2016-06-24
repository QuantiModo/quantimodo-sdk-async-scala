package io.swagger.client.api

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class AuthenticationApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v2AuthSocialAuthorizeCodeGet(code: String,
      provider: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v2/auth/social/authorizeCode"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code != null) queryParams += "code" -> code.toString

    if (provider != null) queryParams += "provider" -> provider.toString



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2AuthSocialAuthorizeTokenGet(accessToken: String,
      provider: String,
      refreshToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v2/auth/social/authorizeToken"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (refreshToken != null) refreshToken.foreach { v => queryParams += "refreshToken" -> v.toString }

    if (accessToken != null) queryParams += "accessToken" -> accessToken.toString

    if (provider != null) queryParams += "provider" -> provider.toString



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2AuthSocialLoginGet(redirectUrl: String,
      provider: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v2/auth/social/login"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (redirectUrl != null) queryParams += "redirectUrl" -> redirectUrl.toString

    if (provider != null) queryParams += "provider" -> provider.toString



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2Oauth2AccessTokenGet(clientId: String,
      clientSecret: String,
      grantType: String,
      code: String,
      responseType: Option[String] = None,
      scope: Option[String] = None,
      redirectUri: Option[String] = None,
      state: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v2/oauth2/access_token"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (clientId != null) queryParams += "clientId" -> clientId.toString

    if (clientSecret != null) queryParams += "client_secret" -> clientSecret.toString

    if (grantType != null) queryParams += "grant_type" -> grantType.toString

    if (code != null) queryParams += "code" -> code.toString

    if (responseType != null) responseType.foreach { v => queryParams += "response_type" -> v.toString }

    if (scope != null) scope.foreach { v => queryParams += "scope" -> v.toString }

    if (redirectUri != null) redirectUri.foreach { v => queryParams += "redirect_uri" -> v.toString }

    if (state != null) state.foreach { v => queryParams += "state" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2OauthAuthorizeGet(clientId: String,
      clientSecret: String,
      responseType: String,
      scope: String,
      redirectUri: Option[String] = None,
      state: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v2/oauth/authorize"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (clientId != null) queryParams += "clientId" -> clientId.toString

    if (clientSecret != null) queryParams += "client_secret" -> clientSecret.toString

    if (responseType != null) queryParams += "response_type" -> responseType.toString

    if (scope != null) queryParams += "scope" -> scope.toString

    if (redirectUri != null) redirectUri.foreach { v => queryParams += "redirect_uri" -> v.toString }

    if (state != null) state.foreach { v => queryParams += "state" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
