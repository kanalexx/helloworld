package helloworld

class Quote {

    String content
    String author
    Date created = new Date()

    static mapping = {
        content comment: "Цитата",
                sqlType: "varchar(1000)",
                length: 1000
    }
    static constraints = {
        author blank: false
        content size: 1..1000, blank: false
    }
}
