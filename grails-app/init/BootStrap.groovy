import grails.paypal.demo.Customer
import grails.paypal.demo.ProductItem

class BootStrap {

    def init = { servletContext ->
        Random ran = new Random()
        if (!ProductItem.count()) {
            (1..5).each {
                new ProductItem(name: "Item $it", price: ran.nextInt(1000).toBigDecimal()).save(flush: true)
            }
        }
        if (!Customer.count()) {
            new Customer(firstName: "John", lastName: 'Doe', email: 'john.doe@gmail.com').save(flush: true)
        }
    }
    def destroy = {
    }
}
