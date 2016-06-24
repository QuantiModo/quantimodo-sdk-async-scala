package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TrackingReminderNotification (
  id: Integer,  // id for the specific PENDING tracking remidner
trackingReminderId: Integer,  // id for the repeating tracking remidner
clientId: Option[String],  // clientId
userId: Option[Integer],  // ID of User
variableId: Option[Integer],  // Id for the variable to be tracked
pendingReminderTime: Option[DateTime],  // ISO 8601 timestamp for the specific time the variable should be tracked in UTC.  This will be used for the measurement startTime if the track endpoint is used.
defaultValue: Option[Float],  // Default value to use for the measurement when tracking
reminderSound: Option[String],  // String identifier for the sound to accompany the reminder
popUp: Option[Boolean],  // True if the reminders should appear as a popup notification
sms: Option[Boolean],  // True if the reminders should be delivered via SMS
email: Option[Boolean],  // True if the reminders should be delivered via email
notificationBar: Option[Boolean],  // True if the reminders should appear in the notification bar
updatedAt: Option[DateTime],  // When the record in the database was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local.
variableName: Option[String],  // Name of the variable to be used when sending measurements
variableCategoryName: Option[String],  // Name of the variable category to be used when sending measurements
abbreviatedUnitName: Option[String],  // Abbreviated name of the unit to be used when sending measurements
combinationOperation: Option[String]  // The way multiple measurements are aggregated over time
)
