package io.swagger.client.model

import org.joda.time.DateTime


case class PostCorrelation (
  cause: String,  // Cause variable name
  effect: String,  // Effect variable name
  correlation: Double,  // Correlation value
  vote: Integer  // Vote: 0 or 1
  
)
