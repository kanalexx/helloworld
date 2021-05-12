package helloworld

class QuoteController {

    static scaffold = Quote

    def quoteService

    def index() {
        respond Quote.list()
    }

    def home() {
        render ("<h1>Real Programmers do not each quiche!</h1>")
    }

    def random() {
        def randomQuote = quoteService.getRandomQuote()
        [ quote: randomQuote ]
    }

    def ajaxRandom() {
        def randomQuote = quoteService.getRandomQuote()
//        render "<q>${randomQuote.content}</q>" +
//            "<p>${randomQuote.author}</p>"
        render {
            q(randomQuote.content)
            p(randomQuote.author)
        }
    }
}
