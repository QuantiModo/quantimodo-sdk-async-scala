package io.swagger.client.api

import io.swagger.client.model.VariableUserSettings
import io.swagger.client.model.Variable
import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class VariablesApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def publicVariablesGet()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def publicVariablesSearchSearchGet(search: String,
      effectOrCause: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/variables/search/{search}")
        replaceAll ("\\{" + "search" + "\\}",search.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(effectOrCause != null)   queryParams += "effectOrCause" -> effectOrCause.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableCategoriesGet()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/variableCategories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableUserSettingsPost(sharingData: List[VariableUserSettings])(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[VariableUserSettings]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/variableUserSettings"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(sharingData))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesGet(userId: Integer,
      categoryName: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(userId != null)   queryParams += "userId" -> userId.toString
    if(categoryName != null)   queryParams += "categoryName" -> categoryName.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesPost(variableName: List[Variable])(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[Variable]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(variableName))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesSearchSearchGet(search: String,
      categoryName: String,
      source: String,
      limit: Integer,
      offset: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/variables/search/{search}")
        replaceAll ("\\{" + "search" + "\\}",search.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(categoryName != null)   queryParams += "categoryName" -> categoryName.toString
    if(source != null)   queryParams += "source" -> source.toString
    if(limit != null)   queryParams += "limit" -> limit.toString
    if(offset != null)   queryParams += "offset" -> offset.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesVariableNameGet(variableName: String,
      categoryName: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/variables/{variableName}")
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(categoryName != null)   queryParams += "categoryName" -> categoryName.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
