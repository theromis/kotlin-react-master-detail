import components.listItemLink.ListItemLinkStyles
import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.TextDecoration
import lonje.styled.Colors
import lonje.styled.Variables
import styled.injectGlobal

fun main() {
    window.onload = {
        val styles = CSSBuilder().apply {
            "html, body" {
                margin(0.px)
                padding(0.px)
                fontFamily = "Roboto, \"Helvetica Neue\", sans-serif"
                width = LinearDimension("100%")
                height = LinearDimension("100%")
                background = Colors.appColorBackground.value
                children("main") {
                    width = LinearDimension("100%")
                    height = LinearDimension("100%")
                }
            }
            a {
                textDecoration = TextDecoration.none
            }
            ul {
                margin(0.px)
                padding(0.px)
                listStyleType = ListStyleType.none
                put("list-style-type", "none")
                h1 {
                    marginTop = 0.px
                    marginBottom = 0.px
                    color = Colors.appColorTextPrimary
                    fontSize = Variables.appTextSizeLg
                    fontWeight = FontWeight.w500
                    lineHeight = LineHeight("19.2.px")
                }
                h2 {
                    marginTop = 0.px
                    marginBottom = 0.px
                    lineHeight = LineHeight("20.px")
                    fontWeight = FontWeight.normal
                    fontSize = Variables.appTextSizeMd
                    color = Colors.appColorTextPrimary
                }
                p {
                    marginTop = 0.px
                    marginBottom = 0.px
                    lineHeight = LineHeight("20.px")
                    fontSize = Variables.appTextSizeMd
                    color = Colors.appColorTextSecondary
                }
            }
        }

        injectGlobal(styles.toString())
        ListItemLinkStyles.inject()

        render(document.getElementById("root")) {
            child(App::class) {}
        }
    }
}
