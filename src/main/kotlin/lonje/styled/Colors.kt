package lonje.styled

import kotlinx.css.Color
import kotlinx.css.rgb
import kotlinx.css.rgba
import styled.StyleSheet

object Colors : StyleSheet("Colors", isStatic = true) {
    val appColorPrimary = rgb(52, 120, 245)

    /**********************************************/
    /* LIGHT MODE (DEFAULT)                       */
    /**********************************************/

    val appColorBackground = rgb(255,255,255)
    val appColorBackgroundTransparent = rgba(251,251,251,0.9)
    val appColorBackgroundHighlight = rgb(0,88,208)
    val appColorBackgroundHighlightTransparent = rgba(0,88,208, 0.9)

    val appColorBorder = rgb(218,218,218)

    val appColorTextPrimary = rgb(0,0,0)
    val appColorTextPrimaryHighlight = rgb(223,223,223)
    val appColorTextSecondary = rgb(142,141,146)
    val appColorTextSecondaryHighlight = rgba(255,255,255,0.6)
}