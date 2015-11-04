package io.swagger.client.model

import org.joda.time.DateTime


case class UnitConversion (
  unit_id: Integer,  // unit_id
  step_number: Boolean,  // step in the conversion process
  operation: Boolean,  // 0 is add and 1 is multiply
  value: Float,  // number used in the operation
  created_at: DateTime,  // created_at
  updated_at: DateTime  // updated_at
  
)
