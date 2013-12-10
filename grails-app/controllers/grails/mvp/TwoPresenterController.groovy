package grails.mvp

import grails.TwoService

class TwoPresenterController {

    TwoService twoService

    def renderPresenter() {
        render(view: '/mvp/two', model: [model: twoService.getData()])
    }
}
