package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ValueObject (
  timestamp: Long,  // Timestamp for the measurement event in epoch time (unixtime)
value: Double,  // Measurement value
note: Option[String]  // Optional note to include with the measurement
)
