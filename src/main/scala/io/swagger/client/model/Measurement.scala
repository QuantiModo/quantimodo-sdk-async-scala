package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Measurement (
  variable: String,  // ORIGINAL Name of the variable for which we are creating the measurement records
source: String,  // Application or device used to record the measurement values
startTime: String,  // Start Time for the measurement event in ISO 8601
humanTime: Option[HumanTime],  // Start Time for the measurement event in ISO 8601
value: Double,  // Converted measurement value in requested unit
unit: String,  // Unit of measurement as requested in GET request
originalValue: Option[Integer],  // Original value
storedValue: Option[Double],  // Measurement value in the unit as orignally submitted
storedAbbreviatedUnitName: Option[String],  // Unit of measurement as originally submitted
originalAbbreviatedUnitName: Option[String],  // Original Unit of measurement as originally submitted
abbreviatedUnitName: Option[String],  // Unit of measurement as originally submitted
note: Option[String]  // Note of measurement
)
