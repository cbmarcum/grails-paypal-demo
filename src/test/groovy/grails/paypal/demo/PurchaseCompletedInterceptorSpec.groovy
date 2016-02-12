package grails.paypal.demo


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PurchaseCompletedInterceptor)
class PurchaseCompletedInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test purchaseCompleted interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"purchaseCompleted")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
