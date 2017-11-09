$(document).ready(function () {
    var $productCard = $('.product-card');
    $productCard.mouseenter(function () {
        $('.buy-button', this).css("display", "block");
    })
    $productCard.mouseleave(function () {
        $('.buy-button', this).css("display", "none");
    })
//Buy product from Product Detail page
    var $plus = $('.plus-button');
    var $minus = $('.minus-button');
    var $input = $('.quantity-input');
    var $cartAddButton = $('#product-detail-add-cart');
    var $cartBadge = $('.cart-quantity')

    $plus.click(function () {
        var value = +$input.val();
        value++;
        $input.val(value);
    })
    $minus.click(function () {
        var value = +$input.val();
        value--;
        if (value < 1) {
            value = 1;
        }
        $input.val(value);

    })
    $cartAddButton.click(function () {
    	
    	
        var cartQty = +$cartBadge.text();
        var orderQty = +$input.val();
        cartQty = cartQty + orderQty;
        $cartBadge.text(cartQty);
    })
    
//    Buy product from Homepage
    var $buyButton = $('.buy-button');
    $buyButton.on('click', function(){
//    	Store into localstorage
    	var $productId = $(this).next().text();
    	var orderedProduct = {"id" : $productId, "quantity":1};
    	var myCart = new Array();
    	if (localStorage.getItem("myCart")){
    		console.log(localStorage.getItem("myCart"));
    		var existed = false;
    		$.each(myCart, function(item, index){
    				if (item.id === $productId){
    					console.log("existed");
    					tempId = item.id;
    					tempQty = item.quantity + 1;
    					myCart.slice(index, 1, {"id":tempId, "quantity": tempQty});
        				existed = true;
    			}   			
    		})
    		if (!existed) {myCart.push(orderedProduct);}    		
    	} else {
    		myCart = new Array();
    		myCart.push(orderedProduct);
    	}
    	
    	localStorage.setItem("myCart", JSON.stringify(myCart));

    	var orderQty = +$cartBadge.text();
    	orderQty++;
    	$cartBadge.text(orderQty);
    })
    
//    Open log in modal
    var $loginModal = $('#login-modal');
    var $loginButton = $('#loginButton');
    $loginButton.on('click', function(){
    	$loginModal.css("display", "block");
    })
    
//    Open shopping cart modal
    var $shoppingCartIcon = $('.fa-shopping-cart');
    var $shoppingCartModal = $('#shopping-cart-modal');
    $shoppingCartIcon.on('click', function(){
    	$shoppingCartModal.css("display", "block");
    })
})