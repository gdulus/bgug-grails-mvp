package grails.mvc

import grails.FiveService
import grails.FourService
import grails.OneService
import grails.ThreeService
import grails.TwoService
import grails.plugin.cache.Cacheable
import grails.transaction.Transactional

@Transactional
class MvcService {

    OneService oneService

    TwoService twoService

    ThreeService threeService

    FourService fourService

    FiveService fiveService

    @Cacheable(value = "MvcService")
    MvcModel getData() {
        return new MvcModel(
            one: oneService.getData(),
            two: twoService.getData(),
            three: threeService.getData(),
            four: fourService.getData(),
            five: fiveService.getData()
        )
    }

}
