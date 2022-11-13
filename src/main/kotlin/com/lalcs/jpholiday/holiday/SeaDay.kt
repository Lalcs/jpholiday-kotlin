package com.lalcs.jpholiday.holiday

import com.lalcs.jpholiday.calcDate.CalcWeekDay
import com.lalcs.jpholiday.calcDate.WeekDay
import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class SeaDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        // 2020: 国民の祝日に関する法律(昭和23年法律第178号)の特例
        if (date == LocalDate(2020, 7, 23)) return true

        // 2021: 五輪特別措置法改正案
        if (date == LocalDate(2021, 7, 22)) return true

        if (date.year in 1996..2002 && date.month == Month.JULY && date.dayOfMonth == 20) return true
        // 2020: 国民の祝日に関する法律の一部を改正する法律(平成30年法律第57号)
        else if (date.year >= 2003 && date == CalcWeekDay.weekDay(date.year, Month.JULY, 3, WeekDay.MONDAY)) return true

        return false
    }

    override fun holidayName(date: LocalDate): String {
        return "海の日"
    }
}