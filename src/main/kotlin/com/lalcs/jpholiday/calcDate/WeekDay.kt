package com.lalcs.jpholiday.calcDate

internal enum class WeekDay(val id: Int, val label: String) {
    SUNDAY(1, "日曜日"),
    MONDAY(2, "月曜日"),
    TUESDAY(3, "火曜日"),
    WEDNESDAY(4, "水曜日"),
    THURSDAY(5, "木曜日"),
    FRIDAY(6, "金曜日"),
    SATURDAY(7, "土曜日");

    companion object {
        fun from(id: Int): WeekDay {
            return WeekDay.values().first { id == it.id }
        }
    }
}
