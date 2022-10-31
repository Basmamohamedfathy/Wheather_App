package com.example.weatherapp.model

import com.google.gson.annotations.SerializedName

class WeatherModel {

    data class WeatherModel(
        val base: String,
        val clouds: Clouds,
        val cod: Int,
        val coord: Coord,
        val dt: Int,
        val id: Int,
        val main: Main,
        val name: String,
        val sys: Sys,
        val timezone: Int,
        val visibility: Int,
        val weather: List<Weather>,
        val wind: Wind
    )
    data class Weather(
            val id: Int,
            val main: String,
            val description: String,
            val icon: String
    )
     data class Sys(
                val country: String,
                val sunrise: Int,
                val sunset: Int
     )
     data class Clouds(
                    val all: Int
      )
    data class Main(
        @SerializedName("feels_like")
        val feelsLike: Double,
        @SerializedName("grnd_level")
        val grndLevel: Int,
        val humidity: Int,
        val pressure: Int,
        @SerializedName("sea_level")
        val seaLevel: Int,
        val temp: Double,
        @SerializedName("temp_max")
        val tempMax: Double,
        @SerializedName("temp_min")
        val tempMin: Double
    )

    data class Coord(
        val lat: Double,
        val lon: Double
    )
    data class Wind(
        val deg: Int,
        val gust: Double,
        val speed: Double
    )


}



