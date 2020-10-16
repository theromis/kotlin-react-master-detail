package components.masterDetail

import kotlinx.css.*
import lonje.styled.Colors.appColorBorder
import styled.StyleSheet
import lonje.styled.Mixins

object MasterDetailStyles : StyleSheet("MasterDetailStyles", isStatic = true) {
    val component by css {
        width = LinearDimension("100%")
        height = LinearDimension("100%")
        display = Display.flex
        overflow = Overflow.hidden
        put("--max-master", "100%")
        put("--border", "1px solid $appColorBorder")
        "@media ${Mixins.breakpoints["sm"]}" {
            put("--max-master", "360px")
        }
//        Mixins.appWhen("xs")
//        Mixins.appWhen
        /*
        @include app-when('sm') {
            --max-master: 360px;
        }
         */
    }

    private val scrollChildren by css {
        width = LinearDimension("100%")
        height = LinearDimension("100%")
        position = Position.relative
        overflowY = Overflow.auto
        put("touch-action", "pan-y")
        put("will-change", "scroll-position")
        put("overscroll-behavior", "contain")
        put("-ms-touch-action", "pan-y")
        put("-webkit-overflow-scrolling", "touch")
        put("-ms-scroll-chaining", "none")
    }

    val master by css {
        maxWidth = LinearDimension("var(--max-master)")
        +scrollChildren
    }

    val detail by css {
        flexGrow = 1.0
        borderLeft = "var(--border)"
        +scrollChildren
    }
}