package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_6
import io.swagger.client.model.TrackingReminder
import io.swagger.client.model.Inline_response_200_23
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class TrackingReminderApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def trackingRemindersGet(accessToken: Option[String] = None,
      clientId: Option[String] = None,
      userId: Option[Integer] = None,
      variableId: Option[Integer] = None,
      popUp: Option[Boolean] = None,
      sms: Option[Boolean] = None,
      email: Option[Boolean] = None,
      notificationBar: Option[Boolean] = None,
      lastReminded: Option[String] = None,
      lastTracked: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_6]): Future[Inline_response_200_6] = {
    // create path and map variables
    val path = (addFmt("/trackingReminders"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(variableId != null) variableId.foreach { v => queryParams += "variable_id" -> v.toString }if(popUp != null) popUp.foreach { v => queryParams += "pop_up" -> v.toString }if(sms != null) sms.foreach { v => queryParams += "sms" -> v.toString }if(email != null) email.foreach { v => queryParams += "email" -> v.toString }if(notificationBar != null) notificationBar.foreach { v => queryParams += "notification_bar" -> v.toString }if(lastReminded != null) lastReminded.foreach { v => queryParams += "last_reminded" -> v.toString }if(lastTracked != null) lastTracked.foreach { v => queryParams += "last_tracked" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def trackingRemindersPost(accessToken: Option[String] = None,
      body: Option[TrackingReminder] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_23], writer: RequestWriter[TrackingReminder]): Future[Inline_response_200_23] = {
    // create path and map variables
    val path = (addFmt("/trackingReminders"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def trackingRemindersIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_23]): Future[Inline_response_200_23] = {
    // create path and map variables
    val path = (addFmt("/trackingReminders/{id}")
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

  
  def trackingRemindersIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[TrackingReminder] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[TrackingReminder]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/trackingReminders/{id}")
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

  
  def trackingRemindersIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/trackingReminders/{id}")
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
