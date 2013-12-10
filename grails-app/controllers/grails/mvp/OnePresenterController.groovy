package grails.mvp

import grails.OneService

class OnePresenterController {

    OneService oneService

    def renderPresenter() {
        render(view: '/mvp/one', model: [model: oneService.getData()])
    }
}
