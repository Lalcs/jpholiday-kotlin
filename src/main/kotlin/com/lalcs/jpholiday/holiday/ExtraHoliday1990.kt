package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate

internal class ExtraHoliday1990 : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date == LocalDate(1990, 11, 12))
    }

    override fun holidayName(date: LocalDate): String {
        return "即位の礼正殿の儀"
    }
}