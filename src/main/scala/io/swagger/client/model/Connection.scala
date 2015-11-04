package io.swagger.client.model

import org.joda.time.DateTime


case class Connection (
  id: Integer,  // id
  user_id: Integer,  // user_id
  connector_id: Integer,  // connector_id
  connect_status: String,  // connect_status
  connect_error: String,  // connect_error
  update_requested_at: DateTime,  // update_requested_at
  update_status: String,  // update_status
  update_error: String,  // update_error
  last_successful_updated_at: DateTime,  // last_successful_updated_at
  created_at: DateTime,  // created_at
  updated_at: DateTime  // updated_at
  
)
