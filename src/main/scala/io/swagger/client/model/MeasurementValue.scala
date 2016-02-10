package io.swagger.client.model

import org.joda.time.DateTime


case class MeasurementValue (
  start_time: String,  // When the measurement event occurred . Use ISO 8601 datetime format
  value: Float,  // Value for the measurement
  note: String  // An optional note the user may include with their measurement
  
)
