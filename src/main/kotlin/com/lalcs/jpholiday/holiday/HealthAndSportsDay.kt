package com.lalcs.jpholiday.holiday

import com.lalcs.jpholiday.calcDate.CalcWeekDay
import com.lalcs.jpholiday.calcDate.WeekDay
import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class HealthAndSportsDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        if (date.year in 1966..1999 && date.month == Month.OCTOBER && date.dayOfMonth == 10) return true
        else if (
            date.year in 2000..2019
            && date == CalcWeekDay.weekDay(
                date.year,
                Month.OCTOBER,
                2,
                WeekDay.MONDAY
            )
        ) return true

        return false
    }

    override fun holidayName(date: LocalDate): String {
        return "体育の日"
    }
}