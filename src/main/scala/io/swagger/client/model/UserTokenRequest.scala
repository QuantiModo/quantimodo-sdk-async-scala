package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class UserTokenRequest (
  user: Option[UserTokenRequestInnerUserField],
organizationAccessToken: String  // Organization Access token
)
