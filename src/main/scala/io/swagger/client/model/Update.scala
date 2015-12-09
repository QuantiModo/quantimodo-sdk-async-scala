package io.swagger.client.model

import org.joda.time.DateTime


case class Update (
  id: Integer,  // id
  user_id: Integer,  // user_id
  connector_id: Integer,  // connector_id
  number_of_measurements: Integer,  // number_of_measurements
  success: Boolean,  // success
  message: String,  // message
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime  // When the record in the database was last updated. Use ISO 8601 datetime format
  
)
