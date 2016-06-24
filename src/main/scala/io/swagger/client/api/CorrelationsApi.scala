package io.swagger.client.api

import io.swagger.client.model.Correlation
import io.swagger.client.model.JsonErrorResponse
import io.swagger.client.model.PostCorrelation
import io.swagger.client.model.CommonResponse
import io.swagger.client.model.VoteDelete
import io.swagger.client.model.PostVote
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CorrelationsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v1AggregatedCorrelationsGet(accessToken: Option[String] = None,
      effect: Option[String] = None,
      cause: Option[String] = None,
      correlationCoefficient: Option[String] = None,
      onsetDelay: Option[String] = None,
      durationOfAction: Option[String] = None,
      lastUpdated: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/aggregatedCorrelations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (effect != null) effect.foreach { v => queryParams += "effect" -> v.toString }

    if (cause != null) cause.foreach { v => queryParams += "cause" -> v.toString }

    if (correlationCoefficient != null) correlationCoefficient.foreach { v => queryParams += "correlationCoefficient" -> v.toString }

    if (onsetDelay != null) onsetDelay.foreach { v => queryParams += "onsetDelay" -> v.toString }

    if (durationOfAction != null) durationOfAction.foreach { v => queryParams += "durationOfAction" -> v.toString }

    if (lastUpdated != null) lastUpdated.foreach { v => queryParams += "lastUpdated" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1AggregatedCorrelationsPost(body: PostCorrelation,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[PostCorrelation]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/aggregatedCorrelations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CorrelationsApi->v1AggregatedCorrelationsPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1CorrelationsGet(accessToken: Option[String] = None,
      effect: Option[String] = None,
      cause: Option[String] = None,
      correlationCoefficient: Option[String] = None,
      onsetDelay: Option[String] = None,
      durationOfAction: Option[String] = None,
      lastUpdated: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/correlations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (effect != null) effect.foreach { v => queryParams += "effect" -> v.toString }

    if (cause != null) cause.foreach { v => queryParams += "cause" -> v.toString }

    if (correlationCoefficient != null) correlationCoefficient.foreach { v => queryParams += "correlationCoefficient" -> v.toString }

    if (onsetDelay != null) onsetDelay.foreach { v => queryParams += "onsetDelay" -> v.toString }

    if (durationOfAction != null) durationOfAction.foreach { v => queryParams += "durationOfAction" -> v.toString }

    if (lastUpdated != null) lastUpdated.foreach { v => queryParams += "lastUpdated" -> v.toString }

    if (limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }

    if (offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    if (sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet(organizationId: Integer,
      userId: Integer,
      variableName: String,
      organizationToken: String,
      accessToken: Option[String] = None,
      includePublic: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/causes")
        replaceAll ("\\{" + "organizationId" + "\\}",organizationId.toString)
        replaceAll ("\\{" + "userId" + "\\}",userId.toString)
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (organizationToken != null) queryParams += "organization_token" -> organizationToken.toString

    if (includePublic != null) includePublic.foreach { v => queryParams += "includePublic" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet(organizationId: Integer,
      userId: Integer,
      variableName: String,
      organizationToken: String,
      accessToken: Option[String] = None,
      includePublic: Option[String] = None
      )(implicit reader: ClientResponseReader[List[CommonResponse]]): Future[List[CommonResponse]] = {
    // create path and map variables
    val path = (addFmt("/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/effects")
        replaceAll ("\\{" + "organizationId" + "\\}",organizationId.toString)
        replaceAll ("\\{" + "userId" + "\\}",userId.toString)
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (organizationToken != null) queryParams += "organization_token" -> organizationToken.toString

    if (includePublic != null) includePublic.foreach { v => queryParams += "include_public" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1PublicCorrelationsSearchSearchGet(search: String,
      effectOrCause: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/public/correlations/search/{search}")
        replaceAll ("\\{" + "search" + "\\}",search.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }

    if (effectOrCause != null) queryParams += "effectOrCause" -> effectOrCause.toString



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1VariablesVariableNameCausesGet(variableName: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/{variableName}/causes")
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1VariablesVariableNameEffectsGet(variableName: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/{variableName}/effects")
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

  def v1VariablesVariableNamePublicCausesGet(variableName: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/{variableName}/public/causes")
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

  def v1VariablesVariableNamePublicEffectsGet(variableName: String,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/{variableName}/public/effects")
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

  def v1VotesDeletePost(body: VoteDelete,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[CommonResponse], writer: RequestWriter[VoteDelete]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/votes/delete"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CorrelationsApi->v1VotesDeletePost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v1VotesPost(body: PostVote,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[CommonResponse], writer: RequestWriter[PostVote]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/votes"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CorrelationsApi->v1VotesPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
