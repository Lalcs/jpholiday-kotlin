package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class CultureDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date.month == Month.NOVEMBER && date.dayOfMonth == 3)
    }

    override fun holidayName(date: LocalDate): String {
        return "文化の日"
    }
}