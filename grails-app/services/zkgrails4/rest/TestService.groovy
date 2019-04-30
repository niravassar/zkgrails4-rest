package zkgrails4.rest

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    PrintBean printBean

    Date getTime() {
        return new Date()
    }
}
