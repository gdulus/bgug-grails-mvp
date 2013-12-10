package grails.mvc

class MvcController {

    MvcService mvcService

    def index() {
        return [model: mvcService.getData()]
    }
}
