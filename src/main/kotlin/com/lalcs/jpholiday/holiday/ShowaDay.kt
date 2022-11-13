package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class ShowaDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date.year >= 2007 && date.month == Month.APRIL && date.dayOfMonth == 29)
    }

    override fun holidayName(date: LocalDate): String {
        return "昭和の日"
    }
}