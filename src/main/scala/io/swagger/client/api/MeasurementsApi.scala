package io.swagger.client.api

import io.swagger.client.model.MeasurementSource
import io.swagger.client.model.Measurement
import io.swagger.client.model.MeasurementDelete
import io.swagger.client.model.CommonResponse
import io.swagger.client.model.MeasurementSet
import io.swagger.client.model.MeasurementRange
import java.io.File
import io.swagger.client.model.Inline_response_200_12
import io.swagger.client.model.Inline_response_200_11
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class MeasurementsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v1MeasurementSourcesGet()(implicit reader: ClientResponseReader[MeasurementSource]): Future[MeasurementSource] = {
    // create path and map variables
    val path = (addFmt("/v1/measurementSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1MeasurementSourcesPost(body: MeasurementSource,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[MeasurementSource]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/measurementSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling MeasurementsApi->v1MeasurementSourcesPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1MeasurementsDailyGet(variableName: String,
      accessToken: Option[String] = None,
      abbreviatedUnitName: Option[String] = None,
      startTime: Option[String] = None,
      endTime: Option[String] = None,
      groupingWidth: Option[Integer] = None,
      groupingTimezone: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Measurement]): Future[Measurement] = {
    // create path and map variables
    val path = (addFmt("/v1/measurements/daily"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (variableName != null) queryParams += "variableName" -> variableName.toString

    if (abbreviatedUnitName != null) abbreviatedUnitName.foreach { v => queryParams += "abbreviatedUnitName" -> v.toString }

    if (startTime != null) startTime.foreach { v => queryParams += "startTime" -> v.toString }

    if (endTime != null) endTime.foreach { v => queryParams += "endTime" -> v.toString }

    if (groupingWidth != null) groupingWidth.foreach { v => queryParams += "groupingWidth" -> v.toString }

    if (groupingTimezone != null) groupingTimezone.foreach { v => queryParams += "groupingTimezone" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1MeasurementsDeletePost(body: MeasurementDelete)(implicit reader: ClientResponseReader[CommonResponse], writer: RequestWriter[MeasurementDelete]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/measurements/delete"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling MeasurementsApi->v1MeasurementsDeletePost")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1MeasurementsGet(accessToken: Option[String] = None,
      variableName: Option[String] = None,
      variableCategoryName: Option[String] = None,
      source: Option[String] = None,
      value: Option[String] = None,
      lastUpdated: Option[String] = None,
      unit: Option[String] = None,
      startTime: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      endTime: Option[String] = None,
      groupingWidth: Option[Integer] = None,
      groupingTimezone: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Measurement]): Future[Measurement] = {
    // create path and map variables
    val path = (addFmt("/v1/measurements"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (variableName != null) variableName.foreach { v => queryParams += "variableName" -> v.toString }

    if (variableCategoryName != null) variableCategoryName.foreach { v => queryParams += "variableCategoryName" -> v.toString }

    if (source != null) source.foreach { v => queryParams += "source" -> v.toString }

    if (value != null) value.foreach { v => queryParams += "value" -> v.toString }

    if (lastUpdated != null) lastUpdated.foreach { v => queryParams += "lastUpdated" -> v.toString }

    if (unit != null) unit.foreach { v => queryParams += "unit" -> v.toString }

    if (startTime != null) startTime.foreach { v => queryParams += "startTime" -> v.toString }

    if (createdAt != null) createdAt.foreach { v => queryParams += "createdAt" -> v.toString }

    if (updatedAt != null) updatedAt.foreach { v => queryParams += "updatedAt" -> v.toString }

    if (endTime != null) endTime.foreach { v => queryParams += "endTime" -> v.toString }

    if (groupingWidth != null) groupingWidth.foreach { v => queryParams += "groupingWidth" -> v.toString }

    if (groupingTimezone != null) groupingTimezone.foreach { v => queryParams += "groupingTimezone" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1MeasurementsPost(body: MeasurementSet,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[MeasurementSet]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/measurements"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling MeasurementsApi->v1MeasurementsPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1MeasurementsRangeGet(sources: Option[String] = None,
      user: Option[Integer] = None
      )(implicit reader: ClientResponseReader[MeasurementRange]): Future[MeasurementRange] = {
    // create path and map variables
    val path = (addFmt("/v1/measurementsRange"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (sources != null) sources.foreach { v => queryParams += "sources" -> v.toString }

    if (user != null) user.foreach { v => queryParams += "user" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2MeasurementsCsvGet(accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[File]): Future[File] = {
    // create path and map variables
    val path = (addFmt("/v2/measurements/csv"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2MeasurementsIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_12]): Future[Inline_response_200_12] = {
    // create path and map variables
    val path = (addFmt("/v2/measurements/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2MeasurementsIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_11]): Future[Inline_response_200_11] = {
    // create path and map variables
    val path = (addFmt("/v2/measurements/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2MeasurementsIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[Measurement] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_12], writer: RequestWriter[Measurement]): Future[Inline_response_200_12] = {
    // create path and map variables
    val path = (addFmt("/v2/measurements/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2MeasurementsRequestCsvPost(accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Integer]): Future[Integer] = {
    // create path and map variables
    val path = (addFmt("/v2/measurements/request_csv"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2MeasurementsRequestPdfPost(accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Integer]): Future[Integer] = {
    // create path and map variables
    val path = (addFmt("/v2/measurements/request_pdf"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2MeasurementsRequestXlsPost(accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Integer]): Future[Integer] = {
    // create path and map variables
    val path = (addFmt("/v2/measurements/request_xls"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
