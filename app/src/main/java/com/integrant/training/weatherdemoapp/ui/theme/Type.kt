package com.integrant.training.weatherdemoapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

)

data class FontScaling(
    val extraSmallText: TextUnit = 11.sp,
    val smallText: TextUnit = 14.sp,
    val normalText: TextUnit = 16.sp,
    val postNormalText: TextUnit = 18.sp,
    val slightBigText: TextUnit = 20.sp,
    val bigText: TextUnit = 22.sp,
    val extraBigText: TextUnit = 24.sp,
    val cardTempTextSize: TextUnit = 48.sp
)

val LocalFontScaling = compositionLocalOf { FontScaling() }

val fontScaling: FontScaling
    @Composable
    @ReadOnlyComposable
    get() = LocalFontScaling.current
