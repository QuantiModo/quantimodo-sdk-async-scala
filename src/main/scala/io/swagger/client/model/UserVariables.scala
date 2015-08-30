package io.swagger.client.model

import org.joda.time.DateTime


case class UserVariables (
  user: Integer,  // User ID
  variable: String,  // Variable DISPLAY name
  durationOfAction: Integer,  // Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect
  fillingValue: Integer,  // fillingValue
  joinWith: String,  // joinWith
  maximumValue: Float,  // maximumValue
  minimumValue: Float,  // minimumValue
  name: String,  // name
  onsetDelay: Integer,  // onsetDelay
  unit: String  // unit
  
)
