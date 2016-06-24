package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PostCorrelation (
  cause: String,  // Cause variable name
effect: String,  // Effect variable name
correlation: Double,  // Correlation value
vote: Option[Integer]  // Vote: 0 or 1
)
