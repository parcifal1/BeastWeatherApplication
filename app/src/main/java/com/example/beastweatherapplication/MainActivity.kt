package com.example.beastweatherapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.example.Weather
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var api = API
    var maximumTemp: TextView? = null
    var minTemp: TextView? = null
    var currentDate: TextView? = null
    var button: Button? = null
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello")
        minTemp = findViewById(R.id.minTemp)
        maximumTemp = findViewById(R.id.maxTemp)
        currentDate = findViewById(R.id.currentDate)
        button = findViewById(R.id.nextDayBtn)

        button?.setOnClickListener {
            counter++
            onStart()
        }
    }

    override fun onStart() {
        super.onStart()

        val weather = api.service.getWeather(46.976412, 28.880950,  "Europe/Bucharest")

        weather.enqueue(object : retrofit2.Callback<Weather> {
                override fun onFailure(call: retrofit2.Call<Weather>?, t: Throwable?) {

                }
                override fun onResponse(call: retrofit2.Call<Weather>?, response: Response<Weather>?) {

                    if (response?.isSuccessful!! && counter < response.body()!!.daily!!.time.size) {
                        currentDate?.setText("Current Date: " + response.body()!!.daily!!.time.get(counter))
                        maximumTemp?.setText("Maximum: " + response.body()!!.daily!!.temperature2mMax.get(counter).toString())
                        minTemp?.setText("Minimum: " + response.body()!!.daily!!.temperature2mMin.get(counter).toString())
                    } else {
                        println("SOsi")
                        Toast.makeText(this@MainActivity, "Only 5 days", Toast.LENGTH_LONG).show()
                    }
                }
            }
        )


    }
}