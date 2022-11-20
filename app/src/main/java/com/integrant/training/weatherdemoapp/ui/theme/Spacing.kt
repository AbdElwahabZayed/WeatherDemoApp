package com.integrant.training.weatherdemoapp.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Spacing(
    val dp0: Dp = 0.dp,
    val dp1: Dp = 1.dp,
    val dp2: Dp = 2.dp,
    val dp4: Dp = 4.dp,
    val dp5: Dp = 5.dp,
    val dp6: Dp = 6.dp,
    val dp8: Dp = 8.dp,
    val dp10: Dp = 10.dp,
    val dp12: Dp = 12.dp,
    val dp13: Dp = 13.dp,
    val dp14: Dp = 14.dp,
    val dp15: Dp = 15.dp,
    val dp16: Dp = 16.dp,
    val dp17: Dp = 17.dp,
    val dp20: Dp = 20.dp,
    val dp22: Dp = 22.dp,
    val dp24: Dp = 24.dp,
    val dp25: Dp = 25.dp,
    val dp28: Dp = 28.dp,
    val dp30: Dp = 30.dp,
    val dp32: Dp = 32.dp,
    val dp34: Dp = 34.dp,
    val dp36: Dp = 36.dp,
    val dp40: Dp = 40.dp,
    val dp44: Dp = 44.dp,
    val dp48: Dp = 48.dp,
    val dp50: Dp = 50.dp,
    val dp62: Dp = 62.dp,
    val dp64: Dp = 64.dp,
    val dp80: Dp = 80.dp,
    val dp85: Dp = 85.dp,
    val dp95: Dp = 95.dp,
    val dp100: Dp = 100.dp,
    val dp250: Dp = 250.dp,
    val dp260: Dp = 260.dp,
    val homeScreenCornerRadius: Dp = 10.dp,
    val homeCardElevation: Dp = 3.dp,
    val blurRadius: Dp = 20.dp,
    val weatherImageSize: Dp = 200.dp,
    val hourWeatherIconSize: Dp = 152.dp
)

@Composable
fun textWithoutScale(size: Float): TextUnit {
    return with(LocalDensity.current) {
        (size / fontScale).sp
    }
}

val LocalSpacing = compositionLocalOf { Spacing() }

val spacing: Spacing
    @Composable
    @ReadOnlyComposable
    get() = LocalSpacing.current

/**
 * Apply additional space along the top edge of the content only in Dp and zero for all other edges.
 */
fun Modifier.paddingTop(topPadding: Dp): Modifier {
    return this.padding(0.dp, topPadding, 0.dp, 0.dp)
}

/**
 * Apply additional space along the start edge of the content only in Dp and zero for all other edges.
 */
fun Modifier.paddingStart(startPadding: Dp): Modifier {
    return this.padding(startPadding, 0.dp, 0.dp, 0.dp)
}

/**
 * Apply additional space along the end edge of the content only in Dp and zero for all other edges.
 */
fun Modifier.paddingEnd(endPadding: Dp): Modifier {
    return this.padding(0.dp, 0.dp, endPadding, 0.dp)
}





