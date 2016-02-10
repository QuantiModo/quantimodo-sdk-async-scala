package io.swagger.client.model

import org.joda.time.DateTime


case class Vote (
  id: Integer,  // id
  client_id: String,  // client_id
  user_id: Integer,  // ID of User
  cause_id: Integer,  // ID of the predictor variable
  effect_id: Integer,  // ID of effect variable
  value: Integer,  // Value of Vote
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime  // When the record in the database was last updated. Use ISO 8601 datetime format
  
)
