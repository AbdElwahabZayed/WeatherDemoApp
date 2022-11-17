package com.integrant.training.weatherdemoapp.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.integrant.training.weatherdemoapp.model.Weather

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
                    .height(168.dp)
                    .padding(8.dp),
                hourFontSize = 18.sp,
                tempFontSize = 20.sp,
                iconModifier = Modifier.size(42.dp),
                item
            )
        }
    }
}
