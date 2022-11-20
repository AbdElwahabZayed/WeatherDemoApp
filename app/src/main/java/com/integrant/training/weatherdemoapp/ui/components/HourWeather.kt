package com.integrant.training.weatherdemoapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.integrant.training.weatherdemoapp.R
import com.integrant.training.weatherdemoapp.model.IconData
import com.integrant.training.weatherdemoapp.model.Weather
import com.integrant.training.weatherdemoapp.ui.theme.*

@Composable
fun HourWeather(
    modifier: Modifier = Modifier,
    hourFontSize: TextUnit = fontScaling.slightBigText,
    tempFontSize: TextUnit = fontScaling.slightBigText,
    iconModifier: Modifier,
    weather: Weather
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = weather.time,
            color = textGrayColor,
            fontSize = hourFontSize
        )

        Image(
            modifier = iconModifier,
            painter = painterResource(id = weather.weatherIcon.resId),
            contentDescription = weather.weatherIcon.contentDescription,
        )

        Text(
            text = weather.temp,
            color = textWhiteColor,
            fontSize = tempFontSize
        )
    }
}

@Preview(showBackground = true, backgroundColor = 5555)
@Composable
fun PreviewHourWeather() {
    WeatherDemoAppTheme() {
        HourWeather(
            modifier =
            Modifier
                .height(spacing.hourWeatherIconSize)
                .padding(spacing.dp8),
            hourFontSize = fontScaling.postNormalText,
            tempFontSize = fontScaling.slightBigText,
            iconModifier = Modifier.size(spacing.dp44),
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
            )
        )
    }
}