package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class GreeneryDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        if (date.year in 1989..2006 && date.month == Month.APRIL && date.dayOfMonth == 29) return true
        else if (date.year >= 2007 && date.month == Month.MAY && date.dayOfMonth == 4) return true
        return false
    }

    override fun holidayName(date: LocalDate): String {
        return "みどりの日"
    }
}