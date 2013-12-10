package grails.mvp

import grails.FiveService
import grails.plugin.cache.Cacheable

class FivePresenterController {

    FiveService fiveService

    @Cacheable(value = "FivePresenterController")
    def renderPresenter() {
        render(view: '/mvp/five', model: [model: fiveService.getData()])
    }
}
