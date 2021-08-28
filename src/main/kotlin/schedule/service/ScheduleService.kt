package schedule.service

import schedule.smschedule.Schedule

public interface ScheduleService {
    fun addSchedule(title: String, authority: String, appointedtime: String, checkAlarm: String): Schedule
    fun deleteSchedule(id: Long)
}
