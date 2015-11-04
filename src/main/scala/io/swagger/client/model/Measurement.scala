package io.swagger.client.model

import org.joda.time.DateTime


case class Measurement (
  id: Integer,  // id
  user_id: Integer,  // ID of user that owns this measurement
  client_id: String,  // client_id
  connector_id: Integer,  // Connector ID
  variable_id: Integer,  // ID of the variable for which we are creating the measurement records
  source_id: Integer,  // Application or device used to record the measurement values
  start_time: Integer,  // Start Time for the measurement event in ISO 8601
  value: Float,  // Converted measurement value in requested unit
  unit_id: Integer,  // Unit ID of measurement as requested in GET request
  original_value: Float,  // Original value
  original_unit_id: Integer,  // Unit ID of measurement as originally submitted
  duration: Integer,  // duration of measurement in seconds
  note: String,  // Note of measurement
  latitude: Float,  // latitude
  longitude: Float,  // longitude
  location: String,  // location
  created_at: DateTime,  // created_at
  updated_at: DateTime,  // updated_at
  error: String  // error
  
)
