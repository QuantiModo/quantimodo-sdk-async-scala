package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_9
import io.swagger.client.model.Inline_response_200_30
import io.swagger.client.model.UserVariable
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class UserVariableApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def userVariablesGet(accessToken: Option[String] = None,
      clientId: Option[String] = None,
      parentId: Option[Integer] = None,
      variableId: Option[Integer] = None,
      userId: Option[Integer] = None,
      defaultUnitId: Option[Integer] = None,
      minimumAllowedValue: Option[Number] = None,
      maximumAllowedValue: Option[Number] = None,
      fillingValue: Option[Number] = None,
      joinWith: Option[Integer] = None,
      onsetDelay: Option[Integer] = None,
      durationOfAction: Option[Integer] = None,
      variableCategoryId: Option[Integer] = None,
      updated: Option[Integer] = None,
      public: Option[Integer] = None,
      causeOnly: Option[Boolean] = None,
      fillingType: Option[String] = None,
      numberOfMeasurements: Option[Integer] = None,
      numberOfProcessedMeasurements: Option[Integer] = None,
      measurementsAtLastAnalysis: Option[Integer] = None,
      lastUnitId: Option[Integer] = None,
      lastOriginalUnitId: Option[Integer] = None,
      lastOriginalValue: Option[Integer] = None,
      lastValue: Option[Number] = None,
      lastOriginalValue2: Option[Number] = None,
      lastSourceId: Option[Integer] = None,
      numberOfCorrelations: Option[Integer] = None,
      status: Option[String] = None,
      errorMessage: Option[String] = None,
      lastSuccessfulUpdateTime: Option[String] = None,
      standardDeviation: Option[Number] = None,
      variance: Option[Number] = None,
      minimumRecordedValue: Option[Number] = None,
      maximumRecordedValue: Option[Number] = None,
      mean: Option[Number] = None,
      median: Option[Number] = None,
      mostCommonUnitId: Option[Integer] = None,
      mostCommonValue: Option[Number] = None,
      numberOfUniqueDailyValues: Option[Number] = None,
      numberOfChanges: Option[Integer] = None,
      skewness: Option[Number] = None,
      kurtosis: Option[Number] = None,
      latitude: Option[Number] = None,
      longitude: Option[Number] = None,
      location: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      outcome: Option[Boolean] = None,
      sources: Option[String] = None,
      earliestSourceTime: Option[Integer] = None,
      latestSourceTime: Option[Integer] = None,
      earliestMeasurementTime: Option[Integer] = None,
      latestMeasurementTime: Option[Integer] = None,
      earliestFillingTime: Option[Integer] = None,
      latestFillingTime: Option[Integer] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_9]): Future[Inline_response_200_9] = {
    // create path and map variables
    val path = (addFmt("/userVariables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(parentId != null) parentId.foreach { v => queryParams += "parent_id" -> v.toString }if(variableId != null) variableId.foreach { v => queryParams += "variable_id" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(defaultUnitId != null) defaultUnitId.foreach { v => queryParams += "default_unit_id" -> v.toString }if(minimumAllowedValue != null) minimumAllowedValue.foreach { v => queryParams += "minimum_allowed_value" -> v.toString }if(maximumAllowedValue != null) maximumAllowedValue.foreach { v => queryParams += "maximum_allowed_value" -> v.toString }if(fillingValue != null) fillingValue.foreach { v => queryParams += "filling_value" -> v.toString }if(joinWith != null) joinWith.foreach { v => queryParams += "join_with" -> v.toString }if(onsetDelay != null) onsetDelay.foreach { v => queryParams += "onset_delay" -> v.toString }if(durationOfAction != null) durationOfAction.foreach { v => queryParams += "duration_of_action" -> v.toString }if(variableCategoryId != null) variableCategoryId.foreach { v => queryParams += "variable_category_id" -> v.toString }if(updated != null) updated.foreach { v => queryParams += "updated" -> v.toString }if(public != null) public.foreach { v => queryParams += "public" -> v.toString }if(causeOnly != null) causeOnly.foreach { v => queryParams += "cause_only" -> v.toString }if(fillingType != null) fillingType.foreach { v => queryParams += "filling_type" -> v.toString }if(numberOfMeasurements != null) numberOfMeasurements.foreach { v => queryParams += "number_of_measurements" -> v.toString }if(numberOfProcessedMeasurements != null) numberOfProcessedMeasurements.foreach { v => queryParams += "number_of_processed_measurements" -> v.toString }if(measurementsAtLastAnalysis != null) measurementsAtLastAnalysis.foreach { v => queryParams += "measurements_at_last_analysis" -> v.toString }if(lastUnitId != null) lastUnitId.foreach { v => queryParams += "last_unit_id" -> v.toString }if(lastOriginalUnitId != null) lastOriginalUnitId.foreach { v => queryParams += "last_original_unit_id" -> v.toString }if(lastOriginalValue != null) lastOriginalValue.foreach { v => queryParams += "last_original_value" -> v.toString }if(lastValue != null) lastValue.foreach { v => queryParams += "last_value" -> v.toString }if(lastOriginalValue2 != null) lastOriginalValue2.foreach { v => queryParams += "last_original_value" -> v.toString }if(lastSourceId != null) lastSourceId.foreach { v => queryParams += "last_source_id" -> v.toString }if(numberOfCorrelations != null) numberOfCorrelations.foreach { v => queryParams += "number_of_correlations" -> v.toString }if(status != null) status.foreach { v => queryParams += "status" -> v.toString }if(errorMessage != null) errorMessage.foreach { v => queryParams += "error_message" -> v.toString }if(lastSuccessfulUpdateTime != null) lastSuccessfulUpdateTime.foreach { v => queryParams += "last_successful_update_time" -> v.toString }if(standardDeviation != null) standardDeviation.foreach { v => queryParams += "standard_deviation" -> v.toString }if(variance != null) variance.foreach { v => queryParams += "variance" -> v.toString }if(minimumRecordedValue != null) minimumRecordedValue.foreach { v => queryParams += "minimum_recorded_value" -> v.toString }if(maximumRecordedValue != null) maximumRecordedValue.foreach { v => queryParams += "maximum_recorded_value" -> v.toString }if(mean != null) mean.foreach { v => queryParams += "mean" -> v.toString }if(median != null) median.foreach { v => queryParams += "median" -> v.toString }if(mostCommonUnitId != null) mostCommonUnitId.foreach { v => queryParams += "most_common_unit_id" -> v.toString }if(mostCommonValue != null) mostCommonValue.foreach { v => queryParams += "most_common_value" -> v.toString }if(numberOfUniqueDailyValues != null) numberOfUniqueDailyValues.foreach { v => queryParams += "number_of_unique_daily_values" -> v.toString }if(numberOfChanges != null) numberOfChanges.foreach { v => queryParams += "number_of_changes" -> v.toString }if(skewness != null) skewness.foreach { v => queryParams += "skewness" -> v.toString }if(kurtosis != null) kurtosis.foreach { v => queryParams += "kurtosis" -> v.toString }if(latitude != null) latitude.foreach { v => queryParams += "latitude" -> v.toString }if(longitude != null) longitude.foreach { v => queryParams += "longitude" -> v.toString }if(location != null) location.foreach { v => queryParams += "location" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(outcome != null) outcome.foreach { v => queryParams += "outcome" -> v.toString }if(sources != null) sources.foreach { v => queryParams += "sources" -> v.toString }if(earliestSourceTime != null) earliestSourceTime.foreach { v => queryParams += "earliest_source_time" -> v.toString }if(latestSourceTime != null) latestSourceTime.foreach { v => queryParams += "latest_source_time" -> v.toString }if(earliestMeasurementTime != null) earliestMeasurementTime.foreach { v => queryParams += "earliest_measurement_time" -> v.toString }if(latestMeasurementTime != null) latestMeasurementTime.foreach { v => queryParams += "latest_measurement_time" -> v.toString }if(earliestFillingTime != null) earliestFillingTime.foreach { v => queryParams += "earliest_filling_time" -> v.toString }if(latestFillingTime != null) latestFillingTime.foreach { v => queryParams += "latest_filling_time" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def userVariablesPost(accessToken: Option[String] = None,
      body: Option[UserVariable] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_30], writer: RequestWriter[UserVariable]): Future[Inline_response_200_30] = {
    // create path and map variables
    val path = (addFmt("/userVariables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def userVariablesIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_30]): Future[Inline_response_200_30] = {
    // create path and map variables
    val path = (addFmt("/userVariables/{id}")
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

  
  def userVariablesIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[UserVariable] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[UserVariable]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/userVariables/{id}")
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

  
  def userVariablesIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/userVariables/{id}")
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
