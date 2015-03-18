package io.swagger.client.model

import org.joda.time.DateTime


case class Unit (
  name: String,  // Unit name
  abbreviatedName: String,  // Unit abbreviation
  category: String,  // Unit category
  minimum: Double,  // Unit minimum value
  maximum: Double,  // Unit maximum value
  conversionSteps: List[ConversionStep]  // Conversion steps list
  
)
