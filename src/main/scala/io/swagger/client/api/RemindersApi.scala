package io.swagger.client.api

import io.swagger.client.model.Inline_response_200
import io.swagger.client.model.CommonResponse
import io.swagger.client.model.TrackingReminderNotificationSkip
import io.swagger.client.model.TrackingReminderNotificationSnooze
import io.swagger.client.model.TrackingReminderNotificationTrack
import io.swagger.client.model.TrackingReminderDelete
import io.swagger.client.model.Inline_response_200_1
import io.swagger.client.model.TrackingReminder
import io.swagger.client.model.Inline_response_200_2
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class RemindersApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v1TrackingReminderNotificationsGet(accessToken: Option[String] = None,
      variableCategoryName: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200]): Future[Inline_response_200] = {
    // create path and map variables
    val path = (addFmt("/v1/trackingReminderNotifications"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (variableCategoryName != null) variableCategoryName.foreach { v => queryParams += "variableCategoryName" -> v.toString }

    if (createdAt != null) createdAt.foreach { v => queryParams += "createdAt" -> v.toString }

    if (updatedAt != null) updatedAt.foreach { v => queryParams += "updatedAt" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1TrackingReminderNotificationsSkipPost(body: TrackingReminderNotificationSkip,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[CommonResponse], writer: RequestWriter[TrackingReminderNotificationSkip]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/trackingReminderNotifications/skip"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling RemindersApi->v1TrackingReminderNotificationsSkipPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1TrackingReminderNotificationsSnoozePost(body: TrackingReminderNotificationSnooze,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[CommonResponse], writer: RequestWriter[TrackingReminderNotificationSnooze]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/trackingReminderNotifications/snooze"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling RemindersApi->v1TrackingReminderNotificationsSnoozePost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1TrackingReminderNotificationsTrackPost(body: TrackingReminderNotificationTrack,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[CommonResponse], writer: RequestWriter[TrackingReminderNotificationTrack]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/trackingReminderNotifications/track"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling RemindersApi->v1TrackingReminderNotificationsTrackPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1TrackingRemindersDeletePost(body: TrackingReminderDelete,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[CommonResponse], writer: RequestWriter[TrackingReminderDelete]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/trackingReminders/delete"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling RemindersApi->v1TrackingRemindersDeletePost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1TrackingRemindersGet(accessToken: Option[String] = None,
      variableCategoryName: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_1]): Future[Inline_response_200_1] = {
    // create path and map variables
    val path = (addFmt("/v1/trackingReminders"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (variableCategoryName != null) variableCategoryName.foreach { v => queryParams += "variableCategoryName" -> v.toString }

    if (createdAt != null) createdAt.foreach { v => queryParams += "createdAt" -> v.toString }

    if (updatedAt != null) updatedAt.foreach { v => queryParams += "updatedAt" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1TrackingRemindersPost(accessToken: Option[String] = None,
      body: Option[TrackingReminder] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[TrackingReminder]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/v1/trackingReminders"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
