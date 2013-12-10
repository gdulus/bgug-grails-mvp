package grails

import grails.transaction.Transactional

@Transactional
class TwoService {

    List<Long> getData() {
        return (101..200).collect { it }
    }

}
