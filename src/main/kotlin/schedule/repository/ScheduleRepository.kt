package schedule.repository

import org.springframework.data.repository.CrudRepository
import schedule.smschedule.Schedule

interface ScheduleRepository : CrudRepository<Schedule,Long> {
    fun findByid(id:String) : Schedule
}
