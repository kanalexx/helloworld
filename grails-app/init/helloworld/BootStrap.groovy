package helloworld

class BootStrap {

    def init = { servletContext ->
        if (!Person.count()) {
            new Person(name: "Fred", age: 40, lastVisit: new Date()).save()
        }
    }
    def destroy = {
    }
}
