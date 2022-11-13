package com.lalcs.jpholiday.holiday

import kotlinx.datetime.LocalDate

internal class ExtraHoliday201910 : HolidayInterface {
    override fun isHoliday(date: LocalDate): Boolean {
        // 2019: 天皇の即位の日及び即位礼正殿の儀の行われる日を休日とする法律
        return (date == LocalDate(2019, 10, 22))
    }

    override fun holidayName(date: LocalDate): String {
        return "即位礼正殿の儀"
    }
}