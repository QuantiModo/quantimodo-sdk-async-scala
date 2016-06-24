package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ConversionStep (
  operation: String,  // ADD or MULTIPLY
value: Double  // This specifies the order of conversion steps starting with 0
)
