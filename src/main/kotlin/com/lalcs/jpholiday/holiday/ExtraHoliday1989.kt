package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate

internal class ExtraHoliday1989 : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date == LocalDate(1989, 2, 24))
    }

    override fun holidayName(date: LocalDate): String {
        return "昭和天皇の大喪の礼"
    }
}