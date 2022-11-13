package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate

interface HolidayInterface {
    fun isHoliday(date: LocalDate): Boolean
    fun holidayName(date: LocalDate): String
}