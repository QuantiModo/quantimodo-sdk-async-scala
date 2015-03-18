package io.swagger.client.model

import org.joda.time.DateTime


case class Variable (
  name: String,  // User-defined variable display name.
  originalName: String,  // Name used when the variable was originally created in the `variables` table.
  category: String,  // Variable category like Mood, Sleep, Physical Activity, Treatment, Symptom, etc.
  unit: String,  // Abbreviated name of the default unit for the variable
  sources: String,  // Comma-separated list of source names to limit variables to those sources
  minimumValue: Double,  // Minimum reasonable value for this variable (uses default unit)
  maximumValue: Double,  // Maximum reasonable value for this variable (uses default unit)
  combinationOperation: String,  // How to aggregate measurements over time.
  fillingValue: Double  // Value for replacing null measurements
  
)
