package zkgrails4.rest

import org.springframework.web.servlet.ModelAndView

class MvvmController {

    def index() {
        new ModelAndView('mvvm')
    }
}