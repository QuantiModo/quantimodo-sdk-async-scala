package io.swagger.client

import io.swagger.client.api._

import io.swagger.client._

import java.io.Closeable

class SwaggerClient(config: SwaggerConfig) extends Closeable {
  val locator = config.locator
  val name = config.name

  private[this] val client = transportClient

  protected def transportClient: TransportClient = new RestClient(config)
  
  val variableUserSource = new VariableUserSourceApi(client, config)
  
  val measurement = new MeasurementApi(client, config)
  
  val trackingReminder = new TrackingReminderApi(client, config)
  
  val variable = new VariableApi(client, config)
  
  val update = new UpdateApi(client, config)
  
  val aggregatedCorrelation = new AggregatedCorrelationApi(client, config)
  
  val connector = new ConnectorApi(client, config)
  
  val commonVariableRelationship = new CommonVariableRelationshipApi(client, config)
  
  val correlation = new CorrelationApi(client, config)
  
  val connection = new ConnectionApi(client, config)
  
  val unit = new UnitApi(client, config)
  
  val userVariable = new UserVariableApi(client, config)
  
  val source = new SourceApi(client, config)
  
  val variableCategory = new VariableCategoryApi(client, config)
  
  val userVariableRelationship = new UserVariableRelationshipApi(client, config)
  
  val applicationEndpoints = new ApplicationEndpointsApi(client, config)
  
  val credential = new CredentialApi(client, config)
  
  val unitCategory = new UnitCategoryApi(client, config)
  
  val vote = new VoteApi(client, config)
  

  def close() {
    client.close()
  }
}