package io.swagger.client.model

import org.joda.time.DateTime


case class MeasurementSet (
  measurements: List[ValueObject],  // Array of timestamps, values, and optional notes
  name: String,  // ORIGINAL name of the variable for which we are creating the measurement records
  source: String,  // Name of the application or device used to record the measurement values
  category: String,  // Variable category name
  combinationOperation: String,  // Way to aggregate measurements over time. Options are \&quot;MEAN\&quot; or \&quot;SUM\&quot;
  unit: String  // Unit of measurement
  
)
