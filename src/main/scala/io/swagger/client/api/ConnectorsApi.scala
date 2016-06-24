package io.swagger.client.api

import io.swagger.client.model.ConnectorInstruction
import io.swagger.client.model.ConnectorInfo
import io.swagger.client.model.Connector
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class ConnectorsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v1ConnectJsGet(accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/connect.js"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1ConnectMobileGet(accessToken: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/connect/mobile"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) queryParams += "access_token" -> accessToken.toString



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1ConnectorsConnectorConnectGet(connector: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/{connector}/connect")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1ConnectorsConnectorConnectInstructionsGet(connector: String,
      parameters: String,
      url: String,
      usePopup: Boolean,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/{connector}/connectInstructions")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (parameters != null) queryParams += "parameters" -> parameters.toString

    if (url != null) queryParams += "url" -> url.toString

    if (usePopup != null) queryParams += "usePopup" -> usePopup.toString



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1ConnectorsConnectorConnectParameterGet(connector: String,
      displayName: String,
      key: String,
      placeholder: String,
      _type: String,
      usePopup: Boolean,
      accessToken: Option[String] = None,
      defaultValue: Option[String] = None
      )(implicit reader: ClientResponseReader[ConnectorInstruction]): Future[ConnectorInstruction] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/{connector}/connectParameter")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (defaultValue != null) defaultValue.foreach { v => queryParams += "defaultValue" -> v.toString }

    if (displayName != null) queryParams += "displayName" -> displayName.toString

    if (key != null) queryParams += "key" -> key.toString

    if (placeholder != null) queryParams += "placeholder" -> placeholder.toString

    if (_type != null) queryParams += "type" -> _type.toString

    if (usePopup != null) queryParams += "usePopup" -> usePopup.toString



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1ConnectorsConnectorDisconnectGet(connector: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/{connector}/disconnect")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1ConnectorsConnectorInfoGet(connector: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[ConnectorInfo]): Future[ConnectorInfo] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/{connector}/info")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1ConnectorsConnectorUpdateGet(connector: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/{connector}/update")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1ConnectorsListGet()(implicit reader: ClientResponseReader[List[Connector]]): Future[List[Connector]] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/list"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
