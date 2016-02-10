package io.swagger.client.model

import org.joda.time.DateTime


case class MeasurementExport (
  id: Integer,  // id
  user_id: Integer,  // ID of User
  status: String,  // Status of Measurement Export
  error_message: String,  // Error message
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime  // When the record in the database was last updated. Use ISO 8601 datetime format
  
)
