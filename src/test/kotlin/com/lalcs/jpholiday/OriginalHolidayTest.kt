package com.lalcs.jpholiday

import com.lalcs.jpholiday.holiday.HolidayInterface
import kotlinx.datetime.LocalDate
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class OriginalHolidayTest {

    private val jpHoliday = JPHoliday()
    private val testOriginalHoliday = TestOriginalHoliday()

    class TestOriginalHoliday : HolidayInterface {
        override fun isHoliday(date: LocalDate): Boolean {
            return date == LocalDate(2022, 12, 31)
        }

        override fun holidayName(date: LocalDate): String {
            return "独自の休み"
        }
    }

    @BeforeEach
    fun beforeTest() {
        jpHoliday.registerOriginalHoliday(testOriginalHoliday)
    }

    @Test
    fun originalHoliday() {
        assertEquals(
            Holiday(
                name = "独自の休み",
                date = LocalDate(2022, 12, 31)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 12, 31)).first()
        )
    }

    @Test
    fun holiday() {
        assertEquals(
            Holiday(
                name = "元日",
                date = LocalDate(2022, 1, 1)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 1, 1)).first()
        )
        assertEquals(
            Holiday(
                name = "成人の日",
                date = LocalDate(2022, 1, 10)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 1, 10)).first()
        )
        assertEquals(
            Holiday(
                name = "建国記念の日",
                date = LocalDate(2022, 2, 11)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 2, 11)).first()
        )
        assertEquals(
            Holiday(
                name = "天皇誕生日",
                date = LocalDate(2022, 2, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 2, 23)).first()
        )
        assertEquals(
            Holiday(
                name = "春分の日",
                date = LocalDate(2022, 3, 21)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 3, 21)).first()
        )
        assertEquals(
            Holiday(
                name = "昭和の日",
                date = LocalDate(2022, 4, 29)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 4, 29)).first()
        )
        assertEquals(
            Holiday(
                name = "憲法記念日",
                date = LocalDate(2022, 5, 3)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 5, 3)).first()
        )
        assertEquals(
            Holiday(
                name = "みどりの日",
                date = LocalDate(2022, 5, 4)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 5, 4)).first()
        )
        assertEquals(
            Holiday(
                name = "こどもの日",
                date = LocalDate(2022, 5, 5)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 5, 5)).first()
        )
        assertEquals(
            Holiday(
                name = "海の日",
                date = LocalDate(2022, 7, 18)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 7, 18)).first()
        )
        assertEquals(
            Holiday(
                name = "山の日",
                date = LocalDate(2022, 8, 11)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 8, 11)).first()
        )
        assertEquals(
            Holiday(
                name = "敬老の日",
                date = LocalDate(2022, 9, 19)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 9, 19)).first()
        )
        assertEquals(
            Holiday(
                name = "秋分の日",
                date = LocalDate(2022, 9, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 9, 23)).first()
        )
        assertEquals(
            Holiday(
                name = "スポーツの日",
                date = LocalDate(2022, 10, 10)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 10, 10)).first()
        )
        assertEquals(
            Holiday(
                name = "文化の日",
                date = LocalDate(2022, 11, 3)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 11, 3)).first()
        )
        assertEquals(
            Holiday(
                name = "勤労感謝の日",
                date = LocalDate(2022, 11, 23)
            ),
            jpHoliday.resolveHoliday(LocalDate(2022, 11, 23)).first()
        )
    }

    @Test
    fun countMonth() {
        assertEquals(2, jpHoliday.monthHolidays(2022, 1).size)
        assertEquals(2, jpHoliday.monthHolidays(2022, 2).size)
        assertEquals(1, jpHoliday.monthHolidays(2022, 3).size)
        assertEquals(1, jpHoliday.monthHolidays(2022, 4).size)
        assertEquals(3, jpHoliday.monthHolidays(2022, 5).size)
        assertEquals(0, jpHoliday.monthHolidays(2022, 6).size)
        assertEquals(1, jpHoliday.monthHolidays(2022, 7).size)
        assertEquals(1, jpHoliday.monthHolidays(2022, 8).size)
        assertEquals(2, jpHoliday.monthHolidays(2022, 9).size)
        assertEquals(1, jpHoliday.monthHolidays(2022, 10).size)
        assertEquals(2, jpHoliday.monthHolidays(2022, 11).size)
        assertEquals(1, jpHoliday.monthHolidays(2022, 12).size)
    }

    @Test
    fun countYear() {
        assertEquals(17, jpHoliday.yearHolidays(2022).size)
    }

    @Test
    fun unregisterCountYear() {
        jpHoliday.unregisterOriginalHoliday(testOriginalHoliday)
        assertEquals(16, jpHoliday.yearHolidays(2022).size)
    }
}