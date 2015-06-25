package io.swagger.client.model

import org.joda.time.DateTime


case class VariableNew (
  name: String,  // User-defined variable display name.
  category: String,  // Variable category like Mood, Sleep, Physical Activity, Treatment, Symptom, etc.
  unit: String,  // Abbreviated name of the default unit for the variable
  combinationOperation: String,  // How to aggregate measurements over time.
  parent: String  // Parent
  
)
