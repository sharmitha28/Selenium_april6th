@Login
Feature: Tricentis Demo Web Shop



@LoginPass
Scenario: Login functionality for Demo_Web_Shop.
Given user navigates to LoginPage
When I enter Username and Password
Then login should be successful
 @HoverSearch1
Scenario: Search for a product under Computers and add the first item to the cart
Given user navigates to LoginPage
When I enter Username and Password
#Then login should be unsuccessful
	Given user hovers on Computers category and Clicks on Desktops
	When user clicks on Add to Cart for the first desktop
	Then user should be able to add the same item into cart and get confirmation message
	
@HoverSearch	
Scenario: Search for product without entering any value in search bar
	Given user navigates to LoginPage
	When I enter Username and Password
	Given  user navigates to serach  bar 
	When user leaves the search bar empty and clicks on search button
	Then user should get the popup saying Please enter some search keyword

@EnterKey	
Scenario: Search for a product from search bar and add to cart
	Given user navigates to LoginPage
	When I enter Username and Password
	Given user navigates to serach  bar, enters the required product and clicks on search button
	When user  clicks on Add to Cart for the first jewellry
	Then user should get notification
	
@Remove
Scenario: Removing item from shopping cart
	Given user navigates to LoginPage
	When I enter Username and Password
	Given user navigates to serach  bar, enters the required product and clicks on search button
	When user  clicks on Add to Cart for the first jewellry
	Then user should get notification
	Given user navigates to the shopping cart
	When user checks the checkbox of the product which is not required and click on update shopping cart
	Then user should be able to remove the product selected from the cart

@CheckoutFail
Scenario: Failing to check out by not agreeing the terms of service
	Given user navigates to LoginPage
	When I enter Username and Password
	Given user navigates to serach  bar, enters the required product and clicks on search button
	When user  clicks on Add to Cart for the first jewellry
	Then user should get notification
	Given user navigates to the shopping cart
	When user clicks checkout button without checking the Terms of Service checkbox
	Then user should get popup saying Please accept the Terms of Service before the next step
		
@CheckoutPass
Scenario: Checking out from shopping cart page
	Given user navigates to LoginPage
	When I enter Username and Password
	Given user navigates to serach  bar, enters the required product and clicks on search button
	When user  clicks on Add to Cart for the first jewellry
	Then user should get notification
	Given user navigates to the shopping cart
	When user checks the checkbox to agree terms of service and clicks on checkout button
	Then user should be able to navigate to payment page

@PaymentFail
Scenario: Failed payment by leaving the credit card number field empty
	Given user navigates to LoginPage
	When I enter Username and Password
	Given user navigates to serach  bar, enters the required product and clicks on search button
	When user  clicks on Add to Cart for the first jewellry
	Then user should get notification
	Given user navigates to the shopping cart
	When user checks the checkbox to agree terms of service and clicks on checkout button
	Then user should be able to navigate to payment page
	Given user navigates to payment page and enters valid billing address, shipping address, shipping method and payment method as Credit card
	When user leaves the credit card number field empty and clicks continue button
	Then user should get the error message saying Wrong card number

@PaymentPass	
Scenario: Successfull payment
	Given user navigates to LoginPage
	When I enter Username and Password
	Given user navigates to serach  bar, enters the required product and clicks on search button
	When user  clicks on Add to Cart for the first jewellry
	Then user should get notification
	Given user navigates to the shopping cart
	When user checks the checkbox to agree terms of service and clicks on checkout button
	Then user should be able to navigate to payment page
	Given user navigates to payment page and enters valid billing address, shipping address, shipping method and payment method as Credit card
	When user leaves the credit card number field empty and clicks continue button	
	Given user navigates to payment page
	When user enters valid creditcard number
	Then user should be able to book the item and see the confirmation message 	
	
