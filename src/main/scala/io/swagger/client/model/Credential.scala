package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Credential (
  user_id: Option[Integer],  // ID of user that owns this credential
connector_id: Integer,  // The id for the connector data source from which the credential was obtained
attr_key: String,  // Attribute name such as token, userid, username, or password
attr_value: String,  // Encrypted value for the attribute specified
created_at: Option[DateTime],  // When the record was first created. Use ISO 8601 datetime format
updated_at: Option[DateTime]  // When the record in the database was last updated. Use ISO 8601 datetime format
)
