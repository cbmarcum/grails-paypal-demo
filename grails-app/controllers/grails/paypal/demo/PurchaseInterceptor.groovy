package grails.paypal.demo


class PurchaseInterceptor {
    PurchaseInterceptor() {
        match(controller: 'paypal', action: 'buy')
    }

    boolean before() { true }

    boolean after() {
        def user = Customer.get(request.payment.buyerId)
        def item = ProductItem.findByName(request.payment.paymentItems[0].itemName)
        new ProductPurchase(user: user, payment: request.payment, item: item).save(flush: true)
        return true
    }

    void afterView() {
        // no-op
    }

}
