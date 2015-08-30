package io.swagger.client.model

import org.joda.time.DateTime


case class ConnectorInfoHistoryItem (
  number_of_measurements: Integer,  // Number of measurements
  success: Boolean,  // True if the update was successfull
  message: String,  // Error message.
  created_at: String  // Date and time of the update
  
)
