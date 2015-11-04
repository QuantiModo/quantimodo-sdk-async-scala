package io.swagger.client.model

import org.joda.time.DateTime


case class MeasurementPost (
  variable_id: Integer,  // variable_id
  source_id: Integer,  // source_id
  unit_id: Integer,  // unit_id
  measurements: List[MeasurementValue]  // measurements
  
)
