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
    fun addSchedule(
        @RequestParam title: String,
        @RequestParam authority: String,
        @RequestParam appointedtime: String,
        @RequestParam checkAlarm: String
    ): ResponseEntity<Schedule> {
        return ResponseEntity.ok().body(scheduleService.addSchedule(title, authority, appointedtime, checkAlarm))

    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    fun deletePost(@PathVariable id: Long) {
        return scheduleService.deleteSchedule(id)
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun addSchedule(@RequestParam authority: String): ResponseEntity<Schedule> {
        return ResponseEntity.ok().body(scheduleService.getSchedule(authority))
    }

}
