package io.swagger.client.model

import org.joda.time.DateTime


case class CommonVariableRelationship (
  id: Integer,  // id
  confidence_level: String,  // Our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors
  confidence_score: Float,  // A quantitative representation of our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors
  direction: String,  // Direction is positive if higher predictor values generally precede higher outcome values. Direction is negative if higher predictor values generally precede lower outcome values.
  duration_of_action: Integer,  // duration_of_action
  error_message: String,  // error_message
  onset_delay: Integer,  // User estimated (or default number of seconds) after cause measurement before a perceivable effect is observed
  outcome_variable_id: Integer,  // Variable ID for the outcome variable
  predictor_variable_id: Integer,  // Variable ID for the predictor variable
  predictor_unit_id: Integer,  // ID for default unit of the predictor variable
  sinn_rank: Float,  // A value representative of the relevance of this predictor relative to other predictors of this outcome.  Usually used for relevancy sorting.
  strength_score: Float,  // A value represented to the size of the effect which the predictor appears to have on the outcome.
  strength_level: String,  // Can be weak, medium, or strong based on the size of the effect which the predictor appears to have on the outcome relative to other variable relationship strength scores.
  up_votes: Integer,  // Number of users who feel that there is a plausible causal relationship between the predictor and outcome variables.
  down_votes: Integer,  // Number of users who do not feel that there is a plausible causal relationship between the predictor and outcome variables.
  value_predicting_high_outcome: Float,  // Value for the predictor variable (in it&#39;s default unit) which typically precedes an above average outcome value
  value_predicting_low_outcome: Float,  // Value for the predictor variable (in it&#39;s default unit) which typically precedes a below average outcome value
  number_of_users: Integer,  // Number of users whose data was aggregated to obtain this relationship
  data_source: String  // Source of data for this common variable relationship
  
)
