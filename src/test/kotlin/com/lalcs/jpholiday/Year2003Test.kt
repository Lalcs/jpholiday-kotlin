package com.lalcs.jpholiday

import kotlinx.datetime.LocalDate
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Year2003Test {

    private val jpHoliday = JPHoliday()

    @Test
    fun holiday() {
        assertEquals(
            Holiday(
                name = "元日",
                date = LocalDate(2003, 1, 1)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 1, 1)).first()
        )
        assertEquals(
            Holiday(
                name = "成人の日",
                date = LocalDate(2003, 1, 13)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 1, 13)).first()
        )
        assertEquals(
            Holiday(
                name = "建国記念の日",
                date = LocalDate(2003, 2, 11)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 2, 11)).first()
        )
        assertEquals(
            Holiday(
                name = "春分の日",
                date = LocalDate(2003, 3, 21)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 3, 21)).first()
        )
        assertEquals(
            Holiday(
                name = "みどりの日",
                date = LocalDate(2003, 4, 29)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 4, 29)).first()
        )
        assertEquals(
            Holiday(
                name = "憲法記念日",
                date = LocalDate(2003, 5, 3)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 5, 3)).first()
        )
        assertEquals(
            Holiday(
                name = "こどもの日",
                date = LocalDate(2003, 5, 5)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 5, 5)).first()
        )
        assertEquals(
            Holiday(
                name = "海の日",
                date = LocalDate(2003, 7, 21)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 7, 21)).first()
        )
        assertEquals(
            Holiday(
                name = "敬老の日",
                date = LocalDate(2003, 9, 15)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 9, 15)).first()
        )
        assertEquals(
            Holiday(
                name = "秋分の日",
                date = LocalDate(2003, 9, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 9, 23)).first()
        )
        assertEquals(
            Holiday(
                name = "体育の日",
                date = LocalDate(2003, 10, 13)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 10, 13)).first()
        )
        assertEquals(
            Holiday(
                name = "文化の日",
                date = LocalDate(2003, 11, 3)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 11, 3)).first()
        )
        assertEquals(
            Holiday(
                name = "勤労感謝の日",
                date = LocalDate(2003, 11, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 11, 23)).first()
        )
        assertEquals(
            Holiday(
                name = "勤労感謝の日 振替休日",
                date = LocalDate(2003, 11, 24)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 11, 24)).first()
        )
        assertEquals(
            Holiday(
                name = "天皇誕生日",
                date = LocalDate(2003, 12, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(2003, 12, 23)).first()
        )
    }

    @Test
    fun countMonth() {
        assertEquals(2, jpHoliday.monthHolidays(2003, 1).size)
        assertEquals(1, jpHoliday.monthHolidays(2003, 2).size)
        assertEquals(1, jpHoliday.monthHolidays(2003, 3).size)
        assertEquals(1, jpHoliday.monthHolidays(2003, 4).size)
        assertEquals(2, jpHoliday.monthHolidays(2003, 5).size)
        assertEquals(0, jpHoliday.monthHolidays(2003, 6).size)
        assertEquals(1, jpHoliday.monthHolidays(2003, 7).size)
        assertEquals(0, jpHoliday.monthHolidays(2003, 8).size)
        assertEquals(2, jpHoliday.monthHolidays(2003, 9).size)
        assertEquals(1, jpHoliday.monthHolidays(2003, 10).size)
        assertEquals(3, jpHoliday.monthHolidays(2003, 11).size)
        assertEquals(1, jpHoliday.monthHolidays(2003, 12).size)
    }

    @Test
    fun countYear() {
        assertEquals(15, jpHoliday.yearHolidays(2003).size)
    }
}