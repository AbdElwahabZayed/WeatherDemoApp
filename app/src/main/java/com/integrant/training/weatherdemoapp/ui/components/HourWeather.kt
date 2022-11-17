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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.integrant.training.weatherdemoapp.R
import com.integrant.training.weatherdemoapp.model.IconData
import com.integrant.training.weatherdemoapp.model.Weather
import com.integrant.training.weatherdemoapp.ui.theme.WeatherDemoAppTheme
import com.integrant.training.weatherdemoapp.ui.theme.textGrayColor
import com.integrant.training.weatherdemoapp.ui.theme.textWhiteColor

@Composable
fun HourWeather(
    modifier: Modifier = Modifier,
    hourFontSize: TextUnit = 20.sp,
    tempFontSize: TextUnit = 20.sp,
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
                .height(168.dp)
                .padding(8.dp),
            hourFontSize = 18.sp,
            tempFontSize = 20.sp,
            iconModifier = Modifier.size(42.dp),
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