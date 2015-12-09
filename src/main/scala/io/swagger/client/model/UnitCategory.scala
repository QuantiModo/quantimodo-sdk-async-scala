package io.swagger.client.model

import org.joda.time.DateTime


case class UnitCategory (
  id: Integer,  // id
  name: String,  // Unit category name
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime  // When the record in the database was last updated. Use ISO 8601 datetime format
  
)
