package containers

import kotlinx.css.*
import lonje.styled.Colors.appColorBackground
import lonje.styled.Colors.appColorTextPrimary
import lonje.styled.Colors.appColorTextSecondary
import lonje.styled.Variables.appTextSizeLg
import lonje.styled.Variables.appTextSizeXl
import styled.StyleSheet

object DetailStyles : StyleSheet("DetailStyles", isStatic = true) {
    val component by css {
        width = LinearDimension("100%")
        height = LinearDimension("100%")
        display = Display.flex
        put("flex-flow", "column")
    }

    val main by css {
        flex(1.0)
        display = Display.flex
        alignItems = Align.center
        justifyContent = JustifyContent.center
        fontSize = appTextSizeXl
        fontWeight = FontWeight.w500
        color = appColorTextSecondary
        background = appColorBackground.value

        h1 {
            display = Display.block
            fontSize = appTextSizeXl
            color = appColorTextPrimary
            margin(0.px, 0.px, 4.px)
        }

        h2 {
            display = Display.block
            fontSize = appTextSizeLg
            fontWeight = FontWeight.normal
            margin(0.px)
        }
    }

    val text by css {
        textAlign = TextAlign.center
    }
}