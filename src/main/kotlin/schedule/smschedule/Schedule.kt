package schedule.smschedule

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Schedule(
    var title: String,
    var authority: String,
    var appointedtime: String,
    var checkAlarm: String,
    @Id
    @GeneratedValue
    var id: Long? = null
)
