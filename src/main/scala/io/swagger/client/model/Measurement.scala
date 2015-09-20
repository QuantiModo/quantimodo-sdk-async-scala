package io.swagger.client.model

import org.joda.time.DateTime


case class Measurement (
  variable: String,  // ORIGINAL Name of the variable for which we are creating the measurement records
  source: String,  // Application or device used to record the measurement values
  timestamp: Long,  // Timestamp for the measurement event in epoch time
  startTime: String,  // Start Time for the measurement event in ISO 8601
  humanTime: HumanTime,  // Start Time for the measurement event in ISO 8601
  value: Double,  // Converted measurement value in requested unit
  unit: String,  // Unit of measurement as requested in GET request
  originalValue: Integer,  // Original value
  storedValue: Double,  // Measurement value in the unit as orignally submitted
  storedAbbreviatedUnitName: String,  // Unit of measurement as originally submitted
  originalAbbreviatedUnitName: String,  // Original Unit of measurement as originally submitted
  abbreviatedUnitName: String,  // Unit of measurement as originally submitted
  note: String  // Note of measurement
  
)
