package io.swagger.client.model

import org.joda.time.DateTime


case class UserTokenRequest (
  user: UserTokenRequestInnerUserField,
  organization_access_token: String  // Organization Access token
  
)
