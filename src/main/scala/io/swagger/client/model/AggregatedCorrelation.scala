package io.swagger.client.model

import org.joda.time.DateTime


case class AggregatedCorrelation (
  id: Integer,  // id
  correlation: Float,  // Pearson correlation coefficient between cause and effect measurements
  cause_id: Integer,  // variable ID of the cause variable for which the user desires correlations
  effect_id: Integer,  // variable ID of the effect variable for which the user desires correlations
  onset_delay: Integer,  // User estimated or default time after cause measurement before a perceivable effect is observed
  duration_of_action: Integer,  // Time over which the cause is expected to produce a perceivable effect following the onset delay
  number_of_pairs: Integer,  // Number of points that went into the correlation calculation
  value_predicting_high_outcome: Float,  // cause value that predicts an above average effect value (in default unit for cause variable)
  value_predicting_low_outcome: Float,  // cause value that predicts a below average effect value (in default unit for cause variable)
  optimal_pearson_product: Float,  // Optimal Pearson Product
  vote: Float,  // Vote
  number_of_users: Integer,  // Number of Users by which correlation is aggregated
  number_of_correlations: Integer,  // Number of Correlations by which correlation is aggregated
  statistical_significance: Float,  // A function of the effect size and sample size
  cause_unit: String,  // Unit of the predictor variable
  cause_unit_id: Integer,  // Unit ID of the predictor variable
  cause_changes: Integer,  // Cause changes
  effect_changes: Integer,  // Effect changes
  aggregate_qm_score: Float,  // Aggregated QM Score
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime,  // When the record in the database was last updated. Use ISO 8601 datetime format
  status: String,  // Status
  error_message: String,  // Error Message
  last_successful_update_time: DateTime,  // Last Successful update time
  reverse_pearson_correlation_coefficient: Float,  // Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation
  predictive_pearson_correlation_coefficient: Float,  // Predictive Pearson Correlation Coefficient
  data_source: String  // Source of data for this correlation
  
)
