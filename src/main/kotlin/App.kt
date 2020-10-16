import react.*
import react.router.dom.browserRouter
import react.router.dom.redirect
import react.router.dom.route
import react.router.dom.switch
import components.masterDetail.MasterDetail

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            switch {
                route("/master") {
                    child(MasterDetail)
//                    child(MasterDetailBak::class) {
//                    }
                }
                redirect( from = "/", to = "/master", exact = true)
            }
        }
    }
}