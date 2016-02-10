package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_3
import io.swagger.client.model.Inline_response_200_4
import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_5
import io.swagger.client.model.Inline_response_200_6
import io.swagger.client.model.Inline_response_200_7
import io.swagger.client.model.Inline_response_200_8
import io.swagger.client.model.Inline_response_200_9
import io.swagger.client.model.Inline_response_200_10
import io.swagger.client.model.Inline_response_200_11
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class ApplicationEndpointsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def applicationConnectionsGet(accessToken: Option[String] = None,
      connectorId: Option[Integer] = None,
      connectStatus: Option[String] = None,
      connectError: Option[String] = None,
      updateRequestedAt: Option[String] = None,
      updateStatus: Option[String] = None,
      updateError: Option[String] = None,
      lastSuccessfulUpdatedAt: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_3]): Future[Inline_response_200_3] = {
    // create path and map variables
    val path = (addFmt("/application/connections"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(connectorId != null) connectorId.foreach { v => queryParams += "connector_id" -> v.toString }if(connectStatus != null) connectStatus.foreach { v => queryParams += "connect_status" -> v.toString }if(connectError != null) connectError.foreach { v => queryParams += "connect_error" -> v.toString }if(updateRequestedAt != null) updateRequestedAt.foreach { v => queryParams += "update_requested_at" -> v.toString }if(updateStatus != null) updateStatus.foreach { v => queryParams += "update_status" -> v.toString }if(updateError != null) updateError.foreach { v => queryParams += "update_error" -> v.toString }if(lastSuccessfulUpdatedAt != null) lastSuccessfulUpdatedAt.foreach { v => queryParams += "last_successful_updated_at" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def applicationCredentialsGet(accessToken: Option[String] = None,
      connectorId: Option[Integer] = None,
      attrKey: Option[String] = None,
      attrValue: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_4]): Future[Inline_response_200_4] = {
    // create path and map variables
    val path = (addFmt("/application/credentials"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(connectorId != null) connectorId.foreach { v => queryParams += "connector_id" -> v.toString }if(attrKey != null) attrKey.foreach { v => queryParams += "attr_key" -> v.toString }if(attrValue != null) attrValue.foreach { v => queryParams += "attr_value" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def applicationMeasurementsGet(accessToken: Option[String] = None,
      clientId: Option[String] = None,
      connectorId: Option[Integer] = None,
      variableId: Option[Integer] = None,
      sourceId: Option[Integer] = None,
      startTime: Option[String] = None,
      value: Option[Number] = None,
      unitId: Option[Integer] = None,
      originalValue: Option[Number] = None,
      originalUnitId: Option[Integer] = None,
      duration: Option[Integer] = None,
      note: Option[String] = None,
      latitude: Option[Number] = None,
      longitude: Option[Number] = None,
      location: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      error: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_5]): Future[Inline_response_200_5] = {
    // create path and map variables
    val path = (addFmt("/application/measurements"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(connectorId != null) connectorId.foreach { v => queryParams += "connector_id" -> v.toString }if(variableId != null) variableId.foreach { v => queryParams += "variable_id" -> v.toString }if(sourceId != null) sourceId.foreach { v => queryParams += "source_id" -> v.toString }if(startTime != null) startTime.foreach { v => queryParams += "start_time" -> v.toString }if(value != null) value.foreach { v => queryParams += "value" -> v.toString }if(unitId != null) unitId.foreach { v => queryParams += "unit_id" -> v.toString }if(originalValue != null) originalValue.foreach { v => queryParams += "original_value" -> v.toString }if(originalUnitId != null) originalUnitId.foreach { v => queryParams += "original_unit_id" -> v.toString }if(duration != null) duration.foreach { v => queryParams += "duration" -> v.toString }if(note != null) note.foreach { v => queryParams += "note" -> v.toString }if(latitude != null) latitude.foreach { v => queryParams += "latitude" -> v.toString }if(longitude != null) longitude.foreach { v => queryParams += "longitude" -> v.toString }if(location != null) location.foreach { v => queryParams += "location" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(error != null) error.foreach { v => queryParams += "error" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def applicationTrackingRemindersGet(accessToken: Option[String] = None,
      clientId: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_6]): Future[Inline_response_200_6] = {
    // create path and map variables
    val path = (addFmt("/application/trackingReminders"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def applicationUpdatesGet(accessToken: Option[String] = None,
      connectorId: Option[Integer] = None,
      numberOfMeasurements: Option[Integer] = None,
      success: Option[Boolean] = None,
      message: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_7]): Future[Inline_response_200_7] = {
    // create path and map variables
    val path = (addFmt("/application/updates"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(connectorId != null) connectorId.foreach { v => queryParams += "connector_id" -> v.toString }if(numberOfMeasurements != null) numberOfMeasurements.foreach { v => queryParams += "number_of_measurements" -> v.toString }if(success != null) success.foreach { v => queryParams += "success" -> v.toString }if(message != null) message.foreach { v => queryParams += "message" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def applicationUserVariableRelationshipsGet(accessToken: Option[String] = None,
      id: Option[Integer] = None,
      confidenceLevel: Option[String] = None,
      confidenceScore: Option[Number] = None,
      direction: Option[String] = None,
      durationOfAction: Option[Integer] = None,
      errorMessage: Option[String] = None,
      onsetDelay: Option[Integer] = None,
      outcomeVariableId: Option[Integer] = None,
      predictorVariableId: Option[Integer] = None,
      predictorUnitId: Option[Integer] = None,
      sinnRank: Option[Number] = None,
      strengthLevel: Option[String] = None,
      strengthScore: Option[Number] = None,
      vote: Option[String] = None,
      valuePredictingHighOutcome: Option[Number] = None,
      valuePredictingLowOutcome: Option[Number] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_8]): Future[Inline_response_200_8] = {
    // create path and map variables
    val path = (addFmt("/application/userVariableRelationships"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(id != null) id.foreach { v => queryParams += "id" -> v.toString }if(confidenceLevel != null) confidenceLevel.foreach { v => queryParams += "confidence_level" -> v.toString }if(confidenceScore != null) confidenceScore.foreach { v => queryParams += "confidence_score" -> v.toString }if(direction != null) direction.foreach { v => queryParams += "direction" -> v.toString }if(durationOfAction != null) durationOfAction.foreach { v => queryParams += "duration_of_action" -> v.toString }if(errorMessage != null) errorMessage.foreach { v => queryParams += "error_message" -> v.toString }if(onsetDelay != null) onsetDelay.foreach { v => queryParams += "onset_delay" -> v.toString }if(outcomeVariableId != null) outcomeVariableId.foreach { v => queryParams += "outcome_variable_id" -> v.toString }if(predictorVariableId != null) predictorVariableId.foreach { v => queryParams += "predictor_variable_id" -> v.toString }if(predictorUnitId != null) predictorUnitId.foreach { v => queryParams += "predictor_unit_id" -> v.toString }if(sinnRank != null) sinnRank.foreach { v => queryParams += "sinn_rank" -> v.toString }if(strengthLevel != null) strengthLevel.foreach { v => queryParams += "strength_level" -> v.toString }if(strengthScore != null) strengthScore.foreach { v => queryParams += "strength_score" -> v.toString }if(vote != null) vote.foreach { v => queryParams += "vote" -> v.toString }if(valuePredictingHighOutcome != null) valuePredictingHighOutcome.foreach { v => queryParams += "value_predicting_high_outcome" -> v.toString }if(valuePredictingLowOutcome != null) valuePredictingLowOutcome.foreach { v => queryParams += "value_predicting_low_outcome" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def applicationUserVariablesGet(accessToken: Option[String] = None,
      clientId: Option[String] = None,
      parentId: Option[Integer] = None,
      variableId: Option[Integer] = None,
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
    val path = (addFmt("/application/userVariables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(parentId != null) parentId.foreach { v => queryParams += "parent_id" -> v.toString }if(variableId != null) variableId.foreach { v => queryParams += "variable_id" -> v.toString }if(defaultUnitId != null) defaultUnitId.foreach { v => queryParams += "default_unit_id" -> v.toString }if(minimumAllowedValue != null) minimumAllowedValue.foreach { v => queryParams += "minimum_allowed_value" -> v.toString }if(maximumAllowedValue != null) maximumAllowedValue.foreach { v => queryParams += "maximum_allowed_value" -> v.toString }if(fillingValue != null) fillingValue.foreach { v => queryParams += "filling_value" -> v.toString }if(joinWith != null) joinWith.foreach { v => queryParams += "join_with" -> v.toString }if(onsetDelay != null) onsetDelay.foreach { v => queryParams += "onset_delay" -> v.toString }if(durationOfAction != null) durationOfAction.foreach { v => queryParams += "duration_of_action" -> v.toString }if(variableCategoryId != null) variableCategoryId.foreach { v => queryParams += "variable_category_id" -> v.toString }if(updated != null) updated.foreach { v => queryParams += "updated" -> v.toString }if(public != null) public.foreach { v => queryParams += "public" -> v.toString }if(causeOnly != null) causeOnly.foreach { v => queryParams += "cause_only" -> v.toString }if(fillingType != null) fillingType.foreach { v => queryParams += "filling_type" -> v.toString }if(numberOfMeasurements != null) numberOfMeasurements.foreach { v => queryParams += "number_of_measurements" -> v.toString }if(numberOfProcessedMeasurements != null) numberOfProcessedMeasurements.foreach { v => queryParams += "number_of_processed_measurements" -> v.toString }if(measurementsAtLastAnalysis != null) measurementsAtLastAnalysis.foreach { v => queryParams += "measurements_at_last_analysis" -> v.toString }if(lastUnitId != null) lastUnitId.foreach { v => queryParams += "last_unit_id" -> v.toString }if(lastOriginalUnitId != null) lastOriginalUnitId.foreach { v => queryParams += "last_original_unit_id" -> v.toString }if(lastOriginalValue != null) lastOriginalValue.foreach { v => queryParams += "last_original_value" -> v.toString }if(lastValue != null) lastValue.foreach { v => queryParams += "last_value" -> v.toString }if(lastOriginalValue2 != null) lastOriginalValue2.foreach { v => queryParams += "last_original_value" -> v.toString }if(lastSourceId != null) lastSourceId.foreach { v => queryParams += "last_source_id" -> v.toString }if(numberOfCorrelations != null) numberOfCorrelations.foreach { v => queryParams += "number_of_correlations" -> v.toString }if(status != null) status.foreach { v => queryParams += "status" -> v.toString }if(errorMessage != null) errorMessage.foreach { v => queryParams += "error_message" -> v.toString }if(lastSuccessfulUpdateTime != null) lastSuccessfulUpdateTime.foreach { v => queryParams += "last_successful_update_time" -> v.toString }if(standardDeviation != null) standardDeviation.foreach { v => queryParams += "standard_deviation" -> v.toString }if(variance != null) variance.foreach { v => queryParams += "variance" -> v.toString }if(minimumRecordedValue != null) minimumRecordedValue.foreach { v => queryParams += "minimum_recorded_value" -> v.toString }if(maximumRecordedValue != null) maximumRecordedValue.foreach { v => queryParams += "maximum_recorded_value" -> v.toString }if(mean != null) mean.foreach { v => queryParams += "mean" -> v.toString }if(median != null) median.foreach { v => queryParams += "median" -> v.toString }if(mostCommonUnitId != null) mostCommonUnitId.foreach { v => queryParams += "most_common_unit_id" -> v.toString }if(mostCommonValue != null) mostCommonValue.foreach { v => queryParams += "most_common_value" -> v.toString }if(numberOfUniqueDailyValues != null) numberOfUniqueDailyValues.foreach { v => queryParams += "number_of_unique_daily_values" -> v.toString }if(numberOfChanges != null) numberOfChanges.foreach { v => queryParams += "number_of_changes" -> v.toString }if(skewness != null) skewness.foreach { v => queryParams += "skewness" -> v.toString }if(kurtosis != null) kurtosis.foreach { v => queryParams += "kurtosis" -> v.toString }if(latitude != null) latitude.foreach { v => queryParams += "latitude" -> v.toString }if(longitude != null) longitude.foreach { v => queryParams += "longitude" -> v.toString }if(location != null) location.foreach { v => queryParams += "location" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(outcome != null) outcome.foreach { v => queryParams += "outcome" -> v.toString }if(sources != null) sources.foreach { v => queryParams += "sources" -> v.toString }if(earliestSourceTime != null) earliestSourceTime.foreach { v => queryParams += "earliest_source_time" -> v.toString }if(latestSourceTime != null) latestSourceTime.foreach { v => queryParams += "latest_source_time" -> v.toString }if(earliestMeasurementTime != null) earliestMeasurementTime.foreach { v => queryParams += "earliest_measurement_time" -> v.toString }if(latestMeasurementTime != null) latestMeasurementTime.foreach { v => queryParams += "latest_measurement_time" -> v.toString }if(earliestFillingTime != null) earliestFillingTime.foreach { v => queryParams += "earliest_filling_time" -> v.toString }if(latestFillingTime != null) latestFillingTime.foreach { v => queryParams += "latest_filling_time" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def applicationVariableUserSourcesGet(accessToken: Option[String] = None,
      variableId: Option[Integer] = None,
      timestamp: Option[Integer] = None,
      earliestMeasurementTime: Option[Integer] = None,
      latestMeasurementTime: Option[Integer] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_10]): Future[Inline_response_200_10] = {
    // create path and map variables
    val path = (addFmt("/application/variableUserSources"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(variableId != null) variableId.foreach { v => queryParams += "variable_id" -> v.toString }if(timestamp != null) timestamp.foreach { v => queryParams += "timestamp" -> v.toString }if(earliestMeasurementTime != null) earliestMeasurementTime.foreach { v => queryParams += "earliest_measurement_time" -> v.toString }if(latestMeasurementTime != null) latestMeasurementTime.foreach { v => queryParams += "latest_measurement_time" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def applicationVotesGet(accessToken: Option[String] = None,
      clientId: Option[String] = None,
      causeId: Option[Integer] = None,
      effectId: Option[Integer] = None,
      value: Option[Integer] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_11]): Future[Inline_response_200_11] = {
    // create path and map variables
    val path = (addFmt("/application/votes"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(causeId != null) causeId.foreach { v => queryParams += "cause_id" -> v.toString }if(effectId != null) effectId.foreach { v => queryParams += "effect_id" -> v.toString }if(value != null) value.foreach { v => queryParams += "value" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
