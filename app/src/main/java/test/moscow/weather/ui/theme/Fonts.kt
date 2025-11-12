package test.moscow.weather.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


class Fonts {


    val semibold = TextStyle(fontWeight = FontWeight.W500)
    val bold = TextStyle(fontWeight = FontWeight.W700)

    val textAlignCenter = TextStyle(textAlign = TextAlign.Center)

    val smallText = TextStyle(fontSize = 12.sp)
    val smallSemiboldText = smallText.merge(semibold)
    val smallBoldText = smallText.merge(bold)

    val normalText = TextStyle(fontSize = 14.sp)
    val normalTextCenter = normalText.merge(textAlignCenter)
    val normalSemiboldText = normalText.merge(semibold)
    val normalBoldText = normalText.merge(bold)

    val mediumText = TextStyle(fontSize = 16.sp)
    val mediumTextCenter = mediumText.merge(textAlignCenter)
    val mediumSemiboldText = mediumText.merge(semibold)
    val mediumBoldText = mediumText.merge(bold)
    val mediumBoldTextCenter = mediumBoldText.merge(textAlignCenter)

    val largeText = TextStyle(fontSize = 18.sp)
    val largeSemiboldText = largeText.merge(semibold)
    val largeSemiboldTextCenter = largeSemiboldText.merge(textAlignCenter)
    val largeBoldText = largeText.merge(bold)

    val hugeText = TextStyle(fontSize = 20.sp)
    val hugeBoldText = hugeText.merge(bold)

    val megaText = TextStyle(fontSize = 24.sp)
    val megaSemiboldText = megaText.merge(semibold)
    val megaBoldText = megaText.merge(bold)

    val ultraText = TextStyle(fontSize = 32.sp)
    val ultraSemiboldText = ultraText.merge(semibold)
    val ultraBoldText = ultraText.merge(bold)


}
