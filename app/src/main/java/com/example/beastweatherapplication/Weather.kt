package com.example.example

import com.google.gson.annotations.SerializedName


data class Weather(

    @SerializedName("latitude") var latitude: Int? = null,
    @SerializedName("longitude") var longitude: Double? = null,
    @SerializedName("generationtime_ms") var generationtimeMs: Double? = null,
    @SerializedName("utc_offset_seconds") var utcOffsetSeconds: Int? = null,
    @SerializedName("timezone") var timezone: String? = null,
    @SerializedName("timezone_abbreviation") var timezoneAbbreviation: String? = null,
    @SerializedName("elevation") var elevation: Int? = null,
    @SerializedName("daily_units") var dailyUnits: DailyUnits? = DailyUnits(),
    @SerializedName("daily") var daily: Daily? = Daily()

)