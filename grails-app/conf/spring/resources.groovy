import zkgrails4.rest.MainViewModel
import zkgrails4.rest.PrintBean
import zkgrails4.rest.PrintBeanTwo

// Place your Spring DSL code here
beans = {
    printBean(PrintBean)
    printBeanTwo(PrintBeanTwo) { bean ->
        bean.autowire = "byName"
    }

    mainViewModel(MainViewModel) { bean ->
        bean.autowire = "byName"
    }
}
