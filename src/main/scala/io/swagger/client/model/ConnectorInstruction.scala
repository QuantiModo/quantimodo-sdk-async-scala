package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ConnectorInstruction (
  url: Option[String],  // url
parameters: Option[List[String]],  // parameters array
usePopup: Option[Boolean]  // usePopup
)
