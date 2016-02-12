package grails.paypal.demo

import org.grails.plugin.paypal.*

class ProductPurchase {
    Customer user
    ProductItem item
    Payment payment
    boolean completed = false
}
