package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Unit (
  name: String,  // Unit name
abbreviatedName: String,  // Unit abbreviation
category: String,  // Unit category
minimumValue: Option[Double],  // The smallest acceptable value for measurements using this unit
maximumValue: Option[Double],  // The largest acceptable value for measurements using this unit
conversionSteps: List[ConversionStep]  // Conversion steps list
)
