package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

internal class MountainDay : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        // 2020: 国民の祝日に関する法律(昭和23年法律第178号)の特例
        if (date == LocalDate(2020, 8, 10)) return true
        // 2021: 五輪特別措置法改正案
        if (date == LocalDate(2021, 8, 8)) return true

        // 2016: 国民の祝日に関する法律の一部を改正する法律(平成26年法律第43号)
        // 2020: 国民の祝日に関する法律の一部を改正する法律(平成30年法律第57号)
        return (date.year >= 2016 && date.month == Month.AUGUST && date.dayOfMonth == 11)
    }

    override fun holidayName(date: LocalDate): String {
        return "山の日"
    }
}