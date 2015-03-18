package io.swagger.client.model

import org.joda.time.DateTime


case class Permission (
  target: Integer,  // Grant permission to target user or public so they may access measurements within the given parameters. TODO: Rename target to something more intuitive.
  variableName: String,  // ORIGINAL Variable name
  min_timestamp: Integer,  // Earliest time when measurements will be accessible in epoch seconds
  max_timestamp: Integer,  // Latest time when measurements will be accessible in epoch seconds
  min_time_of_day: Integer,  // Earliest time of day when measurements will be accessible in epoch seconds
  max_time_of_day: Integer,  // Latest time of day when measurements will be accessible in epoch seconds
  week: String  // Maybe specifies if only weekday measurements should be accessible
  
)
