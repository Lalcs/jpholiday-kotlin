package com.lalcs.jpholiday.holiday

import com.lalcs.jpholiday.calcDate.CalcWeekDay
import com.lalcs.jpholiday.calcDate.WeekDay
import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class AdultDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        if (date.year <= 1999 && date.month == Month.JANUARY && date.dayOfMonth == 15) {
            return true
        } else if (date.year >= 2000 && date == CalcWeekDay.weekDay(date.year, Month.JANUARY, 2, WeekDay.MONDAY)) {
            return true
        }
        return false
    }

    override fun holidayName(date: LocalDate): String {
        return "成人の日"
    }
}