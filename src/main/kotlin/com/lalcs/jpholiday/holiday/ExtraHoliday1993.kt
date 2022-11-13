package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate

internal class ExtraHoliday1993 : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date == LocalDate(1993, 6, 9))
    }

    override fun holidayName(date: LocalDate): String {
        return "皇太子・皇太子徳仁親王の結婚の儀"
    }
}