package helloworld

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.*
import org.junit.Assert
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
            Assert.assertEquals("Anonymous", staticQuote.author)
            Assert.assertEquals("Real Programmers Don’t eat quiche!", staticQuote.content)
    }
}
