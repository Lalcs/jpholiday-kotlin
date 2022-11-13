package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class LaborThanksgivingDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date.month == Month.NOVEMBER && date.dayOfMonth == 23)
    }

    override fun holidayName(date: LocalDate): String {
        return "勤労感謝の日"
    }
}