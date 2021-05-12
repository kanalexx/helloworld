package helloworld

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class QuoteServiceIntegrationSpec extends Specification {

    QuoteService quoteService

    def setup() {

    }

    def cleanup() {
    }

    void "test something"() {
        when:
            def staticQuote = quoteService.getStaticQuote()
        then:
            staticQuote.author == "Anonymous"
            staticQuote.content == "Real Programmers do not eat quiche!"
    }
}
