package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_15
import io.swagger.client.model.Inline_response_200_16
import io.swagger.client.model.Connector
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class ConnectorApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def connectorsGet(accessToken: Option[String] = None,
      name: Option[String] = None,
      displayName: Option[String] = None,
      image: Option[String] = None,
      getItUrl: Option[String] = None,
      shortDescription: Option[String] = None,
      longDescription: Option[String] = None,
      enabled: Option[Boolean] = None,
      oauth: Option[Boolean] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_15]): Future[Inline_response_200_15] = {
    // create path and map variables
    val path = (addFmt("/connectors"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(name != null) name.foreach { v => queryParams += "name" -> v.toString }if(displayName != null) displayName.foreach { v => queryParams += "display_name" -> v.toString }if(image != null) image.foreach { v => queryParams += "image" -> v.toString }if(getItUrl != null) getItUrl.foreach { v => queryParams += "get_it_url" -> v.toString }if(shortDescription != null) shortDescription.foreach { v => queryParams += "short_description" -> v.toString }if(longDescription != null) longDescription.foreach { v => queryParams += "long_description" -> v.toString }if(enabled != null) enabled.foreach { v => queryParams += "enabled" -> v.toString }if(oauth != null) oauth.foreach { v => queryParams += "oauth" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsPost(accessToken: Option[String] = None,
      body: Option[Connector] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_16], writer: RequestWriter[Connector]): Future[Inline_response_200_16] = {
    // create path and map variables
    val path = (addFmt("/connectors"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_16]): Future[Inline_response_200_16] = {
    // create path and map variables
    val path = (addFmt("/connectors/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[Connector] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Connector]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/connectors/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def connectorsIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/connectors/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
