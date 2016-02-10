package io.swagger.client.model

import org.joda.time.DateTime


case class Connection (
  id: Integer,  // id
  user_id: Integer,  // ID of user that owns this correlation
  connector_id: Integer,  // The id for the connector data source for which the connection is connected
  connect_status: String,  // Indicates whether a connector is currently connected to a service for a user.
  connect_error: String,  // Error message if there is a problem with authorizing this connection.
  update_requested_at: DateTime,  // Time at which an update was requested by a user.
  update_status: String,  // Indicates whether a connector is currently updated.
  update_error: String,  // Indicates if there was an error during the update.
  last_successful_updated_at: DateTime,  // The time at which the connector was last successfully updated.
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime  // When the record in the database was last updated. Use ISO 8601 datetime format
  
)
