package io.swagger.client.api

import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class UnitsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def unitCategoriesGet()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/unitCategories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def unitsGet(unitName: String,
      abbreviatedUnitName: String,
      categoryName: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/units"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(unitName != null)   queryParams += "unitName" -> unitName.toString
    if(abbreviatedUnitName != null)   queryParams += "abbreviatedUnitName" -> abbreviatedUnitName.toString
    if(categoryName != null)   queryParams += "categoryName" -> categoryName.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def unitsVariableGet(variable: String,
      unitName: String,
      cabbreviatedUnitName: String,
      categoryName: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/unitsVariable"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(variable != null)   queryParams += "variable" -> variable.toString
    if(unitName != null)   queryParams += "unitName" -> unitName.toString
    if(cabbreviatedUnitName != null)   queryParams += "cabbreviatedUnitName" -> cabbreviatedUnitName.toString
    if(categoryName != null)   queryParams += "categoryName" -> categoryName.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
