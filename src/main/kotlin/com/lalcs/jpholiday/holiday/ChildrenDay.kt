package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class ChildrenDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date.month == Month.MAY && date.dayOfMonth == 5)
    }

    override fun holidayName(date: LocalDate): String {
        return "こどもの日"
    }
}