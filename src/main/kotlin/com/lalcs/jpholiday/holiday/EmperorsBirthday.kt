package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class EmperorsBirthday : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        // 1948-1988年
        if (date.year in 1948..1988 && date.month == Month.APRIL && date.dayOfMonth == 29) return true
        // 1988-2018年
        else if (date.year in 1988..2018 && date.month == Month.DECEMBER && date.dayOfMonth == 23) return true
        // 2019: 国民の祝日に関する法律(昭和23年法律第178号)の一部改正
        else if (date.year >= 2020 && date.month == Month.FEBRUARY && date.dayOfMonth == 23) return true
        return false
    }

    override fun holidayName(date: LocalDate): String {
        return "天皇誕生日"
    }
}