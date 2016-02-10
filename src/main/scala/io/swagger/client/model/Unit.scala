package io.swagger.client.model

import org.joda.time.DateTime


case class Unit (
  id: Integer,  // id
  client_id: String,  // client_id
  name: String,  // Unit name
  abbreviated_name: String,  // Unit abbreviation
  category_id: Integer,  // Unit category ID
  minimum_value: Float,  // Minimum value permitted for this unit
  maximum_value: Float,  // Maximum value permitted for this unit
  updated: Integer,  // updated
  default_unit_id: Integer,  // ID of default unit for this units category
  multiply: Float,  // Value multiplied to convert to default unit in this unit category
  add: Float,  // Value which should be added to convert to default unit
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime  // When the record in the database was last updated. Use ISO 8601 datetime format
  
)
