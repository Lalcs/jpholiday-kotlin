package com.lalcs.jpholiday

import com.lalcs.jpholiday.holiday.HolidayInterface

internal class OriginalHolidayRegistry {
    private val registry: MutableList<HolidayInterface> = mutableListOf()

    fun get(): List<HolidayInterface> {
        return registry
    }

    fun set(holiday: HolidayInterface) {
        registry.add(holiday)
    }

    fun remove(holiday: HolidayInterface) {
        registry.remove(holiday)
    }
}