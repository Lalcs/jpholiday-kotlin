package com.lalcs.jpholiday

import kotlinx.datetime.LocalDate
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Year2023Test {

    private val jpHoliday = JPHoliday()

    @Test
    fun holiday() {
        assertEquals(
            Holiday(
                name = "元日",
                date = LocalDate(2023, 1, 1)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 1, 1)).first()
        )
        assertEquals(
            Holiday(
                name = "元日 振替休日",
                date = LocalDate(2023, 1, 2)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 1, 2)).first()
        )
        assertEquals(
            Holiday(
                name = "成人の日",
                date = LocalDate(2023, 1, 9)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 1, 9)).first()
        )
        assertEquals(
            Holiday(
                name = "建国記念の日",
                date = LocalDate(2023, 2, 11)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 2, 11)).first()
        )
        assertEquals(
            Holiday(
                name = "天皇誕生日",
                date = LocalDate(2023, 2, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 2, 23)).first()
        )
        assertEquals(
            Holiday(
                name = "春分の日",
                date = LocalDate(2023, 3, 21)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 3, 21)).first()
        )
        assertEquals(
            Holiday(
                name = "昭和の日",
                date = LocalDate(2023, 4, 29)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 4, 29)).first()
        )
        assertEquals(
            Holiday(
                name = "憲法記念日",
                date = LocalDate(2023, 5, 3)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 5, 3)).first()
        )
        assertEquals(
            Holiday(
                name = "みどりの日",
                date = LocalDate(2023, 5, 4)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 5, 4)).first()
        )
        assertEquals(
            Holiday(
                name = "こどもの日",
                date = LocalDate(2023, 5, 5)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 5, 5)).first()
        )
        assertEquals(
            Holiday(
                name = "海の日",
                date = LocalDate(2023, 7, 17)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 7, 17)).first()
        )
        assertEquals(
            Holiday(
                name = "山の日",
                date = LocalDate(2023, 8, 11)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 8, 11)).first()
        )
        assertEquals(
            Holiday(
                name = "敬老の日",
                date = LocalDate(2023, 9, 18)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 9, 18)).first()
        )
        assertEquals(
            Holiday(
                name = "秋分の日",
                date = LocalDate(2023, 9, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 9, 23)).first()
        )
        assertEquals(
            Holiday(
                name = "スポーツの日",
                date = LocalDate(2023, 10, 9)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 10, 9)).first()
        )
        assertEquals(
            Holiday(
                name = "文化の日",
                date = LocalDate(2023, 11, 3)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 11, 3)).first()
        )
        assertEquals(
            Holiday(
                name = "勤労感謝の日",
                date = LocalDate(2023, 11, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(2023, 11, 23)).first()
        )
    }

    @Test
    fun countMonth() {
        assertEquals(3, jpHoliday.monthHolidays(2023, 1).size)
        assertEquals(2, jpHoliday.monthHolidays(2023, 2).size)
        assertEquals(1, jpHoliday.monthHolidays(2023, 3).size)
        assertEquals(1, jpHoliday.monthHolidays(2023, 4).size)
        assertEquals(3, jpHoliday.monthHolidays(2023, 5).size)
        assertEquals(0, jpHoliday.monthHolidays(2023, 6).size)
        assertEquals(1, jpHoliday.monthHolidays(2023, 7).size)
        assertEquals(1, jpHoliday.monthHolidays(2023, 8).size)
        assertEquals(2, jpHoliday.monthHolidays(2023, 9).size)
        assertEquals(1, jpHoliday.monthHolidays(2023, 10).size)
        assertEquals(2, jpHoliday.monthHolidays(2023, 11).size)
        assertEquals(0, jpHoliday.monthHolidays(2023, 12).size)
    }

    @Test
    fun countYear() {
        assertEquals(17, jpHoliday.yearHolidays(2023).size)
    }
}