package grails.mvp

import grails.ThreeService

class ThreePresenterController {

    ThreeService threeService

    def renderPresenter() {
        render(view: '/mvp/three', model: [model: threeService.getData()])
    }
}
