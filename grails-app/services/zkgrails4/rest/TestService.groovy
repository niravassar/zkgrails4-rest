package zkgrails4.rest

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    Date getTime() {
        return new Date()
    }
}
