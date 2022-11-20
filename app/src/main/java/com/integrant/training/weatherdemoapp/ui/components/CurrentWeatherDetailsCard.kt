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
import com.integrant.training.weatherdemoapp.R
import com.integrant.training.weatherdemoapp.model.IconData
import com.integrant.training.weatherdemoapp.model.Weather
import com.integrant.training.weatherdemoapp.ui.theme.*

@Composable
fun CurrentWeatherDetailsCard(
    weather: Weather,
    modifier: Modifier = Modifier,
    cardCorner: Dp = spacing.homeCardElevation,
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
                    .paddingEnd(spacing.dp16)
                    .paddingTop(spacing.dp16),
                color = textWhiteColor,
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.height(spacing.dp8))
            Image(
                modifier = Modifier.size(spacing.weatherImageSize),
                painter = painterResource(id = weather.weatherIcon.resId),
                contentDescription = weather.weatherIcon.contentDescription,
                contentScale = ContentScale.FillWidth
            )
            Spacer(modifier = Modifier.height(spacing.dp16))
            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = textWhiteColor,
                fontSize = textWithoutScale(size = 48f),
                text = weather.temp
            )
            Spacer(modifier = Modifier.height(spacing.dp16))
            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = textWhiteColor,
                text = weather.weatherStatus ?: "",
                fontSize = textWithoutScale(size = 22f)
            )
            Spacer(modifier = Modifier.height(spacing.dp25))
            weatherProprieties()

            Spacer(modifier = Modifier.height(spacing.dp8))
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
                iconModifier = Modifier.size(spacing.dp25),
                airPressure = "1005hpa",
                humidity = "72%",
                airSpeed = "10Km/h",
                textSize = fontScaling.normalText
            )
        }
    }
}