package zkgrails4.rest

import org.springframework.web.servlet.ModelAndView

class MinimalController {

    def index() {
        new ModelAndView('minimal')
    }
}