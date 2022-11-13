package com.lalcs.jpholiday.calcDate

import kotlinx.datetime.LocalDate
import kotlinx.datetime.toKotlinLocalDateTime
import java.time.LocalDateTime
import java.time.Month
import java.time.ZoneId
import java.util.*

internal class CalcWeekDay {
    companion object {
        fun weekDay(year: Int, month: Month, dayOfWeekInMonth: Int, dayOfWeek: WeekDay): LocalDate {
            val calendar = Calendar.getInstance()
            calendar.set(year, timeMonthToCalendarMonth(month), 1, 0, 0, 0)

            while (true) {
                if (calendar.get(Calendar.MONTH) != timeMonthToCalendarMonth(month)) throw RuntimeException("Not Date.")

                if (
                    calendar.get(Calendar.DAY_OF_WEEK) == dayOfWeek.id
                    && calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH) == dayOfWeekInMonth
                ) break
                calendar.add(Calendar.DATE, 1)
            }

            return LocalDate.parse(
                LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault())
                    .toKotlinLocalDateTime()
                    .date
                    .toString()
            )
        }

        private fun timeMonthToCalendarMonth(month: Month): Int {
            return month.value - 1
        }
    }
}