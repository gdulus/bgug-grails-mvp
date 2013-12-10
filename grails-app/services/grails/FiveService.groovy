package grails

import grails.transaction.Transactional

@Transactional
class FiveService {

    List<Long> getData() {
        return (501..600).collect { it }
    }
}
