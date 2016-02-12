package grails.paypal.demo


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PurchaseInterceptor)
class PurchaseInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test purchase interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"purchase")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
