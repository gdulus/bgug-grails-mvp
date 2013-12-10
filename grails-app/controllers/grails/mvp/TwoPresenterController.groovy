package grails.mvp

import grails.TwoService
import grails.plugin.cache.Cacheable

class TwoPresenterController {

    TwoService twoService

    def renderPresenter() {
        render(view: '/mvp/two', model: [model: twoService.getData()])
    }
}
