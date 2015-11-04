package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_17
import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_18
import io.swagger.client.model.Unit
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class UnitApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def unitsGet(clientId: Option[String] = None,
      name: Option[String] = None,
      abbreviatedName: Option[String] = None,
      categoryId: Option[Boolean] = None,
      minimumValue: Option[Number] = None,
      maximumValue: Option[Number] = None,
      updated: Option[Integer] = None,
      multiply: Option[Number] = None,
      add: Option[Number] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_17]): Future[Inline_response_200_17] = {
    // create path and map variables
    val path = (addFmt("/units"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(name != null) name.foreach { v => queryParams += "name" -> v.toString }if(abbreviatedName != null) abbreviatedName.foreach { v => queryParams += "abbreviated_name" -> v.toString }if(categoryId != null) categoryId.foreach { v => queryParams += "category_id" -> v.toString }if(minimumValue != null) minimumValue.foreach { v => queryParams += "minimum_value" -> v.toString }if(maximumValue != null) maximumValue.foreach { v => queryParams += "maximum_value" -> v.toString }if(updated != null) updated.foreach { v => queryParams += "updated" -> v.toString }if(multiply != null) multiply.foreach { v => queryParams += "multiply" -> v.toString }if(add != null) add.foreach { v => queryParams += "add" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def unitsPost(body: Option[Unit] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_18], writer: RequestWriter[Unit]): Future[Inline_response_200_18] = {
    // create path and map variables
    val path = (addFmt("/units"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def unitsIdGet(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_18]): Future[Inline_response_200_18] = {
    // create path and map variables
    val path = (addFmt("/units/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def unitsIdPut(id: Integer,
      body: Option[Unit] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Unit]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/units/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def unitsIdDelete(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/units/{id}")
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
