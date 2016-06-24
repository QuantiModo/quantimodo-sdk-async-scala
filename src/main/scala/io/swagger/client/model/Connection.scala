package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Connection (
  id: Option[Integer],  // id
user_id: Option[Integer],  // ID of user that owns this correlation
connector_id: Integer,  // The id for the connector data source for which the connection is connected
connect_status: Option[String],  // Indicates whether a connector is currently connected to a service for a user.
connect_error: Option[String],  // Error message if there is a problem with authorizing this connection.
update_requested_at: Option[DateTime],  // Time at which an update was requested by a user.
update_status: Option[String],  // Indicates whether a connector is currently updated.
update_error: Option[String],  // Indicates if there was an error during the update.
last_successful_updated_at: Option[DateTime],  // The time at which the connector was last successfully updated.
created_at: Option[DateTime],  // When the record was first created. Use ISO 8601 datetime format
updated_at: Option[DateTime]  // When the record in the database was last updated. Use ISO 8601 datetime format
)
