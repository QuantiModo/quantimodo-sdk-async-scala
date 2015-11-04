package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_29
import io.swagger.client.model.Vote
import io.swagger.client.model.Inline_response_200_30
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class VoteApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def votesGet(clientId: Option[String] = None,
      userId: Option[Integer] = None,
      causeId: Option[Integer] = None,
      effectId: Option[Integer] = None,
      value: Option[Integer] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_29]): Future[Inline_response_200_29] = {
    // create path and map variables
    val path = (addFmt("/votes"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(causeId != null) causeId.foreach { v => queryParams += "cause_id" -> v.toString }if(effectId != null) effectId.foreach { v => queryParams += "effect_id" -> v.toString }if(value != null) value.foreach { v => queryParams += "value" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def votesPost(body: Option[Vote] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_30], writer: RequestWriter[Vote]): Future[Inline_response_200_30] = {
    // create path and map variables
    val path = (addFmt("/votes"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def votesIdGet(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_30]): Future[Inline_response_200_30] = {
    // create path and map variables
    val path = (addFmt("/votes/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def votesIdPut(id: Integer,
      body: Option[Vote] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Vote]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/votes/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def votesIdDelete(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/votes/{id}")
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
