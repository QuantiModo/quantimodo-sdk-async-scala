package io.swagger.client.model

import org.joda.time.DateTime


case class VariableCategory (
  id: Integer,  // id
  name: String,  // Name of the category
  filling_value: Float,  // Value for replacing null measurements
  maximum_allowed_value: Float,  // Maximum recorded value of this category
  minimum_allowed_value: Float,  // Minimum recorded value of this category
  duration_of_action: Integer,  // How long the effect of a measurement in this variable lasts
  onset_delay: Integer,  // How long it takes for a measurement in this variable to take effect
  combination_operation: String,  // How to combine values of this variable (for instance, to see a summary of the values over a month) 0 for sum OR 1 for mean
  updated: Integer,  // updated
  cause_only: Boolean,  // A value of 1 indicates that this category is generally a cause in a causal relationship.  An example of a causeOnly category would be a category such as Work which would generally not be influenced by the behaviour of the user
  public: Integer,  // Is category public
  outcome: Boolean,  // outcome
  created_at: DateTime,  // created_at
  updated_at: DateTime,  // updated_at
  image_url: String,  // Image URL
  default_unit_id: Integer  // ID of the default unit for the category
  
)
