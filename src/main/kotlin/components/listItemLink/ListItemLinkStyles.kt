package components.listItemLink

import kotlinx.css.*
import lonje.styled.Colors.appColorBackgroundHighlight
import lonje.styled.Colors.appColorBackgroundHighlightTransparent
import lonje.styled.Colors.appColorBackgroundTransparent
import lonje.styled.Colors.appColorTextPrimaryHighlight
import lonje.styled.Colors.appColorTextSecondaryHighlight
import styled.StyleSheet

object ListItemLinkStyles : StyleSheet("ListItemListStyles", isStatic = true) {
    val component by css {
        display = Display.block
        hover {
            background = appColorBackgroundTransparent.value
        }
    }
    val active by css {
        background = appColorBackgroundHighlight.value
        hover {
            background = appColorBackgroundHighlightTransparent.value
        }
        p {
            color = appColorTextSecondaryHighlight
        }
        "h1, h2" {
            color = appColorTextPrimaryHighlight
        }
    }
}