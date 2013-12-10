package grails.mvp

import grails.OneService
import grails.plugin.cache.Cacheable

class OnePresenterController {

    OneService oneService

    @Cacheable(value = "OnePresenterController")
    def renderPresenter() {
        render(view: '/mvp/one', model: [model: oneService.getData()])
    }
}
