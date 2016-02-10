package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_34
import io.swagger.client.model.Variable
import io.swagger.client.model.Inline_response_200_35
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class VariableApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def variablesGet(accessToken: Option[String] = None,
      id: Option[Integer] = None,
      clientId: Option[String] = None,
      parentId: Option[Integer] = None,
      name: Option[String] = None,
      variableCategoryId: Option[Integer] = None,
      defaultUnitId: Option[Integer] = None,
      combinationOperation: Option[String] = None,
      fillingValue: Option[Number] = None,
      maximumAllowedValue: Option[Number] = None,
      minimumAllowedValue: Option[Number] = None,
      onsetDelay: Option[Integer] = None,
      durationOfAction: Option[Integer] = None,
      public: Option[Integer] = None,
      causeOnly: Option[Boolean] = None,
      mostCommonValue: Option[Number] = None,
      mostCommonUnitId: Option[Integer] = None,
      standardDeviation: Option[Number] = None,
      variance: Option[Number] = None,
      mean: Option[Number] = None,
      median: Option[Number] = None,
      numberOfMeasurements: Option[Number] = None,
      numberOfUniqueValues: Option[Number] = None,
      skewness: Option[Number] = None,
      kurtosis: Option[Number] = None,
      status: Option[String] = None,
      errorMessage: Option[String] = None,
      lastSuccessfulUpdateTime: Option[String] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      productUrl: Option[String] = None,
      imageUrl: Option[String] = None,
      price: Option[Number] = None,
      numberOfUserVariables: Option[Integer] = None,
      outcome: Option[Boolean] = None,
      minimumRecordedValue: Option[Number] = None,
      maximumRecordedValue: Option[Number] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_34]): Future[Inline_response_200_34] = {
    // create path and map variables
    val path = (addFmt("/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(id != null) id.foreach { v => queryParams += "id" -> v.toString }if(clientId != null) clientId.foreach { v => queryParams += "client_id" -> v.toString }if(parentId != null) parentId.foreach { v => queryParams += "parent_id" -> v.toString }if(name != null) name.foreach { v => queryParams += "name" -> v.toString }if(variableCategoryId != null) variableCategoryId.foreach { v => queryParams += "variable_category_id" -> v.toString }if(defaultUnitId != null) defaultUnitId.foreach { v => queryParams += "default_unit_id" -> v.toString }if(combinationOperation != null) combinationOperation.foreach { v => queryParams += "combination_operation" -> v.toString }if(fillingValue != null) fillingValue.foreach { v => queryParams += "filling_value" -> v.toString }if(maximumAllowedValue != null) maximumAllowedValue.foreach { v => queryParams += "maximum_allowed_value" -> v.toString }if(minimumAllowedValue != null) minimumAllowedValue.foreach { v => queryParams += "minimum_allowed_value" -> v.toString }if(onsetDelay != null) onsetDelay.foreach { v => queryParams += "onset_delay" -> v.toString }if(durationOfAction != null) durationOfAction.foreach { v => queryParams += "duration_of_action" -> v.toString }if(public != null) public.foreach { v => queryParams += "public" -> v.toString }if(causeOnly != null) causeOnly.foreach { v => queryParams += "cause_only" -> v.toString }if(mostCommonValue != null) mostCommonValue.foreach { v => queryParams += "most_common_value" -> v.toString }if(mostCommonUnitId != null) mostCommonUnitId.foreach { v => queryParams += "most_common_unit_id" -> v.toString }if(standardDeviation != null) standardDeviation.foreach { v => queryParams += "standard_deviation" -> v.toString }if(variance != null) variance.foreach { v => queryParams += "variance" -> v.toString }if(mean != null) mean.foreach { v => queryParams += "mean" -> v.toString }if(median != null) median.foreach { v => queryParams += "median" -> v.toString }if(numberOfMeasurements != null) numberOfMeasurements.foreach { v => queryParams += "number_of_measurements" -> v.toString }if(numberOfUniqueValues != null) numberOfUniqueValues.foreach { v => queryParams += "number_of_unique_values" -> v.toString }if(skewness != null) skewness.foreach { v => queryParams += "skewness" -> v.toString }if(kurtosis != null) kurtosis.foreach { v => queryParams += "kurtosis" -> v.toString }if(status != null) status.foreach { v => queryParams += "status" -> v.toString }if(errorMessage != null) errorMessage.foreach { v => queryParams += "error_message" -> v.toString }if(lastSuccessfulUpdateTime != null) lastSuccessfulUpdateTime.foreach { v => queryParams += "last_successful_update_time" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(productUrl != null) productUrl.foreach { v => queryParams += "product_url" -> v.toString }if(imageUrl != null) imageUrl.foreach { v => queryParams += "image_url" -> v.toString }if(price != null) price.foreach { v => queryParams += "price" -> v.toString }if(numberOfUserVariables != null) numberOfUserVariables.foreach { v => queryParams += "number_of_user_variables" -> v.toString }if(outcome != null) outcome.foreach { v => queryParams += "outcome" -> v.toString }if(minimumRecordedValue != null) minimumRecordedValue.foreach { v => queryParams += "minimum_recorded_value" -> v.toString }if(maximumRecordedValue != null) maximumRecordedValue.foreach { v => queryParams += "maximum_recorded_value" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesPost(accessToken: Option[String] = None,
      body: Option[Variable] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_35], writer: RequestWriter[Variable]): Future[Inline_response_200_35] = {
    // create path and map variables
    val path = (addFmt("/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_35]): Future[Inline_response_200_35] = {
    // create path and map variables
    val path = (addFmt("/variables/{id}")
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

  
  def variablesIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[Variable] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Variable]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/variables/{id}")
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

  
  def variablesIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/variables/{id}")
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
