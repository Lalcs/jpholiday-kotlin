package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month
import kotlin.math.floor

internal class AutumnEquinoxDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        return (date.month == Month.SEPTEMBER && date.dayOfMonth == calcAutumnEquinoxDay(date.year))
    }

    override fun holidayName(date: LocalDate): String {
        return "秋分の日"
    }

    /**
     * 秋季皇霊祭: 1879-1947
     * 秋分の日: 1948
     * http://mt-soft.sakura.ne.jp/kyozai/excel_high/200_jissen_kiso/60_syunbun.htm
     *
     * @param year
     * @return
     */
    private fun calcAutumnEquinoxDay(year: Int): Int {
        val seed = when (year) {
            in 0..1850 -> 0.0
            in 1851..1899 -> 22.2588
            in 1900..1979 -> 23.2588
            in 1980..2099 -> 23.2488
            in 2100..2150 -> 24.2488
            else -> 0.0
        }

        return floor(seed + 0.242194 * (year.toDouble() - 1980.0) - floor((year.toDouble() - 1980.0) / 4)).toInt()
    }

}