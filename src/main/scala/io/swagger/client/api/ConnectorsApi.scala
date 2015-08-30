package io.swagger.client.api

import io.swagger.client.model.Connector
import io.swagger.client.model.ConnectorInfo
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class ConnectorsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
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

  
  def v1ConnectorsConnectorConnectGet(connector: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/{connector}/connect")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

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

  
  def v1ConnectorsConnectorInfoGet(connector: String)(implicit reader: ClientResponseReader[ConnectorInfo]): Future[ConnectorInfo] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/{connector}/info")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1ConnectorsConnectorUpdateGet(connector: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/connectors/{connector}/update")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
