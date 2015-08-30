package io.swagger.client.model

import org.joda.time.DateTime


case class ConnectorInfo (
  id: Integer,  // Connector ID number
  connected: Boolean,  // True if the authenticated user has this connector enabled
  error: String,  // Error message. Empty if connected.
  history: List[ConnectorInfoHistoryItem]
  
)
