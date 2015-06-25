package io.swagger.client.api

import io.swagger.client.model.Connector
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class ConnectorsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def connectorsListGet()(implicit reader: ClientResponseReader[List[Connector]]): Future[List[Connector]] = {
    // create path and map variables
    val path = (addFmt("/connectors/list"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsConnectorConnectGet(connector: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/connectors/{connector}/connect")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsConnectorConnectInstructionsGet(connector: String,
      url: String,
      parameters: List[String],
      usePopup: Boolean)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/connectors/{connector}/connectInstructions")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(url != null)   queryParams += "url" -> url.toString
    if(parameters != null)   queryParams += "parameters" -> parameters.toString
    if(usePopup != null)   queryParams += "usePopup" -> usePopup.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsConnectorConnectParameterGet(connector: String,
      displayName: String,
      key: String,
      usePopup: Boolean,
      _type: String,
      placeholder: String,
      defaultValue: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/connectors/{connector}/connectParameter")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(displayName != null)   queryParams += "displayName" -> displayName.toString
    if(key != null)   queryParams += "key" -> key.toString
    if(usePopup != null)   queryParams += "usePopup" -> usePopup.toString
    if(_type != null)   queryParams += "type" -> _type.toString
    if(placeholder != null)   queryParams += "placeholder" -> placeholder.toString
    if(defaultValue != null)   queryParams += "defaultValue" -> defaultValue.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsConnectorDisconnectGet(connector: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/connectors/{connector}/disconnect")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsConnectorInfoGet(connector: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/connectors/{connector}/info")
        replaceAll ("\\{" + "connector" + "\\}",connector.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsConnectorUpdateGet(connector: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/connectors/{connector}/update")
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
