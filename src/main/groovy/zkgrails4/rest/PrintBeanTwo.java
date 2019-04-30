package zkgrails4.rest;

public class PrintBeanTwo {

    TestService testService;

    public String printMe() {
        return " -- PrintBean2: hi -- " + testService.getTime();
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}
