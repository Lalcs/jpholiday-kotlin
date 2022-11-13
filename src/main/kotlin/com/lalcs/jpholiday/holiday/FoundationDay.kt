package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class FoundationDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        if (date.year >= 1967 && date.month == Month.FEBRUARY && date.dayOfMonth == 11) return true
        return false
    }

    override fun holidayName(date: LocalDate): String {
        return "建国記念の日"
    }
}