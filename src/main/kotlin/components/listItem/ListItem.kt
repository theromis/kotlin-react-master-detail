package components.listItem

import react.RProps
import react.dom.h1
import react.dom.h2
import react.dom.p
import react.functionalComponent
import styled.css
import styled.styledDiv

interface ListItemProps : RProps {
    var item: String
}

val ListItem = functionalComponent<ListItemProps> { props ->
    styledDiv {
        css {
            +ListItemStyles.component
        }
        styledDiv {
            css {
                +ListItemStyles.inner
            }
            h1 {
                +props.item
            }
            h2 {
                +props.item
            }
            p {
                +props.item
            }
            p {
                +props.item
            }
        }
    }
}