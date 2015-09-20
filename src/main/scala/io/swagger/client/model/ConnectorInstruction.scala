package io.swagger.client.model

import org.joda.time.DateTime


case class ConnectorInstruction (
  url: String,  // url
  parameters: List[String],  // parameters array
  usePopup: Boolean  // usePopup
  
)
