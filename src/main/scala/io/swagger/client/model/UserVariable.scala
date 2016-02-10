package io.swagger.client.model

import org.joda.time.DateTime


case class UserVariable (
  parent_id: Integer,  // ID of the parent variable if this variable has any parent
  user_id: Integer,  // User ID
  client_id: String,  // client_id
  variable_id: Integer,  // ID of variable
  default_unit_id: Integer,  // ID of unit to use for this variable
  minimum_allowed_value: Float,  // Minimum reasonable value for this variable (uses default unit)
  maximum_allowed_value: Float,  // Maximum reasonable value for this variable (uses default unit)
  filling_value: Float,  // Value for replacing null measurements
  join_with: Integer,  // The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables
  onset_delay: Integer,  // How long it takes for a measurement in this variable to take effect
  duration_of_action: Integer,  // Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect
  variable_category_id: Integer,  // ID of variable category
  updated: Integer,  // updated
  public: Integer,  // Is variable public
  cause_only: Boolean,  // A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user
  filling_type: String,  // 0 -&gt; No filling, 1 -&gt; Use filling-value
  number_of_measurements: Integer,  // Number of measurements
  number_of_processed_measurements: Integer,  // Number of processed measurements
  measurements_at_last_analysis: Integer,  // Number of measurements at last analysis
  last_unit_id: Integer,  // ID of last Unit
  last_original_unit_id: Integer,  // ID of last original Unit
  last_value: Float,  // Last Value
  last_original_value: Integer,  // Last original value which is stored
  last_source_id: Integer,  // ID of last source
  number_of_correlations: Integer,  // Number of correlations for this variable
  status: String,  // status
  error_message: String,  // error_message
  last_successful_update_time: DateTime,  // When this variable or its settings were last updated
  standard_deviation: Float,  // Standard deviation
  variance: Float,  // Variance
  minimum_recorded_value: Float,  // Minimum recorded value of this variable
  maximum_recorded_daily_value: Float,  // Maximum recorded daily value of this variable
  mean: Float,  // Mean
  median: Float,  // Median
  most_common_unit_id: Integer,  // Most common Unit ID
  most_common_value: Float,  // Most common value
  number_of_unique_daily_values: Float,  // Number of unique daily values
  number_of_changes: Integer,  // Number of changes
  skewness: Float,  // Skewness
  kurtosis: Float,  // Kurtosis
  latitude: Float,  // Latitude
  longitude: Float,  // Longitude
  location: String,  // Location
  experiment_start_time: DateTime,  // Earliest measurement start_time to be used in analysis. Use ISO 8601 datetime format
  experiment_end_time: DateTime,  // Latest measurement start_time to be used in analysis. Use ISO 8601 datetime format
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime,  // When the record in the database was last updated. Use ISO 8601 datetime format
  outcome: Boolean,  // Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables
  sources: String,  // Comma-separated list of source names to limit variables to those sources
  earliest_source_time: Integer,  // Earliest source time
  latest_source_time: Integer,  // Latest source time
  earliest_measurement_time: Integer,  // Earliest measurement time
  latest_measurement_time: Integer,  // Latest measurement time
  earliest_filling_time: Integer,  // Earliest filling time
  latest_filling_time: Integer  // Latest filling time
  
)
