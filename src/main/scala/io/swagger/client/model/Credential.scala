package io.swagger.client.model

import org.joda.time.DateTime


case class Credential (
  connector_id: Integer,  // connector_id
  attr_key: String,  // attr_key
  attr_value: String,  // attr_value
  created_at: DateTime,  // created_at
  updated_at: DateTime  // updated_at
  
)
