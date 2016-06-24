package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class UserVariable (
  parent_id: Option[Integer],  // ID of the parent variable if this variable has any parent
user_id: Option[Integer],  // User ID
client_id: Option[String],  // client_id
variable_id: Integer,  // ID of variable
default_unit_id: Option[Integer],  // ID of unit to use for this variable
minimum_allowed_value: Option[Float],  // Minimum reasonable value for this variable (uses default unit)
maximum_allowed_value: Option[Float],  // Maximum reasonable value for this variable (uses default unit)
filling_value: Option[Float],  // Value for replacing null measurements
join_with: Option[Integer],  // The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables
onset_delay: Option[Integer],  // How long it takes for a measurement in this variable to take effect
duration_of_action: Option[Integer],  // Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect
variable_category_id: Option[Integer],  // ID of variable category
updated: Option[Integer],  // updated
public: Option[Integer],  // Is variable public
cause_only: Option[Boolean],  // A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user
filling_type: Option[String],  // 0 -&gt; No filling, 1 -&gt; Use filling-value
number_of_measurements: Option[Integer],  // Number of measurements
number_of_processed_measurements: Option[Integer],  // Number of processed measurements
measurements_at_last_analysis: Option[Integer],  // Number of measurements at last analysis
last_unit_id: Option[Integer],  // ID of last Unit
last_original_unit_id: Option[Integer],  // ID of last original Unit
last_value: Option[Float],  // Last Value
last_original_value: Option[Integer],  // Last original value which is stored
last_source_id: Option[Integer],  // ID of last source
number_of_correlations: Option[Integer],  // Number of correlations for this variable
status: Option[String],  // status
error_message: Option[String],  // error_message
last_successful_update_time: Option[DateTime],  // When this variable or its settings were last updated
standard_deviation: Option[Float],  // Standard deviation
variance: Option[Float],  // Variance
minimum_recorded_value: Option[Float],  // Minimum recorded value of this variable
maximum_recorded_daily_value: Option[Float],  // Maximum recorded daily value of this variable
mean: Option[Float],  // Mean
median: Option[Float],  // Median
most_common_unit_id: Option[Integer],  // Most common Unit ID
most_common_value: Option[Float],  // Most common value
number_of_unique_daily_values: Option[Float],  // Number of unique daily values
number_of_changes: Option[Integer],  // Number of changes
skewness: Option[Float],  // Skewness
kurtosis: Option[Float],  // Kurtosis
latitude: Option[Float],  // Latitude
longitude: Option[Float],  // Longitude
location: Option[String],  // Location
experiment_start_time: Option[DateTime],  // Earliest measurement start_time to be used in analysis. Use ISO 8601 datetime format
experiment_end_time: Option[DateTime],  // Latest measurement start_time to be used in analysis. Use ISO 8601 datetime format
created_at: Option[DateTime],  // When the record was first created. Use ISO 8601 datetime format
updated_at: Option[DateTime],  // When the record in the database was last updated. Use ISO 8601 datetime format
outcome: Option[Boolean],  // Outcome variables (those with &#x60;outcome&#x60; &#x3D;&#x3D; 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables
sources: Option[String],  // Comma-separated list of source names to limit variables to those sources
earliest_source_time: Option[Integer],  // Earliest source time
latest_source_time: Option[Integer],  // Latest source time
earliest_measurement_time: Option[Integer],  // Earliest measurement time
latest_measurement_time: Option[Integer],  // Latest measurement time
earliest_filling_time: Option[Integer],  // Earliest filling time
latest_filling_time: Option[Integer]  // Latest filling time
)
