package io.swagger.client.model

import org.joda.time.DateTime


case class Connector (
  id: Integer,  // Connector ID number
  name: String,  // Connector lowercase system name
  display_name: String,  // Connector pretty display name
  image: String,  // URL to the image of the connector logo
  get_it_url: String,  // URL to a site where one can get this device or application
  short_description: String,  // Short description
  long_description: String,  // Long description
  enabled: Boolean,  // enabled
  oauth: Boolean  // oauth
  
)
