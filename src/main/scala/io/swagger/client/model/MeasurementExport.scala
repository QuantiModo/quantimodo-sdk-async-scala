package io.swagger.client.model

import org.joda.time.DateTime


case class MeasurementExport (
  id: Integer,  // id
  user_id: Integer,  // ID of User
  status: String,  // Status of Measurement Export
  error_message: String,  // Error message
  created_at: DateTime,  // created_at
  updated_at: DateTime  // updated_at
  
)
