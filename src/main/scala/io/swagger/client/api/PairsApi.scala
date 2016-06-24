package io.swagger.client.api

import io.swagger.client.model.Pairs
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class PairsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v1PairsCsvGet(cause: String,
      effect: String,
      accessToken: Option[String] = None,
      causeSource: Option[String] = None,
      causeUnit: Option[String] = None,
      delay: Option[String] = None,
      duration: Option[String] = None,
      effectSource: Option[String] = None,
      effectUnit: Option[String] = None,
      endTime: Option[String] = None,
      startTime: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[List[Pairs]]): Future[List[Pairs]] = {
    // create path and map variables
    val path = (addFmt("/v1/pairsCsv"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (cause != null) queryParams += "cause" -> cause.toString

    if (causeSource != null) causeSource.foreach { v => queryParams += "causeSource" -> v.toString }

    if (causeUnit != null) causeUnit.foreach { v => queryParams += "causeUnit" -> v.toString }

    if (delay != null) delay.foreach { v => queryParams += "delay" -> v.toString }

    if (duration != null) duration.foreach { v => queryParams += "duration" -> v.toString }

    if (effect != null) queryParams += "effect" -> effect.toString

    if (effectSource != null) effectSource.foreach { v => queryParams += "effectSource" -> v.toString }

    if (effectUnit != null) effectUnit.foreach { v => queryParams += "effectUnit" -> v.toString }

    if (endTime != null) endTime.foreach { v => queryParams += "endTime" -> v.toString }

    if (startTime != null) startTime.foreach { v => queryParams += "startTime" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1PairsGet(cause: String,
      effect: String,
      accessToken: Option[String] = None,
      causeSource: Option[String] = None,
      causeUnit: Option[String] = None,
      delay: Option[String] = None,
      duration: Option[String] = None,
      effectSource: Option[String] = None,
      effectUnit: Option[String] = None,
      endTime: Option[String] = None,
      startTime: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[List[Pairs]]): Future[List[Pairs]] = {
    // create path and map variables
    val path = (addFmt("/v1/pairs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (cause != null) queryParams += "cause" -> cause.toString

    if (causeSource != null) causeSource.foreach { v => queryParams += "causeSource" -> v.toString }

    if (causeUnit != null) causeUnit.foreach { v => queryParams += "causeUnit" -> v.toString }

    if (delay != null) delay.foreach { v => queryParams += "delay" -> v.toString }

    if (duration != null) duration.foreach { v => queryParams += "duration" -> v.toString }

    if (effect != null) queryParams += "effect" -> effect.toString

    if (effectSource != null) effectSource.foreach { v => queryParams += "effectSource" -> v.toString }

    if (effectUnit != null) effectUnit.foreach { v => queryParams += "effectUnit" -> v.toString }

    if (endTime != null) endTime.foreach { v => queryParams += "endTime" -> v.toString }

    if (startTime != null) startTime.foreach { v => queryParams += "startTime" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
