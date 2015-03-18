package io.swagger.client

import io.swagger.client.api._

import com.wordnik.swagger.client._

import java.io.Closeable

class SwaggerClient(config: SwaggerConfig) extends Closeable {
  val locator = config.locator
  val name = config.name

  private[this] val client = transportClient

  protected def transportClient: TransportClient = new RestClient(config)
  
  val user = new UserApi(client, config)
  
  val connectors = new ConnectorsApi(client, config)
  
  val measurements = new MeasurementsApi(client, config)
  
  val variables = new VariablesApi(client, config)
  
  val units = new UnitsApi(client, config)
  
  val oauth = new OauthApi(client, config)
  
  val correlations = new CorrelationsApi(client, config)
  
  val pairs = new PairsApi(client, config)
  
  val sharing = new SharingApi(client, config)
  

  def close() {
    client.close()
  }
}