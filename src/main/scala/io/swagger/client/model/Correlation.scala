package io.swagger.client.model

import org.joda.time.DateTime


case class Correlation (
  id: Integer,  // id
  timestamp: Integer,  // Time at which correlation was calculated
  user_id: Integer,  // ID of user that owns this correlation
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
  statistical_significance: Float,  // A function of the effect size and sample size
  cause_unit: String,  // Unit of the predictor variable
  cause_unit_id: Integer,  // Unit ID of the predictor variable
  cause_changes: Integer,  // Cause changes
  effect_changes: Integer,  // Effect changes
  qm_score: Float,  // QM Score
  error: String,  // error
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime,  // When the record in the database was last updated. Use ISO 8601 datetime format
  reverse_pearson_correlation_coefficient: Float,  // Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation
  predictive_pearson_correlation_coefficient: Float  // Predictive Pearson Correlation Coefficient
  
)
