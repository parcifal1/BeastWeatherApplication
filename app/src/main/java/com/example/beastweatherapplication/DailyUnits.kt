package com.example.example

import com.google.gson.annotations.SerializedName


data class DailyUnits(

    @SerializedName("time") var time: String? = null,
    @SerializedName("weathercode") var weathercode: String? = null,
    @SerializedName("temperature_2m_max") var temperature2mMax: String? = null,
    @SerializedName("temperature_2m_min") var temperature2mMin: String? = null,
    @SerializedName("apparent_temperature_max") var apparentTemperatureMax: String? = null,
    @SerializedName("apparent_temperature_min") var apparentTemperatureMin: String? = null,
    @SerializedName("windspeed_10m_max") var windspeed10mMax: String? = null

)