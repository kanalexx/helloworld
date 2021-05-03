package helloworld

class MyController {

    MyService myService

    def index() {
        log.info("execute MyController")
        render myService.greeting()
    }
}
