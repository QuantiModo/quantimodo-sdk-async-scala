package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ConnectorInfoHistoryItem (
  numberOfMeasurements: Integer,  // Number of measurements
success: Boolean,  // True if the update was successfull
message: String,  // Error message.
createdAt: String  // Date and time of the update in UTC time zone
)
