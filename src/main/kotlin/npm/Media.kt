@file:JsModule("react-media")
@file:JsNonModule

package npm

import react.*

@JsName("default")
external class Media : Component<MediaProps, RState> {
//    override fun componentWillMount()
//    override fun componentWillUnmount()
    override fun render(): ReactElement?
}

external interface MediaProps : RProps {
    var defaultMatches: Boolean
    var query: String?
    var children: (matches: Boolean) -> ReactElement?
}
