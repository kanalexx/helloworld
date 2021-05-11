package helloworld

class Quote {

    String content
    String author
    Date created = new Date()

    static constraints = {
        author(blank: false)
        content(size: 1..1000, blank: false)
    }
}
