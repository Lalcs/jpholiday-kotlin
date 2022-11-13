package com.lalcs.jpholiday

import kotlinx.datetime.LocalDate
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Year1992Test {

    private val jpHoliday = JPHoliday()

    @Test
    fun holiday() {
        assertEquals(
            Holiday(
                name = "元日",
                date = LocalDate(1992, 1, 1)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 1, 1)).first()
        )
        assertEquals(
            Holiday(
                name = "成人の日",
                date = LocalDate(1992, 1, 15)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 1, 15)).first()
        )
        assertEquals(
            Holiday(
                name = "建国記念の日",
                date = LocalDate(1992, 2, 11)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 2, 11)).first()
        )
        assertEquals(
            Holiday(
                name = "春分の日",
                date = LocalDate(1992, 3, 20)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 3, 20)).first()
        )
        assertEquals(
            Holiday(
                name = "みどりの日",
                date = LocalDate(1992, 4, 29)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 4, 29)).first()
        )
        assertEquals(
            Holiday(
                name = "憲法記念日",
                date = LocalDate(1992, 5, 3)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 5, 3)).first()
        )
        assertEquals(
            Holiday(
                name = "憲法記念日 振替休日",
                date = LocalDate(1992, 5, 4)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 5, 4)).first()
        )
        assertEquals(
            Holiday(
                name = "こどもの日",
                date = LocalDate(1992, 5, 5)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 5, 5)).first()
        )
        assertEquals(
            Holiday(
                name = "敬老の日",
                date = LocalDate(1992, 9, 15)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 9, 15)).first()
        )
        assertEquals(
            Holiday(
                name = "秋分の日",
                date = LocalDate(1992, 9, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 9, 23)).first()
        )
        assertEquals(
            Holiday(
                name = "体育の日",
                date = LocalDate(1992, 10, 10)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 10, 10)).first()
        )
        assertEquals(
            Holiday(
                name = "文化の日",
                date = LocalDate(1992, 11, 3)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 11, 3)).first()
        )
        assertEquals(
            Holiday(
                name = "勤労感謝の日",
                date = LocalDate(1992, 11, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 11, 23)).first()
        )
        assertEquals(
            Holiday(
                name = "天皇誕生日",
                date = LocalDate(1992, 12, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(1992, 12, 23)).first()
        )
    }

    @Test
    fun countMonth() {
        assertEquals(2, jpHoliday.monthHolidays(1992, 1).size)
        assertEquals(1, jpHoliday.monthHolidays(1992, 2).size)
        assertEquals(1, jpHoliday.monthHolidays(1992, 3).size)
        assertEquals(1, jpHoliday.monthHolidays(1992, 4).size)
        assertEquals(3, jpHoliday.monthHolidays(1992, 5).size)
        assertEquals(0, jpHoliday.monthHolidays(1992, 6).size)
        assertEquals(0, jpHoliday.monthHolidays(1992, 7).size)
        assertEquals(0, jpHoliday.monthHolidays(1992, 8).size)
        assertEquals(2, jpHoliday.monthHolidays(1992, 9).size)
        assertEquals(1, jpHoliday.monthHolidays(1992, 10).size)
        assertEquals(2, jpHoliday.monthHolidays(1992, 11).size)
        assertEquals(1, jpHoliday.monthHolidays(1992, 12).size)
    }

    @Test
    fun countYear() {
        assertEquals(14, jpHoliday.yearHolidays(1992).size)
    }
}