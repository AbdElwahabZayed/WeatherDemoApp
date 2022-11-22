package com.integrant.training.weatherdemoapp.weatherdetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.integrant.training.weatherdemoapp.model.Weather
import com.integrant.training.weatherdemoapp.model.weatherValue
import com.integrant.training.weatherdemoapp.ui.components.CurrentWeatherDetailsCard
import com.integrant.training.weatherdemoapp.ui.components.HourlyLazyList
import com.integrant.training.weatherdemoapp.ui.components.WeatherProprieties
import com.integrant.training.weatherdemoapp.ui.theme.*


@Composable
fun WeatherDetailsScreen(
    weather: Weather,
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .fillMaxWidth()
            .background(blue),
    ) {
        CurrentWeatherDetailsCard(
            modifier = Modifier.padding(spacing.dp16),
            weather = weather
        ) {
            WeatherProprieties(
                modifier = Modifier.fillMaxWidth(),
                iconModifier = Modifier.size(spacing.dp25),
                airPressure = weather.pressure ?: "",
                humidity = weather.humidity ?: "",
                airSpeed = weather.airSpeed ?: "",
                textSize = fontScaling.normalText
            )
        }

        Spacer(modifier = Modifier.height(spacing.dp20))

        Text(
            modifier = Modifier.padding(spacing.dp16),
            text = "Today",
            fontSize = fontScaling.extraBigText,
            color = textWhiteColor
        )

        Spacer(modifier = Modifier.height(spacing.dp8))

        HourlyLazyList(
            modifier = Modifier.paddingStart(spacing.dp16),
            weatherList = weather.hourlyWeather
        )
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