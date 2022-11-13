package com.lalcs.jpholiday

import com.lalcs.jpholiday.holiday.*

internal object PublicHolidayRegistry {
    private val registry: List<HolidayInterface> = listOf(
        NewYear(),
        AdultDay(),
        FoundationDay(),
        EmperorsBirthday(),
        VernalEquinoxDay(),
        GreeneryDay(),
        ShowaDay(),
        ConstitutionMemorialDay(),
        ChildrenDay(),
        SeaDay(),
        MountainDay(),
        RespectForTheAgedDay(),
        AutumnEquinoxDay(),
        HealthAndSportsDay(),
        SportsDay(),
        CultureDay(),
        LaborThanksgivingDay(),
        ExtraHoliday1959(),
        ExtraHoliday1989(),
        ExtraHoliday1990(),
        ExtraHoliday1993(),
        ExtraHoliday201905(),
        ExtraHoliday201910(),
        TransferHoliday(),
        NationalHoliday(),
    )

    fun get(): List<HolidayInterface> {
        return registry
    }
}