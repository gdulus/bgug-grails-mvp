package grails.mvp

import grails.FiveService

class FivePresenterController {

    FiveService fiveService

    def renderPresenter() {
        render(view: '/mvp/five', model: [model: fiveService.getData()])
    }
}
