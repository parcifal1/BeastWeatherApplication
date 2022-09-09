package com.example.example

import com.google.gson.annotations.SerializedName


data class Daily(

    @SerializedName("time") var time: ArrayList<String> = arrayListOf(),
    @SerializedName("weathercode") var weathercode: ArrayList<Int> = arrayListOf(),
    @SerializedName("temperature_2m_max") var temperature2mMax: ArrayList<Double> = arrayListOf(),
    @SerializedName("temperature_2m_min") var temperature2mMin: ArrayList<Double> = arrayListOf(),
    @SerializedName("apparent_temperature_max") var apparentTemperatureMax: ArrayList<Double> = arrayListOf(),
    @SerializedName("apparent_temperature_min") var apparentTemperatureMin: ArrayList<Double> = arrayListOf(),
    @SerializedName("windspeed_10m_max") var windspeed10mMax: ArrayList<Double> = arrayListOf()

)