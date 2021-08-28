package schedule.service

import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.stereotype.Component
import schedule.repository.ScheduleRepository
import schedule.smschedule.Schedule

@Component
class ScheduleServiceImpl(var scheduleRepository: ScheduleRepository): ScheduleService {

    override fun addSchedule(title:String,authority:String,appointedtime:String,checkAlarm:String): Schedule {
        return scheduleRepository.save(Schedule(title,authority,appointedtime,checkAlarm))
    }

    override fun deleteSchedule(id: Long) {
            scheduleRepository.deleteById(id)
    }
}
