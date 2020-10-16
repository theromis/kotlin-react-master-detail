package lonje.styled

import kotlinx.css.*
import kotlinx.css.properties.Transitions
import lonje.styled.Colors.appColorBackgroundTransparent
import styled.StyleSheet

object Mixins : StyleSheet("Mixins", isStatic = true) {
    val mediaQueries = mapOf(
        "xs" to "(max-width: 0)",
        "sm" to "(max-width: 576px)",
        "md" to "(max-width: 599px)",
        "lg" to "(max-width: 992px)",
        "xl" to "(max-width: 1200px)"
    )

    val breakpoints = mapOf(
        "xs" to "(min-width: 0)",
        "sm" to "(min-width: 576px)",
        "md" to "(min-width: 599px)",
        "lg" to "(min-width: 992px)",
        "xl" to "(min-width: 1200px)"
    )

    val appBlurBackdrop by css {
        put("backdrop-filter", "blur(4px)")
        backgroundColor = appColorBackgroundTransparent
    }

    val appTransition by css {
        put("transition", "background 0.2s cubic-bezier(.29, .09, .24, .99)")
    }
}