package io.swagger.client.model

import org.joda.time.DateTime


case class Connector (
  id: Integer,  // Connector ID number
  name: String,  // Lowercase system name for the data source
  display_name: String,  // Pretty display name for the data source
  image: String,  // URL to the image of the connector logo
  get_it_url: String,  // URL to a site where one can get this device or application
  short_description: String,  // Short description of the service (such as the categories it tracks)
  long_description: String,  // Longer paragraph description of the data provider
  enabled: Boolean,  // Set to 1 if the connector should be returned when listing connectors
  oauth: Boolean,  // Set to 1 if the connector uses OAuth authentication as opposed to username/password
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime  // When the record in the database was last updated. Use ISO 8601 datetime format
  
)
