package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class ConstitutionMemorialDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date.month == Month.MAY && date.dayOfMonth == 3)
    }

    override fun holidayName(date: LocalDate): String {
        return "憲法記念日"
    }
}