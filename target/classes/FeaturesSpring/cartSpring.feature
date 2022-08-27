Feature: This is to validate cartSpring functionality

@cart
Scenario: Verify that product has been addeed to the cart

Given  Launch spring "<URL>" application  
Then Mouse Hover on Women category 
Then Click Tshirt
Then Select highest price from  dropdown
Then Mouse hover and click Quick view tshirt 
Then Click blue Tshirt  
Then Enter five quantity
Then Click add to Cart
Then Click proceed to checkout button
Then Verify product added to cart