package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month
import kotlin.math.floor

internal class VernalEquinoxDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date.year >= 1948 && date.month == Month.MARCH && date.dayOfMonth == calcVernalEquinoxDay(date.year))
    }

    override fun holidayName(date: LocalDate): String {
        return "春分の日"
    }

    /**
     * 春季皇霊祭: 1879-1947
     * 春分の日: 1948
     * http://mt-soft.sakura.ne.jp/kyozai/excel_high/200_jissen_kiso/60_syunbun.htm
     *
     * @param year
     * @return
     */
    private fun calcVernalEquinoxDay(year: Int): Int {
        val seed = when (year) {
            in 0..1850 -> 0.0
            in 1851..1899 -> 19.8277
            in 1900..1979 -> 20.8357
            in 1980..2099 -> 20.8431
            in 2100..2150 -> 21.8510
            else -> 0.0
        }

        return floor(seed + 0.242194 * (year.toDouble() - 1980.0) - floor(((year.toDouble() - 1980.0) / 4.0))).toInt()
    }
}