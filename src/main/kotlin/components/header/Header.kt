package components.header

import lonje.styled.Mixins
import npm.media
import react.RProps
import react.dom.div
import react.dom.h1
import react.functionalComponent
import react.router.dom.routeLink
import styled.css
import styled.styledDiv

interface HeaderProps : RProps {
    var title: String?
    var hideBackButton: Boolean
}

const val headerEmptyTitle = "No Title"

val Header = functionalComponent<HeaderProps> { props ->
    val title = if (props.title?.isNotEmpty() == true) props.title!! else headerEmptyTitle
    styledDiv {
        css {
            +HeaderStyles.header
        }
        media {
            query = Mixins.mediaQueries["md"]
            children = { matches ->
                if (matches && !props.hideBackButton) {
                    routeLink(to = "../../") {
                        styledDiv {
                            css {
                                +HeaderStyles.back
                            }
                            +"Back"
                        }
                    }
                } else {
                    div {}
                }
            }
        }
        h1 {
            +title
        }
    }
}