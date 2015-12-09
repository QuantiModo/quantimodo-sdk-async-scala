package io.swagger.client.model

import org.joda.time.DateTime


case class Variable (
  id: Integer,  // id
  client_id: String,  // client_id
  parent_id: Integer,  // ID of the parent variable if this variable has any parent
  name: String,  // User-defined variable display name
  variable_category_id: Integer,  // Variable category ID
  default_unit_id: Integer,  // ID of the default unit of measurement to use for this variable
  combination_operation: String,  // How to combine values of this variable (for instance, to see a summary of the values over a month) SUM or MEAN
  filling_value: Float,  // Value for replacing null measurements
  maximum_allowed_value: Float,  // Maximum reasonable value for this variable (uses default unit)
  minimum_allowed_value: Float,  // Minimum reasonable value for this variable (uses default unit)
  onset_delay: Integer,  // How long it takes for a measurement in this variable to take effect
  duration_of_action: Integer,  // How long the effect of a measurement in this variable lasts
  public: Integer,  // Is variable public
  cause_only: Boolean,  // A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user
  most_common_value: Float,  // Most common value
  most_common_unit_id: Integer,  // Most common Unit
  standard_deviation: Float,  // Standard Deviation
  variance: Float,  // Variance
  mean: Float,  // Mean
  median: Float,  // Median
  number_of_measurements: Float,  // Number of measurements
  number_of_unique_values: Float,  // Number of unique values
  skewness: Float,  // Skewness
  kurtosis: Float,  // Kurtosis
  status: String,  // status
  error_message: String,  // error_message
  last_successful_update_time: DateTime,  // When this variable or its settings were last updated
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime,  // When the record in the database was last updated. Use ISO 8601 datetime format
  product_url: String,  // Product URL
  image_url: String,  // Image URL
  price: Float,  // Price
  number_of_user_variables: Integer,  // Number of variables
  outcome: Boolean,  // Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables.
  minimum_recorded_value: Float,  // Minimum recorded value of this variable
  maximum_recorded_value: Float  // Maximum recorded value of this variable
  
)
