package com.integrant.training.weatherdemoapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.integrant.training.weatherdemoapp.R
import com.integrant.training.weatherdemoapp.model.IconData
import com.integrant.training.weatherdemoapp.model.Weather
import com.integrant.training.weatherdemoapp.ui.theme.WeatherDemoAppTheme
import com.integrant.training.weatherdemoapp.ui.theme.darkBlue
import com.integrant.training.weatherdemoapp.ui.theme.textWhiteColor

@Composable
fun CurrentWeatherDetailsCard(
    weather: Weather,
    modifier: Modifier = Modifier,
    cardCorner: Dp = 20.dp,
    elevation: CardElevation = CardDefaults.cardElevation(),
    weatherProprieties: @Composable () -> Unit
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(cardCorner),
        elevation = elevation,
    ) {
        Column(
            modifier = Modifier
                .background(darkBlue),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = weather.time,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 16.dp, 16.dp, 0.dp),
                color = textWhiteColor,
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                modifier = Modifier.size(200.dp, 200.dp),
                painter = painterResource(id = weather.weatherIcon.resId),
                contentDescription = weather.weatherIcon.contentDescription,
                contentScale = ContentScale.FillWidth
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = textWhiteColor,
                fontSize = 48.sp,
                text = weather.temp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = textWhiteColor,
                text = weather.weatherStatus ?: "",
                fontSize = 22.sp
            )
            Spacer(modifier = Modifier.height(26.dp))
            weatherProprieties()

            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}


@Preview
@Composable
fun PreviewCard() {
    WeatherDemoAppTheme {
        CurrentWeatherDetailsCard(
            weather = Weather(
                "today 10:00",
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
            modifier = Modifier
                .fillMaxSize()
        ) {
            WeatherProprieties(
                modifier = Modifier.fillMaxWidth(),
                iconModifier = Modifier.size(25.dp, 25.dp),
                airPressure = "1005hpa",
                humidity = "72%",
                airSpeed = "10Km/h",
                textSize = 16.sp
            )
        }
    }
}