package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate

internal class ExtraHoliday1959 : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date == LocalDate(1959, 4, 10))
    }

    override fun holidayName(date: LocalDate): String {
        return "皇太子・明仁親王の結婚の儀"
    }
}