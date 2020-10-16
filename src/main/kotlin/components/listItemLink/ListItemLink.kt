package components.listItemLink

import components.listItem.ListItem
import components.listItem.ListItemProps
import kotlinext.js.jsObject
import react.child
import react.functionalComponent
import react.router.dom.navLink
import styled.css

interface ListItemLinkProps : ListItemProps {
    var to: String
}
val ListItemLink = functionalComponent<ListItemLinkProps> { props ->
    navLink<ListItemLinkProps>(
        to = props.to,
        exact = true,
        className = "ListItemListStyles-component",
        activeClassName = "ListItemListStyles-active"
    ) {
        child(ListItem, props)
    }
}