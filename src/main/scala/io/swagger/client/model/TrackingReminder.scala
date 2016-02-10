package io.swagger.client.model

import org.joda.time.DateTime


case class TrackingReminder (
  id: Integer,  // id
  client_id: String,  // client_id
  user_id: Integer,  // ID of User
  variable_id: Integer,  // Id for the variable to be tracked
  default_value: Float,  // Default value to use for the measurement when tracking
  reminder_start_time: String,  // Earliest time of day at which reminders should appear
  reminder_end_time: String,  // Latest time of day at which reminders should appear
  reminder_sound: String,  // String identifier for the sound to accompany the reminder
  reminder_frequency: Integer,  // Number of seconds between one reminder and the next
  pop_up: Boolean,  // True if the reminders should appear as a popup notification
  sms: Boolean,  // True if the reminders should be delivered via SMS
  email: Boolean,  // True if the reminders should be delivered via email
  notification_bar: Boolean,  // True if the reminders should appear in the notification bar
  last_reminded: DateTime,  // ISO 8601 timestamp for the last time a reminder was sent
  last_tracked: DateTime,  // ISO 8601 timestamp for the last time a measurement was received for this user and variable
  created_at: DateTime,  // When the record was first created. Use ISO 8601 datetime format
  updated_at: DateTime  // When the record in the database was last updated. Use ISO 8601 datetime format
  
)
