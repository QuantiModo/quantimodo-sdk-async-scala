package io.swagger.client.api

import io.swagger.client.model.Permission
import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class SharingApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def sharingPost(sharingData: List[Permission])(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[Permission]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/sharing"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(sharingData))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def sharingDelete(sharingData: List[Permission])(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[Permission]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/sharing"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, writer.write(sharingData))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def sharingVariableNameGet(variableName: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/sharing/{variableName}")
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
