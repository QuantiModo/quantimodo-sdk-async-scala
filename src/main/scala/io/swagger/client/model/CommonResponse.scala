package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class CommonResponse (
  status: Integer,  // Status code
message: Option[String],  // Message
success: Boolean
)
