package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class HumanTime (
  date: Option[String],  // date time
timezone_type: Option[Integer],
timezone: Option[String]  // timezone of date time
)
