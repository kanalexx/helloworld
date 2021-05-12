package helloworld

import grails.gorm.transactions.Transactional

@Transactional
class QuoteService {

    def getStaticQuote() {
        return new Quote(author: "Anonymous", content: "Real Programmers do not eat quiche!")
    }

    def getRandomQuote() {
        def allQuotes = Quote.all
        def randomQuote
        if (allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        } else {
            randomQuote = getStaticQuote()
        }
        return randomQuote
    }
}
