package grails

import grails.transaction.Transactional

@Transactional
class ThreeService {

    List<Long> getData() {
        return (301..400).collect { it }
    }

}
