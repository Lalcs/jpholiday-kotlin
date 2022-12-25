package com.lalcs.jpholiday

import com.lalcs.jpholiday.holiday.HolidayInterface
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.plus

class JPHoliday {
    private val publicHolidayRegistry = PublicHolidayRegistry
    private val originalHolidayRegistry = OriginalHolidayRegistry()

    fun isHoliday(date: LocalDate): Boolean {
        return resolveHoliday(date).isNotEmpty()
    }

    fun resolveHoliday(date: LocalDate): List<Holiday> {
        return publicHolidayRegistry.get().filter {
            it.isHoliday(date)
        }.plus(
            originalHolidayRegistry.get().filter {
                it.isHoliday(date)
            }
        ).map {
            Holiday(
                name = it.holidayName(date),
                date = date
            )
        }
    }

    fun monthHolidays(year: Int, month: Int): List<Holiday> {
        val holidays = mutableListOf<Holiday>()
        var currentDate = LocalDate(year, month, 1)

        while (true) {
            if (currentDate.month.value != month) break

            resolveHoliday(currentDate).map { holidays.add(it) }

            currentDate = currentDate.plus(DatePeriod(days = 1))
        }

        return holidays.toList()
    }

    fun yearHolidays(year: Int): List<Holiday> {
        val holidays = mutableListOf<Holiday>()
        var currentDate = LocalDate(year, 1, 1)

        while (true) {
            if (currentDate.year != year) break

            resolveHoliday(currentDate).map { holidays.add(it) }

            currentDate = currentDate.plus(DatePeriod(days = 1))
        }

        return holidays.toList()
    }

    fun registerOriginalHoliday(originalHoliday: HolidayInterface) {
        originalHolidayRegistry.set(originalHoliday)
    }

    fun unregisterOriginalHoliday(originalHoliday: HolidayInterface) {
        originalHolidayRegistry.remove(originalHoliday)
    }
}