package io.swagger.client.api

import io.swagger.client.model.CommonResponse
import io.swagger.client.model.VoteDelete
import io.swagger.client.model.PostVote
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class VotesApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def v1VotesDeletePost(body: VoteDelete,
      accessToken: Option[String] = None
      )(implicit reader: ClientResponseReader[CommonResponse], writer: RequestWriter[VoteDelete]): Future[CommonResponse] = {
    // create path and map variables
    val path = (addFmt("/v1/votes/delete"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling VotesApi->v1VotesDeletePost")

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

    if (body == null) throw new Exception("Missing required parameter 'body' when calling VotesApi->v1VotesPost")

    if (accessToken != null) accessToken.foreach { v => queryParams += "access_token" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
