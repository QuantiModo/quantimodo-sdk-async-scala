package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class VoteDelete (
  cause: String,  // Cause variable name for the correlation to which the vote pertains
effect: String  // Effect variable name for the correlation to which the vote pertains
)
