package com.lalcs.jpholiday.calcDate

import kotlinx.datetime.LocalDate
import org.junit.jupiter.api.Test
import java.time.Month
import kotlin.test.assertEquals

internal class CalcWeekDayTest {

    @Test
    fun weekDay() {
        assertEquals(
            LocalDate(2022, 1, 12),
            CalcWeekDay.weekDay(2022, Month.JANUARY, 2, WeekDay.WEDNESDAY)
        )
    }
}