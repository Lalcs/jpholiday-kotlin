package com.lalcs.jpholiday.holiday

import com.lalcs.jpholiday.Holiday
import com.lalcs.jpholiday.PublicHolidayRegistry
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.plus

internal class TransferHoliday : HolidayInterface {
    private val registry = PublicHolidayRegistry

    override fun isHoliday(date: LocalDate): Boolean {
        return transferBaseHoliday(date)?.let { true } ?: false
    }

    override fun holidayName(date: LocalDate): String {
        return transferBaseHoliday(date)?.let { "%s 振替休日".format(it.name) } ?: "振替休日"
    }

    private fun transferBaseHoliday(date: LocalDate): Holiday? {
        // 1973年(昭和48年)4月12日 - 改正・施行
        if (date.year < 1973) return null
        // 日曜日に振替休日は存在しない
        if (date.dayOfWeek == DayOfWeek.SUNDAY) return null

        val filteredRegistry = registry.get().filter { it !is TransferHoliday && it !is NationalHoliday }

        // 祝日が存在する日に振替休日は存在しない
        if (filteredRegistry.any { it.isHoliday(date) }) return null

        var currentDate = date.plus(DatePeriod(days = -1))
        while (true) {
            // 祝日でなければ
            if (filteredRegistry.none { it.isHoliday(currentDate) }) return null

            // 日曜日でかつ、祝日であれば
            if (currentDate.dayOfWeek == DayOfWeek.SUNDAY) {
                return filteredRegistry.filter { it.isHoliday(currentDate) }.first().let {
                    Holiday(
                        name = it.holidayName(currentDate),
                        date = currentDate
                    )
                }
            }

            // 祝日であれば継続
            currentDate = currentDate.plus(DatePeriod(days = -1))
        }
    }
}