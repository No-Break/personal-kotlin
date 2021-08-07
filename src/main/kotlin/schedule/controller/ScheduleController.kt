package schedule.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import schedule.service.ScheduleService
import schedule.smschedule.Schedule

@RestController
class ScheduleController(var scheduleService: ScheduleService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addSchedule(@RequestParam(value="title") title:String,
                    @RequestParam(value="authority") authority:String,
                    @RequestParam(value="appointedtime")appointedtime:String,
                    @RequestParam(value="checkAlarm")checkAlarm:String):ResponseEntity<Schedule>{
        return ResponseEntity.ok().body(scheduleService.addSchedule(title,authority,appointedtime,checkAlarm))

    }

}
