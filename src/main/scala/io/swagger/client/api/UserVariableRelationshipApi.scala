package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_24
import io.swagger.client.model.UserVariableRelationship
import io.swagger.client.model.Inline_response_200_25
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class UserVariableRelationshipApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def userVariableRelationshipsGet(accessToken: Option[String] = None,
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
      userId: Option[Integer] = None,
      vote: Option[String] = None,
      valuePredictingHighOutcome: Option[Number] = None,
      valuePredictingLowOutcome: Option[Number] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_24]): Future[Inline_response_200_24] = {
    // create path and map variables
    val path = (addFmt("/userVariableRelationships"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(id != null) id.foreach { v => queryParams += "id" -> v.toString }if(confidenceLevel != null) confidenceLevel.foreach { v => queryParams += "confidence_level" -> v.toString }if(confidenceScore != null) confidenceScore.foreach { v => queryParams += "confidence_score" -> v.toString }if(direction != null) direction.foreach { v => queryParams += "direction" -> v.toString }if(durationOfAction != null) durationOfAction.foreach { v => queryParams += "duration_of_action" -> v.toString }if(errorMessage != null) errorMessage.foreach { v => queryParams += "error_message" -> v.toString }if(onsetDelay != null) onsetDelay.foreach { v => queryParams += "onset_delay" -> v.toString }if(outcomeVariableId != null) outcomeVariableId.foreach { v => queryParams += "outcome_variable_id" -> v.toString }if(predictorVariableId != null) predictorVariableId.foreach { v => queryParams += "predictor_variable_id" -> v.toString }if(predictorUnitId != null) predictorUnitId.foreach { v => queryParams += "predictor_unit_id" -> v.toString }if(sinnRank != null) sinnRank.foreach { v => queryParams += "sinn_rank" -> v.toString }if(strengthLevel != null) strengthLevel.foreach { v => queryParams += "strength_level" -> v.toString }if(strengthScore != null) strengthScore.foreach { v => queryParams += "strength_score" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(vote != null) vote.foreach { v => queryParams += "vote" -> v.toString }if(valuePredictingHighOutcome != null) valuePredictingHighOutcome.foreach { v => queryParams += "value_predicting_high_outcome" -> v.toString }if(valuePredictingLowOutcome != null) valuePredictingLowOutcome.foreach { v => queryParams += "value_predicting_low_outcome" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def userVariableRelationshipsPost(accessToken: Option[String] = None,
      body: Option[UserVariableRelationship] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_25], writer: RequestWriter[UserVariableRelationship]): Future[Inline_response_200_25] = {
    // create path and map variables
    val path = (addFmt("/userVariableRelationships"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def userVariableRelationshipsIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_25]): Future[Inline_response_200_25] = {
    // create path and map variables
    val path = (addFmt("/userVariableRelationships/{id}")
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

  
  def userVariableRelationshipsIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[UserVariableRelationship] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[UserVariableRelationship]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/userVariableRelationships/{id}")
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

  
  def userVariableRelationshipsIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/userVariableRelationships/{id}")
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
