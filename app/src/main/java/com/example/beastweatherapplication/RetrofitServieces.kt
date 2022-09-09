package com.example.beastweatherapplication

import com.example.example.Weather
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

// base url https://api.open-meteo.com/v1/

//https://api.open-meteo.com/v1/forecast?latitude=46.98&longitude=28.88&daily=weathercode,temperature_2m_max,temperature_2m_min,apparent_temperature_max,apparent_temperature_min,windspeed_10m_max&timezone=Asia%2FSingapore
interface WeatherAPI {
    @GET("forecast?&daily=weathercode,temperature_2m_max,temperature_2m_min,apparent_temperature_max,apparent_temperature_min,windspeed_10m_max")
    fun getWeather(
        @Query ("latitude") latitude: Double,
        @Query("longitude")longitude: Double,
//        @Query("daily") daily: String,
        @Query("timezone") timezone: String
    ): Call<Weather>
}

object API{
    val retrofit: Retrofit
    val service: WeatherAPI

    init {
         retrofit = Retrofit.Builder()
            .baseUrl("https://api.open-meteo.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

         service = retrofit.create()
    }
}




