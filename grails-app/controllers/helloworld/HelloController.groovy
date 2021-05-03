package helloworld

class HelloController {

    def index() {
        def recipient = grailsApplication.config.getProperty('my.tmp.dir')

        render "Hello ${recipient}"
        //render "Hello World!"
    }
}
