package grails

import grails.transaction.Transactional

@Transactional
class FourService {

    List<Long> getData() {
        return (401..500).collect { it }
    }
}
