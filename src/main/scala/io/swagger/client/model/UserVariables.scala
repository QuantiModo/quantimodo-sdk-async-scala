package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class UserVariables (
  user: Integer,  // User ID
variableId: Integer,  // Common variable id
durationOfAction: Option[Integer],  // Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect
fillingValue: Option[Integer],  // fillingValue
joinWith: Option[String],  // joinWith
maximumAllowedValue: Option[Float],  // maximumAllowedValue
minimumAllowedValue: Option[Float],  // minimumAllowedValue
onsetDelay: Option[Integer],  // onsetDelay
experimentStartTime: Option[String],  // Earliest measurement startTime that should be used in analysis in ISO format
experimentEndTime: Option[String]  // Latest measurement startTime that should be used in analysis in ISO format
)
