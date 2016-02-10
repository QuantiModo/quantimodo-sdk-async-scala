package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_17
import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_18
import io.swagger.client.model.Correlation
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class CorrelationApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def correlationsGet(accessToken: Option[String] = None,
      timestamp: Option[Integer] = None,
      userId: Option[Integer] = None,
      correlation: Option[Number] = None,
      causeId: Option[Integer] = None,
      effectId: Option[Integer] = None,
      onsetDelay: Option[Integer] = None,
      durationOfAction: Option[Integer] = None,
      numberOfPairs: Option[Integer] = None,
      valuePredictingHighOutcome: Option[Number] = None,
      valuePredictingLowOutcome: Option[Number] = None,
      optimalPearsonProduct: Option[Number] = None,
      vote: Option[Number] = None,
      statisticalSignificance: Option[Number] = None,
      causeUnit: Option[String] = None,
      causeUnitId: Option[Integer] = None,
      causeChanges: Option[Integer] = None,
      effectChanges: Option[Integer] = None,
      qmScore: Option[Number] = None,
      error: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      reversePearsonCorrelationCoefficient: Option[Number] = None,
      predictivePearsonCorrelationCoefficient: Option[Number] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_17]): Future[Inline_response_200_17] = {
    // create path and map variables
    val path = (addFmt("/correlations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(timestamp != null) timestamp.foreach { v => queryParams += "timestamp" -> v.toString }if(userId != null) userId.foreach { v => queryParams += "user_id" -> v.toString }if(correlation != null) correlation.foreach { v => queryParams += "correlation" -> v.toString }if(causeId != null) causeId.foreach { v => queryParams += "cause_id" -> v.toString }if(effectId != null) effectId.foreach { v => queryParams += "effect_id" -> v.toString }if(onsetDelay != null) onsetDelay.foreach { v => queryParams += "onset_delay" -> v.toString }if(durationOfAction != null) durationOfAction.foreach { v => queryParams += "duration_of_action" -> v.toString }if(numberOfPairs != null) numberOfPairs.foreach { v => queryParams += "number_of_pairs" -> v.toString }if(valuePredictingHighOutcome != null) valuePredictingHighOutcome.foreach { v => queryParams += "value_predicting_high_outcome" -> v.toString }if(valuePredictingLowOutcome != null) valuePredictingLowOutcome.foreach { v => queryParams += "value_predicting_low_outcome" -> v.toString }if(optimalPearsonProduct != null) optimalPearsonProduct.foreach { v => queryParams += "optimal_pearson_product" -> v.toString }if(vote != null) vote.foreach { v => queryParams += "vote" -> v.toString }if(statisticalSignificance != null) statisticalSignificance.foreach { v => queryParams += "statistical_significance" -> v.toString }if(causeUnit != null) causeUnit.foreach { v => queryParams += "cause_unit" -> v.toString }if(causeUnitId != null) causeUnitId.foreach { v => queryParams += "cause_unit_id" -> v.toString }if(causeChanges != null) causeChanges.foreach { v => queryParams += "cause_changes" -> v.toString }if(effectChanges != null) effectChanges.foreach { v => queryParams += "effect_changes" -> v.toString }if(qmScore != null) qmScore.foreach { v => queryParams += "qm_score" -> v.toString }if(error != null) error.foreach { v => queryParams += "error" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(reversePearsonCorrelationCoefficient != null) reversePearsonCorrelationCoefficient.foreach { v => queryParams += "reverse_pearson_correlation_coefficient" -> v.toString }if(predictivePearsonCorrelationCoefficient != null) predictivePearsonCorrelationCoefficient.foreach { v => queryParams += "predictive_pearson_correlation_coefficient" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def correlationsPost(accessToken: Option[String] = None,
      body: Option[Correlation] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_18], writer: RequestWriter[Correlation]): Future[Inline_response_200_18] = {
    // create path and map variables
    val path = (addFmt("/correlations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def correlationsIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_18]): Future[Inline_response_200_18] = {
    // create path and map variables
    val path = (addFmt("/correlations/{id}")
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

  
  def correlationsIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[Correlation] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Correlation]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/correlations/{id}")
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

  
  def correlationsIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/correlations/{id}")
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
