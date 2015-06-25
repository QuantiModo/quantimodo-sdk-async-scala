package io.swagger.client.model

import org.joda.time.DateTime


case class UserTokenSuccessfulResponse (
  code: Integer,  // Status code
  message: String,  // Message
  user: UserTokenSuccessfulResponseInnerUserField
  
)
