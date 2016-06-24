package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TrackingReminder (
  id: Option[Integer],  // id
clientId: Option[String],  // clientId
userId: Option[Integer],  // ID of User
variableId: Integer,  // Id for the variable to be tracked
defaultValue: Option[Float],  // Default value to use for the measurement when tracking
reminderStartTime: Option[String],  // Earliest time of day at which reminders should appear in UTC HH:MM:SS format
reminderEndTime: Option[String],  // Latest time of day at which reminders should appear in UTC HH:MM:SS format
reminderSound: Option[String],  // String identifier for the sound to accompany the reminder
reminderFrequency: Option[Integer],  // Number of seconds between one reminder and the next
popUp: Option[Boolean],  // True if the reminders should appear as a popup notification
sms: Option[Boolean],  // True if the reminders should be delivered via SMS
email: Option[Boolean],  // True if the reminders should be delivered via email
notificationBar: Option[Boolean],  // True if the reminders should appear in the notification bar
lastReminded: Option[DateTime],  // ISO 8601 timestamp for the last time a reminder was sent
lastTracked: Option[DateTime],  // ISO 8601 timestamp for the last time a measurement was received for this user and variable
firstDailyReminderTime: Option[String],  // Specific first time of day that the user should be reminded to track in UTC HH:MM:SS format
secondDailyReminderTime: Option[String],  // Specific second time of day that the user should be reminded to track in UTC HH:MM:SS format
thirdDailyReminderTime: Option[String],  // Specific third time of day that the user should be reminded to track in UTC HH:MM:SS format
startTrackingDate: Option[String],  // Earliest date on which the user should be reminded to track in YYYY-MM-DD format
stopTrackingDate: Option[String],  // Latest date on which the user should be reminded to track in YYYY-MM-DD format
updatedAt: Option[DateTime],  // When the record in the database was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local.
variableName: Option[String],  // Name of the variable to be used when sending measurements
variableCategoryName: Option[String],  // Name of the variable category to be used when sending measurements
abbreviatedUnitName: Option[String],  // Abbreviated name of the unit to be used when sending measurements
combinationOperation: Option[String]  // The way multiple measurements are aggregated over time
)
