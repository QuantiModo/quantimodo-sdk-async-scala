package io.swagger.client.model

import org.joda.time.DateTime


case class Vote (
  id: Integer,  // id
  client_id: String,  // client_id
  user_id: Integer,  // ID of User
  cause_id: Integer,  // ID of cause variable
  effect_id: Integer,  // ID of effect variable
  value: Integer,  // Value of Vote
  created_at: DateTime,  // created_at
  updated_at: DateTime  // updated_at
  
)
