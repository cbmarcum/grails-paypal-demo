package grails.paypal.demo

class SampleController {

    def index(){
        [productItemList :ProductItem.list() , customer : Customer.list()?.first()]
    }
}

