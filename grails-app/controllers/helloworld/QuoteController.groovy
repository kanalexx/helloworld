package helloworld

class QuoteController {

    static scaffold = Quote

    def index() {
        respond Quote.list()
    }

    def home() {
        render ("<h1>Real Programmers do not each quiche!</h1>")
    }

    def random() {
        def allQuotes = Quote.all
        def randomQuote
        if (allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        } else {
            randomQuote = new Quote(author: "Anonymous", content: "Real Programmers do not each quiche!")
        }
        [ quote: randomQuote ]
    }
}
