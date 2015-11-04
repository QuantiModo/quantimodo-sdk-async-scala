package io.swagger.client.model

import org.joda.time.DateTime


case class Variable (
  id: Integer,  // id
  client_id: String,  // client_id
  parent_id: Integer,  // parent_id
  name: String,  // Name of the variable
  variable_category_id: Integer,  // Category of the variable
  default_unit_id: Integer,  // ID of the default unit of measurement to use for this variable
  combination_operation: String,  // How to combine values of this variable (for instance, to see a summary of the values over a month) 0 for sum OR 1 for mean
  filling_value: Float,  // filling_value
  maximum_allowed_value: Float,  // maximum_allowed_value
  minimum_allowed_value: Float,  // minimum_allowed_value
  onset_delay: Integer,  // onset_delay
  duration_of_action: Integer,  // duration_of_action
  public: Integer,  // public
  cause_only: Boolean,  // cause_only
  most_common_value: Float,  // most_common_value
  most_common_unit_id: Integer,  // most_common_unit_id
  standard_deviation: Float,  // standard_deviation
  variance: Float,  // variance
  mean: Float,  // mean
  median: Float,  // median
  number_of_measurements: Float,  // number_of_measurements
  number_of_unique_values: Float,  // number_of_unique_values
  skewness: Float,  // skewness
  kurtosis: Float,  // kurtosis
  status: String,  // status
  error_message: String,  // error_message
  last_successful_update_time: DateTime,  // last_successful_update_time
  created_at: DateTime,  // created_at
  updated_at: DateTime,  // updated_at
  product_url: String,  // product_url
  image_url: String,  // image_url
  price: Float,  // price
  number_of_user_variables: Integer,  // number_of_user_variables
  outcome: Boolean,  // outcome
  minimum_recorded_value: Float,  // minimum_recorded_value
  maximum_recorded_value: Float  // maximum_recorded_value
  
)
