package io.swagger.client.model

import org.joda.time.DateTime


case class Source (
  id: Integer,  // id
  client_id: String,  // client_id
  name: String,  // Name of the application or device
  created_at: DateTime,  // created_at
  updated_at: DateTime  // updated_at
  
)
