package io.swagger.client.model

import org.joda.time.DateTime


case class Measurement (
  id: Integer,  // id
  user_id: Integer,  // ID of user that owns this measurement
  client_id: String,  // client_id
  connector_id: Integer,  // The id for the connector data source from which the measurement was obtained
  variable_id: Integer,  // ID of the variable for which we are creating the measurement records
  source_id: Integer,  // Application or device used to record the measurement values
  start_time: String,  // Start Time for the measurement event. Use ISO 8601
  value: Float,  // The value of the measurement after conversion to the default unit for that variable
  unit_id: Integer,  // The default unit for the variable
  original_value: Float,  // Value of measurement as originally posted (before conversion to default unit)
  original_unit_id: Integer,  // Unit ID of measurement as originally submitted
  duration: Integer,  // Duration of the event being measurement in seconds
  note: String,  // An optional note the user may include with their measurement
  latitude: Float,  // Latitude at which the measurement was taken
  longitude: Float,  // Longitude at which the measurement was taken
  location: String,  // location
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime,  // When the record in the database was last updated. Use ISO 8601 datetime format
  error: String  // error
  
)
