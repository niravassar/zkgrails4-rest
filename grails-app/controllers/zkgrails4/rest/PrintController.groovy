package zkgrails4.rest

class PrintController {

    TestService testService

    PrintBeanTwo printBeanTwo

    def index() {
        render "PrintController: hi -- " + testService.getTime()
    }

    def injectIntoBean() {
        render "PrintController: hi -- " + printBeanTwo.printMe()
    }
}