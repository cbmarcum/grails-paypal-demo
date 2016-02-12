package grails.paypal.demo

import org.grails.plugin.paypal.*

class PurchaseCompletedInterceptor {
    PurchaseCompletedInterceptor() {
        match(controller: 'paypal', action: '(success|notifyPaypal)')
    }

    boolean before() { true }

    boolean after() {
        def payment = request.payment
        if (payment && payment.status == Payment.COMPLETE) {
            def purchase = ProductPurchase.findByPayment(payment)
            if (!purchase.completed) {
                purchase.completed = true
            }
        }
        return true
    }

    void afterView() {
        // no-op
    }

}
