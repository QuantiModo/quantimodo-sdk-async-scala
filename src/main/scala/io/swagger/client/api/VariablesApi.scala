package io.swagger.client.api

import io.swagger.client.model.Variable
import io.swagger.client.model.UserVariables
import io.swagger.client.model.VariableCategory
import io.swagger.client.model.VariablesNew
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class VariablesApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v1PublicVariablesGet()(implicit reader: ClientResponseReader[Variable]): Future[Variable] = {
    // create path and map variables
    val path = (addFmt("/v1/public/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1PublicVariablesSearchSearchGet(search: String,
      accessToken: Option[String] = None,
      categoryName: Option[String] = None,
      source: Option[String] = None,
      effectOrCause: Option[String] = None,
      publicEffectOrCause: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Variable]): Future[Variable] = {
    // create path and map variables
    val path = (addFmt("/v1/public/variables/search/{search}")
        replaceAll ("\\{" + "search" + "\\}",search.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (categoryName != null) categoryName.foreach { v => queryParams += "categoryName" -> v.toString }

    if (source != null) source.foreach { v => queryParams += "source" -> v.toString }

    if (effectOrCause != null) effectOrCause.foreach { v => queryParams += "effectOrCause" -> v.toString }

    if (publicEffectOrCause != null) publicEffectOrCause.foreach { v => queryParams += "publicEffectOrCause" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1UserVariablesPost(userVariables: UserVariables)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[UserVariables]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/userVariables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userVariables == null) throw new Exception("Missing required parameter 'userVariables' when calling VariablesApi->v1UserVariablesPost")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(userVariables))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1VariableCategoriesGet()(implicit reader: ClientResponseReader[List[VariableCategory]]): Future[List[VariableCategory]] = {
    // create path and map variables
    val path = (addFmt("/v1/variableCategories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1VariablesGet(accessToken: Option[String] = None,
      id: Option[Integer] = None,
      userId: Option[Integer] = None,
      category: Option[String] = None,
      name: Option[String] = None,
      lastUpdated: Option[String] = None,
      source: Option[String] = None,
      latestMeasurementTime: Option[String] = None,
      numberOfMeasurements: Option[String] = None,
      lastSource: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Variable]): Future[Variable] = {
    // create path and map variables
    val path = (addFmt("/v1/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (id != null) id.foreach { v => queryParams += "id" -> v.toString }

    if (userId != null) userId.foreach { v => queryParams += "userId" -> v.toString }

    if (category != null) category.foreach { v => queryParams += "category" -> v.toString }

    if (name != null) name.foreach { v => queryParams += "name" -> v.toString }

    if (lastUpdated != null) lastUpdated.foreach { v => queryParams += "lastUpdated" -> v.toString }

    if (source != null) source.foreach { v => queryParams += "source" -> v.toString }

    if (latestMeasurementTime != null) latestMeasurementTime.foreach { v => queryParams += "latestMeasurementTime" -> v.toString }

    if (numberOfMeasurements != null) numberOfMeasurements.foreach { v => queryParams += "numberOfMeasurements" -> v.toString }

    if (lastSource != null) lastSource.foreach { v => queryParams += "lastSource" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1VariablesPost(body: VariablesNew,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[VariablesNew]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling VariablesApi->v1VariablesPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1VariablesSearchSearchGet(search: String,
      accessToken: Option[String] = None,
      categoryName: Option[String] = None,
      includePublic: Option[Boolean] = None,
      manualTracking: Option[Boolean] = None,
      source: Option[String] = None,
      effectOrCause: Option[String] = None,
      publicEffectOrCause: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None
      )(implicit reader: ClientResponseReader[List[Variable]]): Future[List[Variable]] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/search/{search}")
        replaceAll ("\\{" + "search" + "\\}",search.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (categoryName != null) categoryName.foreach { v => queryParams += "categoryName" -> v.toString }

    if (includePublic != null) includePublic.foreach { v => queryParams += "includePublic" -> v.toString }

    if (manualTracking != null) manualTracking.foreach { v => queryParams += "manualTracking" -> v.toString }

    if (source != null) source.foreach { v => queryParams += "source" -> v.toString }

    if (effectOrCause != null) effectOrCause.foreach { v => queryParams += "effectOrCause" -> v.toString }

    if (publicEffectOrCause != null) publicEffectOrCause.foreach { v => queryParams += "publicEffectOrCause" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1VariablesVariableNameGet(variableName: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Variable]): Future[Variable] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/{variableName}")
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
