package com.integrant.training.weatherdemoapp.weatherdetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.integrant.training.weatherdemoapp.model.Weather
import com.integrant.training.weatherdemoapp.model.weatherValue
import com.integrant.training.weatherdemoapp.ui.components.CurrentWeatherDetailsCard
import com.integrant.training.weatherdemoapp.ui.components.HourlyLazyList
import com.integrant.training.weatherdemoapp.ui.components.WeatherProprieties
import com.integrant.training.weatherdemoapp.ui.theme.WeatherDemoAppTheme
import com.integrant.training.weatherdemoapp.ui.theme.blue
import com.integrant.training.weatherdemoapp.ui.theme.textWhiteColor


@Composable
fun WeatherDetailsScreen(
    weather: Weather,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(blue),
    ) {
        CurrentWeatherDetailsCard(
            modifier = Modifier.padding(16.dp),
            weather = weather
        ) {
            WeatherProprieties(
                modifier = Modifier.fillMaxWidth(),
                iconModifier = Modifier.size(25.dp, 25.dp),
                airPressure = weather.pressure ?: "",
                humidity = weather.humidity ?: "",
                airSpeed = weather.airSpeed ?: "",
                textSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            modifier = Modifier.padding(8.dp),
            text = "Today",
            fontSize = 24.sp,
            color = textWhiteColor
        )

        Spacer(modifier = Modifier.height(8.dp))

        HourlyLazyList(weatherList = weather.hourlyWeather)
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewWeatherScreen() {
    WeatherDemoAppTheme {
        WeatherDetailsScreen(
            weatherValue
        )
    }
}