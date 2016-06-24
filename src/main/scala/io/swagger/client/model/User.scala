package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class User (
  id: Integer,  // User id
wpId: Integer,  // Wordpress user id
displayName: String,  // User display name
loginName: String,  // User login name
email: String,  // User email
token: String,  // User token
administrator: Boolean  // Is user administrator
)
