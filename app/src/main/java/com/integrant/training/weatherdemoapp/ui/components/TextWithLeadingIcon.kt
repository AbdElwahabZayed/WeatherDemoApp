package com.integrant.training.weatherdemoapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
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
import com.integrant.training.weatherdemoapp.ui.theme.WeatherDemoAppTheme
import com.integrant.training.weatherdemoapp.ui.theme.textGrayColor

@Composable
fun TextWithLeadingIcon(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
    icon: IconData,
    text: String,
    textSize: TextUnit
) {
    Row(
        modifier = modifier, verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = iconModifier,
            painter = painterResource(id = icon.resId),
            contentDescription = icon.contentDescription,
            tint = textGrayColor
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            modifier = Modifier,
            text = text,
            color = textGrayColor,
            fontSize = textSize,
            minLines = 1
        )
    }

}

@Composable
fun WeatherProprieties(
    modifier: Modifier = Modifier,
    airPressure: String,
    humidity: String,
    airSpeed: String,
    iconModifier: Modifier = Modifier,
    textSize: TextUnit = 20.sp

) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        TextWithLeadingIcon(
            icon =
            IconData(
                R.drawable.compress,
                "pressure"
            ),
            iconModifier = iconModifier,
            text = airPressure,
            textSize = textSize
        )

        TextWithLeadingIcon(
            icon =
            IconData(
                R.drawable.humidity,
                "humidity"
            ),
            iconModifier = iconModifier,
            text = humidity,
            textSize = textSize
        )

        TextWithLeadingIcon(
            icon =
            IconData(
                R.drawable.air,
                "air speed"
            ),
            iconModifier = iconModifier,
            text = airSpeed,
            textSize = textSize
        )
    }
}

@Preview
@Composable
fun Preview() {
    WeatherDemoAppTheme() {
        WeatherProprieties(
            Modifier.width(600.dp),
            airPressure = "1005hpa",
            humidity = "72%",
            airSpeed = "10Km/h"
        )
    }
}