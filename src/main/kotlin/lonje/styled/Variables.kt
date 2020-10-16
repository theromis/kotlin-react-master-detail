package lonje.styled

import kotlinx.css.Color
import kotlinx.css.px
import kotlinx.css.rgb
import kotlinx.css.rgba
import lonje.styled.Colors.appColorBorder
import styled.StyleSheet

object Variables : StyleSheet("Variables", isStatic = true) {
    /**********************************************/
    /* NOTE: When variables have serveral         */
    /*       options please try and stick to      */
    /*       t-shirt sizes...                     */
    /**********************************************/
    /* EAMPLE: xs, sm, md, lg, xl                 */
    /**********************************************/

    /**********************************************/
    /* BORDERS                                    */
    /**********************************************/

    val appBorder = "1px solid $appColorBorder"

    /**********************************************/
    /* TEXT                                       */
    /**********************************************/

    val appTextSizeSm = 12.px
    val appTextSizeMd = 14.px
    val appTextSizeLg = 16.px
    val appTextSizeXl = 24.px

    /**********************************************/
    /* SPACING                                    */
    /**********************************************/

    val appSpacingXl = 24.px
    val appSpacingLg = 20.px
    val appSpacingMd = 15.px
    val appSpacingSm = 10.px
    val appSpacingXs = 5.px

    /**********************************************/
    /* BREAKPOINTS                                */
    /**********************************************/

    val appBreakpointSm = 320.px
}