package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Inline_response_200_27
import io.swagger.client.model.VariableCategory
import io.swagger.client.model.Inline_response_200_28
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class VariableCategoryApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def variableCategoriesGet(accessToken: Option[String] = None,
      name: Option[String] = None,
      fillingValue: Option[Number] = None,
      maximumAllowedValue: Option[Number] = None,
      minimumAllowedValue: Option[Number] = None,
      durationOfAction: Option[Integer] = None,
      onsetDelay: Option[Integer] = None,
      combinationOperation: Option[String] = None,
      updated: Option[Integer] = None,
      causeOnly: Option[Boolean] = None,
      public: Option[Integer] = None,
      outcome: Option[Boolean] = None,
      createdAt: Option[String] = None,
      updatedAt: Option[String] = None,
      imageUrl: Option[String] = None,
      defaultUnitId: Option[Integer] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_27]): Future[Inline_response_200_27] = {
    // create path and map variables
    val path = (addFmt("/variableCategories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }if(name != null) name.foreach { v => queryParams += "name" -> v.toString }if(fillingValue != null) fillingValue.foreach { v => queryParams += "filling_value" -> v.toString }if(maximumAllowedValue != null) maximumAllowedValue.foreach { v => queryParams += "maximum_allowed_value" -> v.toString }if(minimumAllowedValue != null) minimumAllowedValue.foreach { v => queryParams += "minimum_allowed_value" -> v.toString }if(durationOfAction != null) durationOfAction.foreach { v => queryParams += "duration_of_action" -> v.toString }if(onsetDelay != null) onsetDelay.foreach { v => queryParams += "onset_delay" -> v.toString }if(combinationOperation != null) combinationOperation.foreach { v => queryParams += "combination_operation" -> v.toString }if(updated != null) updated.foreach { v => queryParams += "updated" -> v.toString }if(causeOnly != null) causeOnly.foreach { v => queryParams += "cause_only" -> v.toString }if(public != null) public.foreach { v => queryParams += "public" -> v.toString }if(outcome != null) outcome.foreach { v => queryParams += "outcome" -> v.toString }if(createdAt != null) createdAt.foreach { v => queryParams += "created_at" -> v.toString }if(updatedAt != null) updatedAt.foreach { v => queryParams += "updated_at" -> v.toString }if(imageUrl != null) imageUrl.foreach { v => queryParams += "image_url" -> v.toString }if(defaultUnitId != null) defaultUnitId.foreach { v => queryParams += "default_unit_id" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableCategoriesPost(accessToken: Option[String] = None,
      body: Option[VariableCategory] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_28], writer: RequestWriter[VariableCategory]): Future[Inline_response_200_28] = {
    // create path and map variables
    val path = (addFmt("/variableCategories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableCategoriesIdGet(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_28]): Future[Inline_response_200_28] = {
    // create path and map variables
    val path = (addFmt("/variableCategories/{id}")
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

  
  def variableCategoriesIdPut(id: Integer,
      accessToken: Option[String] = None,
      body: Option[VariableCategory] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[VariableCategory]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/variableCategories/{id}")
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

  
  def variableCategoriesIdDelete(id: Integer,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/variableCategories/{id}")
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
