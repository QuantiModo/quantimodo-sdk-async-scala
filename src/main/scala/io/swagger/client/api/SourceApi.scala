package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_13
import io.swagger.client.model.Source
import io.swagger.client.model.Inline_response_200_14
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class SourceApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def sourcesGet(clientId: Option[String] = None,
      name: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_13]): Future[Inline_response_200_13] = {
    // create path and map variables
    val path = (addFmt("/sources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(name != null) name.foreach { v => queryParams += "name" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def sourcesPost(body: Option[Source] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_14], writer: RequestWriter[Source]): Future[Inline_response_200_14] = {
    // create path and map variables
    val path = (addFmt("/sources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def sourcesIdGet(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_14]): Future[Inline_response_200_14] = {
    // create path and map variables
    val path = (addFmt("/sources/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def sourcesIdPut(id: Integer,
      body: Option[Source] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Source]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/sources/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def sourcesIdDelete(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/sources/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
