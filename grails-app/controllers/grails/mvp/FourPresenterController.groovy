package grails.mvp

import grails.FourService
import grails.plugin.cache.Cacheable

class FourPresenterController {

    FourService fourService

    def renderPresenter() {
        render(view: '/mvp/four', model: [model: fourService.getData()])
    }
}
