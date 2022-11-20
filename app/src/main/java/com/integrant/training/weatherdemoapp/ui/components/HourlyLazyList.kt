package com.integrant.training.weatherdemoapp.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.integrant.training.weatherdemoapp.model.Weather
import com.integrant.training.weatherdemoapp.ui.theme.fontScaling
import com.integrant.training.weatherdemoapp.ui.theme.spacing

@Composable
fun HourlyLazyList(
    modifier: Modifier = Modifier,
    weatherList: List<Weather>
) {
    LazyRow(modifier = modifier) {
        items(weatherList) { item: Weather ->
            HourWeather(
                modifier =
                Modifier
                    .height(spacing.hourWeatherIconSize)
                    .padding(spacing.dp8),
                hourFontSize = fontScaling.postNormalText,
                tempFontSize = fontScaling.bigText,
                iconModifier = Modifier.size(spacing.dp40),
                item
            )
        }
    }
}
