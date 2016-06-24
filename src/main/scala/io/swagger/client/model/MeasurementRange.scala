package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class MeasurementRange (
  lowerLimit: Integer,  // The timestamp of the earliest measurement for a user.
upperLimit: Option[Integer]  // The timestamp of the most recent measurement for a user.
)
