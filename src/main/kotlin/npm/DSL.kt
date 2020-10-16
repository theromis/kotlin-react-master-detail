package npm

import react.RBuilder

fun RBuilder.media(handler: MediaProps.() -> Unit) =
        child<MediaProps, Media> {
            attrs(handler)
        }