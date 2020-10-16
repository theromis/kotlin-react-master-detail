package components.header

import kotlinx.css.*
import lonje.styled.Colors
import lonje.styled.Mixins
import lonje.styled.Variables
import styled.StyleSheet

object HeaderStyles : StyleSheet("HeaderStyles", isStatic = true) {
    val header by css {
        display = Display.block
        position = Position.sticky
        top = 0.px
        zIndex = 1
        paddingTop = Variables.appSpacingMd
        +Mixins.appBlurBackdrop

        h1 {
            top = 0.px
            marginTop = 0.px
            marginBottom = 0.px
            position = Position.sticky
            padding(
                    Variables.appSpacingXs,
                    Variables.appSpacingLg,
                    Variables.appSpacingMd
            )
            borderBottom = Variables.appBorder
            color = Colors.appColorTextPrimary
            fontSize = Variables.appTextSizeXl
        }
    }

    val back by css {
        color = Colors.appColorPrimary
        marginLeft = Variables.appSpacingLg
        fontSize = Variables.appTextSizeMd
        outline = Outline.none
        cursor = Cursor.pointer
        userSelect = UserSelect.none
        hover {
            outline = Outline.none
        }
        "ion-icon" {
            fontSize = 16.px
            verticalAlign = VerticalAlign.textTop
            marginRight = 2.px
        }
   }
}