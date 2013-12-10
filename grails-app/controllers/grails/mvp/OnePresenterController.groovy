package grails.mvp

import grails.OneService
import grails.plugin.cache.Cacheable

class OnePresenterController {

    OneService oneService

    def renderPresenter() {
        render(view: '/mvp/one', model: [model: oneService.getData()])
    }
}
