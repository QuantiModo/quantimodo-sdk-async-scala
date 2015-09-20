package io.swagger.client.api

import io.swagger.client.model.UnitCategory
import io.swagger.client.model.Unit
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class UnitsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def v1UnitCategoriesGet()(implicit reader: ClientResponseReader[UnitCategory]): Future[UnitCategory] = {
    // create path and map variables
    val path = (addFmt("/v1/unitCategories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1UnitsGet(unitName: Option[String] = None,
      abbreviatedUnitName: Option[String] = None,
      categoryName: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Unit]]): Future[List[Unit]] = {
    // create path and map variables
    val path = (addFmt("/v1/units"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(unitName != null) unitName.foreach { v => queryParams += "unitName" -> v.toString }if(abbreviatedUnitName != null) abbreviatedUnitName.foreach { v => queryParams += "abbreviatedUnitName" -> v.toString }if(categoryName != null) categoryName.foreach { v => queryParams += "categoryName" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1UnitsVariableGet(unitName: Option[String] = None,
      abbreviatedUnitName: Option[String] = None,
      categoryName: Option[String] = None,
      variable: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Unit]]): Future[List[Unit]] = {
    // create path and map variables
    val path = (addFmt("/v1/unitsVariable"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(unitName != null) unitName.foreach { v => queryParams += "unitName" -> v.toString }if(abbreviatedUnitName != null) abbreviatedUnitName.foreach { v => queryParams += "abbreviatedUnitName" -> v.toString }if(categoryName != null) categoryName.foreach { v => queryParams += "categoryName" -> v.toString }if(variable != null) variable.foreach { v => queryParams += "variable" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
