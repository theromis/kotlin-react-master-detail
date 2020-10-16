package components.masterDetail

import containers.DetailContainer
import containers.MasterContainer
import lonje.styled.Mixins
import npm.media
import react.*
import react.dom.*
import react.router.dom.route
import react.router.dom.switch
import react.router.dom.useRouteMatch
import styled.css
import styled.styledSection


interface MasterDetailProps : RProps

val MasterDetail = functionalComponent<MasterDetailProps> {
    val match = useRouteMatch<MasterDetailProps>() ?: return@functionalComponent
    media {
        query = Mixins.mediaQueries["md"]
        children = { matches ->
            if (matches) {
                switch {
                    route(match.path, exact = true) {
                        child(MasterContainer)
                    }
                    route("${match.path}/detail/:id") {
                        div {
                            child(DetailContainer)
                        }
                    }
                }
            } else {
                styledSection {
                    css {
                        +MasterDetailStyles.component
                    }
                    styledSection {
                        css {
                            +MasterDetailStyles.master
                        }
                        route(match.path) {
                            child(MasterContainer)
                        }
                    }
                    styledSection {
                        css {
                            +MasterDetailStyles.detail
                        }
                        switch {
                            route(match.path, exact = true) {
                                child(DetailContainer)
                            }
                            route("${match.path}/detail/:id") {
                                child(DetailContainer)
                            }
                        }
                    }
                }
            }
        }
    }
}
