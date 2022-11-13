package com.lalcs.jpholiday.holiday

import com.lalcs.jpholiday.calcDate.CalcWeekDay
import com.lalcs.jpholiday.calcDate.WeekDay
import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class SportsDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        // 2020: 国民の祝日に関する法律(昭和23年法律第178号)の特例
        if (date == LocalDate(2020, 7, 24)) return true

        // 2021: 五輪特別措置法改正案
        if (date == LocalDate(2021, 7, 23)) return true

        // 2020: 国民の祝日に関する法律の一部を改正する法律(平成30年法律第57号)
        //       国民の祝日に関する法律(昭和23年法律第178号)の特例
        return (date.year >= 2020 && date == CalcWeekDay.weekDay(date.year, Month.OCTOBER, 2, WeekDay.MONDAY))
    }

    override fun holidayName(date: LocalDate): String {
        return "スポーツの日"
    }
}