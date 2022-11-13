package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class NewYear : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date.month == Month.JANUARY && date.dayOfMonth == 1)
    }

    override fun holidayName(date: LocalDate): String {
        return "元日"
    }
}