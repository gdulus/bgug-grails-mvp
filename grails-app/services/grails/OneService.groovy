package grails

import grails.transaction.Transactional

@Transactional
class OneService {

    List<Long> getData() {
        return (1..100).collect { it }
    }

}
