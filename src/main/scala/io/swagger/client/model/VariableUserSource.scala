package io.swagger.client.model

import org.joda.time.DateTime


case class VariableUserSource (
  user_id: Integer,  // ID of User
  variable_id: Integer,  // ID of variable
  source_id: Integer,  // ID of source
  timestamp: Integer,  // Time that this measurement occurred Uses epoch minute (epoch time divided by 60)
  earliest_measurement_time: Integer,  // Earliest measurement time
  latest_measurement_time: Integer,  // Latest measurement time
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime  // When the record in the database was last updated. Use ISO 8601 datetime format
  
)
