package grails.paypal.demo

class ProductItem {
    String name
    BigDecimal price
    static constraints = {
        name(blank:false, nullable:false, unique: true)
        price(blank:false, nullable:false)
    }
}
