<%@ page import="grails.paypal.demo.ProductItem" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sample Page</title>
    <style>
    .product-item {
        margin-top: 20px;
        margin-bottom: 10px;
    }

    input[type="image"] {
        float: right;
        margin-top: -35px;
    }
    </style>
</head>

<body>
<div style="margin: auto; width: 320px">
    <g:each in="${productItemList as List<ProductItem>}" var="productItem">
        <div class="product-item">
            <h3>${productItem.name}</h3>

            <div>Price: ${productItem.price}</div>
            <paypal:button
                    itemName="${productItem.name}"
                    itemNumber="${productItem.name}"
                    discountAmount="${0}"
                    amount="${productItem.price}"
                    buyerId="${customer.id}"/>
        </div>
    </g:each>
</div>
</body>
</html>