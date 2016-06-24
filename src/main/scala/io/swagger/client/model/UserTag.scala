package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class UserTag (
  taggedVariableId: Integer,  // This is the id of the variable being tagged with an ingredient or something.
tagVariableId: Integer,  // This is the id of the ingredient variable whose value is determined based on the value of the tagged variable.
conversionFactor: Number  // Number by which we multiply the tagged variable value to obtain the tag variable (ingredient) value
)
