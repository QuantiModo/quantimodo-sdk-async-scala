package io.swagger.client.model

import org.joda.time.DateTime


case class Unit (
  id: Integer,  // id
  client_id: String,  // client_id
  name: String,  // Unit name
  abbreviated_name: String,  // Unit abbreviation
  category_id: Integer,  // Unit category ID
  minimum_value: Float,  // Unit minimum value
  maximum_value: Float,  // Unit maximum value
  updated: Integer,  // updated
  default_unit_id: Integer,  // ID of default unit
  multiply: Float,  // Value multiplied to
  add: Float,  // Value which should be added to convert to default unit
  created_at: DateTime,  // created_at
  updated_at: DateTime  // updated_at
  
)
