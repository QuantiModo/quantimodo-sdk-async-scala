package io.swagger.client.model

import org.joda.time.DateTime


case class MeasurementPost (
  variable_id: Integer,  // ID of the variable for the measurement as obtained from the GET variables endpoint
  source_id: Integer,  // Source ID of the app or device as obtained from the GET sources endpoint
  unit_id: Integer,  // Unit id for the measurement value as obtained from the GET units endpoint
  measurements: List[MeasurementValue]  // measurements
  
)
