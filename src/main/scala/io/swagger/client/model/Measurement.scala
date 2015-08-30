package io.swagger.client.model

import org.joda.time.DateTime


case class Measurement (
  variable: String,  // ORIGINAL Name of the variable for which we are creating the measurement records
  source: String,  // Application or device used to record the measurement values
  timestamp: Long,  // Timestamp for the measurement event in epoch time
  value: Double,  // Converted measurement value in requested unit
  unit: String,  // Unit of measurement as requested in GET request
  storedValue: Double,  // Measurement value in the unit as orignally submitted
  storedAbbreviatedUnitName: String  // Unit of measurement as originally submitted
  
)
