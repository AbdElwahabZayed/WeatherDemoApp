package com.integrant.training.weatherdemoapp.model

import androidx.annotation.DrawableRes
import com.integrant.training.weatherdemoapp.R

data class Weather(
    val time: String,
    val weatherIcon: IconData,
    val temp: String,
    val weatherStatus: String?,
    val pressure: String?,
    val humidity: String?,
    val airSpeed: String?,
    val hourlyWeather: List<Weather> = listOf()
)

data class IconData(
    @DrawableRes
    val resId: Int,
    val contentDescription: String
)


val weatherValue = Weather(
    "today 10:00",
    IconData(
        resId = R.drawable.sunny,
        contentDescription = ""
    ),
    "27.8C",
    "Clear Sky",
    "1005hpa",
    "72.5%",
    "10km/h",
    hourlyWeather = listOf(
        Weather(
            "10:00",
            IconData(
                resId = R.drawable.sunny,
                contentDescription = ""
            ),
            "27.8C",
            "Clear Sky",
            "1005hpa",
            "72.5%",
            "10km/h"
        ),
        Weather(
            "11:00",
            IconData(
                resId = R.drawable.clouds,
                contentDescription = ""
            ),
            "27.8C",
            "Clear Sky",
            "1005hpa",
            "72.5%",
            "10km/h"
        ),
        Weather(
            "12:00",
            IconData(
                resId = R.drawable.clouds,
                contentDescription = ""
            ),
            "27.8C",
            "Clear Sky",
            "1005hpa",
            "72.5%",
            "10km/h"
        ),
        Weather(
            "13:00",
            IconData(
                resId = R.drawable.clouds,
                contentDescription = ""
            ),
            "27.8C",
            "Clear Sky",
            "1005hpa",
            "72.5%",
            "10km/h"
        ),
        Weather(
            "14:00",
            IconData(
                resId = R.drawable.sunny,
                contentDescription = ""
            ),
            "27.8C",
            "Clear Sky",
            "1005hpa",
            "72.5%",
            "10km/h"
        ),
        Weather(
            "15:00",
            IconData(
                resId = R.drawable.clouds,
                contentDescription = ""
            ),
            "27.8C",
            "Clear Sky",
            "1005hpa",
            "72.5%",
            "10km/h"
        ),
        Weather(
            "16:00",
            IconData(
                resId = R.drawable.clouds,
                contentDescription = ""
            ),
            "27.8C",
            "Clear Sky",
            "1005hpa",
            "72.5%",
            "10km/h"
        )

    )
)