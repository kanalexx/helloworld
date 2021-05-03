package helloworld

import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Value

@Transactional
class MyService implements GrailsConfigurationAware {

    String recipient
    @Value('${foo.bar.hello2}')
    String recipient2

    String greeting() {
        return "Hello ${recipient}, ${recipient2}"
    }

    @Override
    void setConfiguration(Config co) {
        recipient = co.getProperty("foo.bar.hello")
    }
}
