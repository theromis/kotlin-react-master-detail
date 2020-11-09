package npm

import kotlinext.js.jsObject
import react.RBuilder
import react.RProps

//fun RBuilder.media(handler: MediaProps.() -> Unit) =
//        child<MediaProps, Media> {
//            attrs(handler)
//        }

fun RBuilder.media(handler: MediaProps.() -> Unit) =
        child(Media, jsObject()) {
            attrs(handler.unsafeCast<RProps.() -> Unit>())
        }