package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200
import io.swagger.client.model.Inline_response_200_1
import io.swagger.client.model.AggregatedCorrelation
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class AggregatedCorrelationApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def aggregatedCorrelationsGet(correlation: Option[Number] = None,
      causeId: Option[Integer] = None,
      effectId: Option[Integer] = None,
      onsetDelay: Option[Integer] = None,
      durationOfAction: Option[Integer] = None,
      numberOfPairs: Option[Integer] = None,
      valuePredictingHighOutcome: Option[Number] = None,
      valuePredictingLowOutcome: Option[Number] = None,
      optimalPearsonProduct: Option[Number] = None,
      vote: Option[Number] = None,
      numberOfUsers: Option[Integer] = None,
      numberOfCorrelations: Option[Integer] = None,
      statisticalSignificance: Option[Number] = None,
      causeUnit: Option[String] = None,
      causeUnitId: Option[Integer] = None,
      causeChanges: Option[Integer] = None,
      effectChanges: Option[Integer] = None,
      aggregateQmScore: Option[Number] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      status: Option[String] = None,
      errorMessage: Option[String] = None,
      lastSuccessfulUpdateTime: Option[String] = None,
      reversePearsonCorrelationCoefficient: Option[Number] = None,
      predictivePearsonCorrelationCoefficient: Option[Number] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200]): Future[Inline_response_200] = {
    // create path and map variables
    val path = (addFmt("/aggregatedCorrelations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(correlation != null) correlation.foreach { v => queryParams += "correlation" -> v.toString }if(causeId != null) causeId.foreach { v => queryParams += "cause_id" -> v.toString }if(effectId != null) effectId.foreach { v => queryParams += "effect_id" -> v.toString }if(onsetDelay != null) onsetDelay.foreach { v => queryParams += "onset_delay" -> v.toString }if(durationOfAction != null) durationOfAction.foreach { v => queryParams += "duration_of_action" -> v.toString }if(numberOfPairs != null) numberOfPairs.foreach { v => queryParams += "number_of_pairs" -> v.toString }if(valuePredictingHighOutcome != null) valuePredictingHighOutcome.foreach { v => queryParams += "value_predicting_high_outcome" -> v.toString }if(valuePredictingLowOutcome != null) valuePredictingLowOutcome.foreach { v => queryParams += "value_predicting_low_outcome" -> v.toString }if(optimalPearsonProduct != null) optimalPearsonProduct.foreach { v => queryParams += "optimal_pearson_product" -> v.toString }if(vote != null) vote.foreach { v => queryParams += "vote" -> v.toString }if(numberOfUsers != null) numberOfUsers.foreach { v => queryParams += "number_of_users" -> v.toString }if(numberOfCorrelations != null) numberOfCorrelations.foreach { v => queryParams += "number_of_correlations" -> v.toString }if(statisticalSignificance != null) statisticalSignificance.foreach { v => queryParams += "statistical_significance" -> v.toString }if(causeUnit != null) causeUnit.foreach { v => queryParams += "cause_unit" -> v.toString }if(causeUnitId != null) causeUnitId.foreach { v => queryParams += "cause_unit_id" -> v.toString }if(causeChanges != null) causeChanges.foreach { v => queryParams += "cause_changes" -> v.toString }if(effectChanges != null) effectChanges.foreach { v => queryParams += "effect_changes" -> v.toString }if(aggregateQmScore != null) aggregateQmScore.foreach { v => queryParams += "aggregate_qm_score" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(status != null) status.foreach { v => queryParams += "status" -> v.toString }if(errorMessage != null) errorMessage.foreach { v => queryParams += "error_message" -> v.toString }if(lastSuccessfulUpdateTime != null) lastSuccessfulUpdateTime.foreach { v => queryParams += "last_successful_update_time" -> v.toString }if(reversePearsonCorrelationCoefficient != null) reversePearsonCorrelationCoefficient.foreach { v => queryParams += "reverse_pearson_correlation_coefficient" -> v.toString }if(predictivePearsonCorrelationCoefficient != null) predictivePearsonCorrelationCoefficient.foreach { v => queryParams += "predictive_pearson_correlation_coefficient" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def aggregatedCorrelationsPost(body: Option[AggregatedCorrelation] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_1], writer: RequestWriter[AggregatedCorrelation]): Future[Inline_response_200_1] = {
    // create path and map variables
    val path = (addFmt("/aggregatedCorrelations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def aggregatedCorrelationsIdGet(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_1]): Future[Inline_response_200_1] = {
    // create path and map variables
    val path = (addFmt("/aggregatedCorrelations/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def aggregatedCorrelationsIdPut(id: Integer,
      body: Option[AggregatedCorrelation] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[AggregatedCorrelation]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/aggregatedCorrelations/{id}")
        replaceAll ("\\{" + "id" + "\\}",id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def aggregatedCorrelationsIdDelete(id: Integer)(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/aggregatedCorrelations/{id}")
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
