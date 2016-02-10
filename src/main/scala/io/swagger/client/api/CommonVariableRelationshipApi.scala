package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_12
import io.swagger.client.model.Inline_response_200_13
import io.swagger.client.model.CommonVariableRelationship
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class CommonVariableRelationshipApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def commonVariableRelationshipsGet(accessToken: Option[String] = None,
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
      strengthScore: Option[Number] = None,
      strengthLevel: Option[String] = None,
      upVotes: Option[Integer] = None,
      downVotes: Option[Integer] = None,
      valuePredictingHighOutcome: Option[Number] = None,
      valuePredictingLowOutcome: Option[Number] = None,
      numberOfUsers: Option[Integer] = None,
      dataSource: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_12]): Future[Inline_response_200_12] = {
    // create path and map variables
    val path = (addFmt("/commonVariableRelationships"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(id != null) id.foreach { v => queryParams += "id" -> v.toString }if(confidenceLevel != null) confidenceLevel.foreach { v => queryParams += "confidence_level" -> v.toString }if(confidenceScore != null) confidenceScore.foreach { v => queryParams += "confidence_score" -> v.toString }if(direction != null) direction.foreach { v => queryParams += "direction" -> v.toString }if(durationOfAction != null) durationOfAction.foreach { v => queryParams += "duration_of_action" -> v.toString }if(errorMessage != null) errorMessage.foreach { v => queryParams += "error_message" -> v.toString }if(onsetDelay != null) onsetDelay.foreach { v => queryParams += "onset_delay" -> v.toString }if(outcomeVariableId != null) outcomeVariableId.foreach { v => queryParams += "outcome_variable_id" -> v.toString }if(predictorVariableId != null) predictorVariableId.foreach { v => queryParams += "predictor_variable_id" -> v.toString }if(predictorUnitId != null) predictorUnitId.foreach { v => queryParams += "predictor_unit_id" -> v.toString }if(sinnRank != null) sinnRank.foreach { v => queryParams += "sinn_rank" -> v.toString }if(strengthScore != null) strengthScore.foreach { v => queryParams += "strength_score" -> v.toString }if(strengthLevel != null) strengthLevel.foreach { v => queryParams += "strength_level" -> v.toString }if(upVotes != null) upVotes.foreach { v => queryParams += "up_votes" -> v.toString }if(downVotes != null) downVotes.foreach { v => queryParams += "down_votes" -> v.toString }if(valuePredictingHighOutcome != null) valuePredictingHighOutcome.foreach { v => queryParams += "value_predicting_high_outcome" -> v.toString }if(valuePredictingLowOutcome != null) valuePredictingLowOutcome.foreach { v => queryParams += "value_predicting_low_outcome" -> v.toString }if(numberOfUsers != null) numberOfUsers.foreach { v => queryParams += "number_of_users" -> v.toString }if(dataSource != null) dataSource.foreach { v => queryParams += "data_source" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def commonVariableRelationshipsPost(accessToken: Option[String] = None,
      body: Option[CommonVariableRelationship] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_13], writer: RequestWriter[CommonVariableRelationship]): Future[Inline_response_200_13] = {
    // create path and map variables
    val path = (addFmt("/commonVariableRelationships"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def commonVariableRelationshipsIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_13]): Future[Inline_response_200_13] = {
    // create path and map variables
    val path = (addFmt("/commonVariableRelationships/{id}")
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

  
  def commonVariableRelationshipsIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[CommonVariableRelationship] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[CommonVariableRelationship]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/commonVariableRelationships/{id}")
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

  
  def commonVariableRelationshipsIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/commonVariableRelationships/{id}")
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
