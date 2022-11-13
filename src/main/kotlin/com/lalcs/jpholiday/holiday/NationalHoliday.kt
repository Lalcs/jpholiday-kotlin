package com.lalcs.jpholiday.holiday

import com.lalcs.jpholiday.PublicHolidayRegistry
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.plus

internal class NationalHoliday : HolidayInterface {
    private val registry = PublicHolidayRegistry

    override fun isHoliday(date: LocalDate): Boolean {
        // 国民の休日は日曜日は存在しない
        if (date.dayOfWeek == DayOfWeek.SUNDAY) return false

        val filteredRegistry = registry.get().filter { it !is NationalHoliday }

        // 祝日の場合は判定しない
        if (filteredRegistry.any { it.isHoliday(date) }) return false

        if (
            filteredRegistry.any { it.isHoliday(date.plus(DatePeriod(days = 1))) }
            && filteredRegistry.any { it.isHoliday(date.plus(DatePeriod(days = -1))) }
        ) return true

        return false
    }

    override fun holidayName(date: LocalDate): String {
        return "国民の休日"
    }
}