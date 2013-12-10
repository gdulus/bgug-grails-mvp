package grails.mvp

import grails.ThreeService
import grails.plugin.cache.Cacheable

class ThreePresenterController {

    ThreeService threeService

    @Cacheable(value = "ThreePresenterController")
    def renderPresenter() {
        render(view: '/mvp/three', model: [model: threeService.getData()])
    }
}
