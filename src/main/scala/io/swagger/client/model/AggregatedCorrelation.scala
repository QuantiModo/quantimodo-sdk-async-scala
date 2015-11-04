package io.swagger.client.model

import org.joda.time.DateTime


case class AggregatedCorrelation (
  id: Integer,  // id
  correlation: Float,  // correlation
  cause_id: Integer,  // cause_id
  effect_id: Integer,  // effect_id
  onset_delay: Integer,  // onset_delay
  duration_of_action: Integer,  // duration_of_action
  number_of_pairs: Integer,  // number_of_pairs
  value_predicting_high_outcome: Float,  // value_predicting_high_outcome
  value_predicting_low_outcome: Float,  // value_predicting_low_outcome
  optimal_pearson_product: Float,  // optimal_pearson_product
  vote: Float,  // vote
  number_of_users: Integer,  // number_of_users
  number_of_correlations: Integer,  // number_of_correlations
  statistical_significance: Float,  // statistical_significance
  cause_unit: String,  // cause_unit
  cause_unit_id: Integer,  // cause_unit_id
  cause_changes: Integer,  // cause_changes
  effect_changes: Integer,  // effect_changes
  aggregate_qm_score: Float,  // aggregate_qm_score
  created_at: DateTime,  // created_at
  updated_at: DateTime,  // updated_at
  status: String,  // status
  error_message: String,  // error_message
  last_successful_update_time: DateTime,  // last_successful_update_time
  reverse_pearson_correlation_coefficient: Float,  // reverse_pearson_correlation_coefficient
  predictive_pearson_correlation_coefficient: Float  // predictive_pearson_correlation_coefficient
  
)
