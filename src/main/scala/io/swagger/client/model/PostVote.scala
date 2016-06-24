package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PostVote (
  cause: String,  // Cause variable name
effect: String,  // Effect variable name
vote: Boolean  // Vote: 0 (for implausible) or 1 (for plausible)
)
