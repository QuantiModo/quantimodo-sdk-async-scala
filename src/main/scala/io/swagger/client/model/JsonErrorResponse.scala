package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class JsonErrorResponse (
  status: String,  // Status: \&quot;ok\&quot; or \&quot;error\&quot;
message: Option[String]  // Error message
)
