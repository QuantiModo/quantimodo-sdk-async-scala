package io.swagger.client

import io.swagger.client.api._

import com.wordnik.swagger.client._

import java.io.Closeable

class SwaggerClient(config: SwaggerConfig) extends Closeable {
  val locator = config.locator
  val name = config.name

  private[this] val client = transportClient

  protected def transportClient: TransportClient = new RestClient(config)
  
  val applicationEndpoints = new ApplicationEndpointsApi(client, config)
  
  val authentication = new AuthenticationApi(client, config)
  
  val connectors = new ConnectorsApi(client, config)
  
  val correlations = new CorrelationsApi(client, config)
  
  val measurements = new MeasurementsApi(client, config)
  
  val organizations = new OrganizationsApi(client, config)
  
  val pairs = new PairsApi(client, config)
  
  val reminders = new RemindersApi(client, config)
  
  val tags = new TagsApi(client, config)
  
  val units = new UnitsApi(client, config)
  
  val user = new UserApi(client, config)
  
  val variables = new VariablesApi(client, config)
  
  val votes = new VotesApi(client, config)
  

  def close() {
    client.close()
  }
}
