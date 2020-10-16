package components.listItem

import kotlinx.css.*
import kotlinx.css.properties.TextDecoration
import lonje.styled.Mixins
import lonje.styled.Variables.appBorder
import lonje.styled.Variables.appSpacingLg
import lonje.styled.Variables.appSpacingMd
import styled.StyleSheet

object ListItemStyles : StyleSheet("ListItemStyles", isStatic = true) {
    val component by css {
        userSelect = UserSelect.none
        textDecoration = TextDecoration.none
        background = "transparent"
        +Mixins.appTransition

        "h1, h2, p" {
            textOverflow = TextOverflow.ellipsis
            whiteSpace = WhiteSpace.nowrap
            overflow = Overflow.hidden
            boxSizing = BoxSizing.borderBox
        }
    }

    val inner by css {
        marginLeft = appSpacingLg
        borderBottom = appBorder
        padding(appSpacingMd, appSpacingMd, appSpacingMd, 0.px)
    }
}