package grails.mvp

import grails.FourService

class FourPresenterController {

    FourService fourService

    def renderPresenter() {
        render(view: '/mvp/four', model: [model: fourService.getData()])
    }
}
