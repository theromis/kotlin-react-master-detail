package containers

import components.header.Header
import components.masterDetail.MasterDetailStyles
import kotlinext.js.jsObject
import kotlinx.css.h1
import react.RProps
import react.child
import react.dom.h1
import react.dom.h2
import react.functionalComponent
import react.router.dom.useParams
import styled.css
import styled.styledDiv
import styled.styledSection

interface DetailProps : RProps {
    val id: String
}

val DetailContainer = functionalComponent<RProps> {
    val props = useParams<DetailProps>()
    val header = props?.id ?: "No title"
    styledSection {
        css {
            +DetailStyles.component
        }
        child(Header, jsObject {
            title = props?.id
        })
        styledDiv {
            css {
                +DetailStyles.main
            }
            styledDiv {
                css {
                    +DetailStyles.text
                }
                h1 {
                    +header
                }
                h2 {
                    +"Detail Page"
                }
            }
        }
    }
}