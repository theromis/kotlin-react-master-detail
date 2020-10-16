package containers

import components.header.Header
import components.listItemLink.ListItemLink
import kotlinext.js.jsObject
import react.*
import react.dom.li
import react.dom.ul
import react.router.dom.useRouteMatch

val MasterContainer = functionalComponent<RProps> {
    val items = listOf<String>("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r")
    val match = useRouteMatch<RProps>() ?: return@functionalComponent

    child(Fragment, jsObject{}) {
        child(Header, jsObject {
            title = "Master"
            hideBackButton = true
        })
        ul {
            items.map { node ->
                li {
                    attrs {
                        key = node
                    }
                    child(ListItemLink, jsObject{
                        to = "${match.path}/detail/$node"
                        item = node
                    })
                }
            }
        }
    }
}
