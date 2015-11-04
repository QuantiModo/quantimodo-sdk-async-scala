package io.swagger.client.model

import org.joda.time.DateTime


case class Update (
  id: Integer,  // id
  user_id: Integer,  // user_id
  connector_id: Integer,  // connector_id
  number_of_measurements: Integer,  // number_of_measurements
  success: Boolean,  // success
  message: String,  // message
  created_at: DateTime,  // created_at
  updated_at: DateTime  // updated_at
  
)
