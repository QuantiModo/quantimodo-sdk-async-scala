package io.swagger.client.model

import org.joda.time.DateTime


case class MeasurementRange (
  lowerLimit: Integer,  // The timestamp of the earliest measurement for a user.
  upperLimit: Integer  // The timestamp of the most recent measurement for a user.
  
)
