package com.example.weatherapplication.models

import java.io.Serializable

data class Main(
    val temp: Double,
    val feelsLike: Double,
    val tempMin: Double,
    val tempMax: Double,
    val pressure: Int,
    val humidity: Int

) : Serializable