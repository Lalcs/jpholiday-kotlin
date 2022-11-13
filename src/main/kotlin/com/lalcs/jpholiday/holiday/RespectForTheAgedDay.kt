package com.lalcs.jpholiday.holiday

import com.lalcs.jpholiday.calcDate.CalcWeekDay
import com.lalcs.jpholiday.calcDate.WeekDay
import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class RespectForTheAgedDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        if (date.year in 1966..2002 && date.month == Month.SEPTEMBER && date.dayOfMonth == 15) return true
        else if (
            date.year >= 2003
            && date == CalcWeekDay.weekDay(
                date.year,
                Month.SEPTEMBER,
                3,
                WeekDay.MONDAY
            )
        ) return true

        return false
    }

    override fun holidayName(date: LocalDate): String {
        return "敬老の日"
    }
}