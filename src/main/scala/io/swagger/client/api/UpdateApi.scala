package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_19
import io.swagger.client.model.Update
import io.swagger.client.model.Inline_response_200_20
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class UpdateApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def updatesGet(userId: Option[Integer] = None,
      connectorId: Option[Integer] = None,
      numberOfMeasurements: Option[Integer] = None,
      success: Option[Boolean] = None,
      message: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_19]): Future[Inline_response_200_19] = {
    // create path and map variables
    val path = (addFmt("/updates"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(connectorId != null) connectorId.foreach { v => queryParams += "connector_id" -> v.toString }if(numberOfMeasurements != null) numberOfMeasurements.foreach { v => queryParams += "number_of_measurements" -> v.toString }if(success != null) success.foreach { v => queryParams += "success" -> v.toString }if(message != null) message.foreach { v => queryParams += "message" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def updatesPost(body: Option[Update] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_20], writer: RequestWriter[Update]): Future[Inline_response_200_20] = {
    // create path and map variables
    val path = (addFmt("/updates"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def updatesIdGet(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_20]): Future[Inline_response_200_20] = {
    // create path and map variables
    val path = (addFmt("/updates/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def updatesIdPut(id: Integer,
      body: Option[Update] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Update]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/updates/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def updatesIdDelete(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/updates/{id}")
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
