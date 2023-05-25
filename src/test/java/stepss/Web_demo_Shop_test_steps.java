package stepss;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Web_demo_Shop_test_steps 
{
	WebDriver driver;
	Tricentis_pagefactory objdemo;
	
	@Given("^Open the  browser and launch the application$")
	public void open_the_browser_and_launch_the_application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSHARMIT\\eclipse-workspace\\Selenium_project\\src\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		objdemo = new Tricentis_pagefactory(driver);
		objdemo= PageFactory.initElements(driver, Tricentis_pagefactory.class);
	}

	//Unsuccessful Registration
	@Given("^User navigates to Registration page for password mismatch$")
	public void user_navigates_to_Registration_page_for_password_mismatch() throws Throwable 
	{
		objdemo.Register();
		objdemo.gender();
		objdemo.fname("Indu");
		objdemo.lname("b");
		objdemo.setemail("indu20212311@gmail.com");
				
	}
	@When("user enters different passwords")	
		public void user_enters_different_passwords()
		{
		objdemo.passwd("Indubagweadi1");
		objdemo.cnfpasswd("Indu");
		objdemo.Regbutton();
		}
	@Then("User gets Error message")
	public void User_gets_Error_message()
	{
		objdemo.PwdError();
	}
	@After
	public void closeBrowser()
	{
		driver.close();
	}

	//Successful Registration
	@Given("User navigates to Registration page")
	public void registration_page() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSHARMIT\\eclipse-workspace\\Selenium_project\\src\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		objdemo = new Tricentis_pagefactory(driver);
		objdemo= PageFactory.initElements(driver, Tricentis_pagefactory.class);
	}
	@When("^User Enters gneder <gender> and  fname <fname> and lname <lname> and Email <email> and Password <password> and confirmpassword <cnfpassword >$")
	public void user_Enters_gneder_gender_and_fname_fname_and_lname_lname_and_Email_email_and_Password_password_and_confirmpassword_cnfpassword() throws Throwable 
	{
		objdemo.Register();
		objdemo.gender();
		objdemo.fname("AnuPrasadana");
		objdemo.lname("b");
		objdemo.setemail("anuprasadana@gmail.com");
		objdemo.passwd("haianuprasadana");
		objdemo.cnfpasswd("haianuprasadana");
		objdemo.Regbutton();
			
	}

	@Then("^click on Register button$")
	public void click_on_Register_button() throws Throwable 
	{
		objdemo.regPass();
	}
	
	//Login functionality for Demo_Web_Shop.
	@Given("user navigates to LoginPage")
	public void user_navigates_to_LoginPage() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PSHARMIT\\eclipse-workspace\\Selenium_project\\src\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	 objdemo = new Tricentis_pagefactory(driver);
	    objdemo = PageFactory.initElements(driver,Tricentis_pagefactory.class ); 
		
	}

	//Unsuccessful Login
	@When("I enter Username and Password")
	public void I_enter_Username_and_Password() 
	{
		objdemo.setlogin();
		objdemo.setEmail("nishu@gmail.com");
		objdemo.setpassword("haihello");
		objdemo.setlogbutton();
		
	}	

	@Then("login should be successful")
	public void login_should_be_successful() 
	{
		System.out.println("Login successfull");
	}

	@Given("user hovers on Computers category and Clicks on Desktops")
	public void user_hovers_on_Computers_category_and_Clicks_on_Desktops() throws InterruptedException 
	{
		Thread.sleep(3000);
		objdemo.ClickComputer();
		Thread.sleep(3000);
		
		//objdemo.desk();
	}

	@When("user clicks on Add to Cart for the first desktop")
	public void user_clicks_on_Add_to_Cart_for_the_first_desktop() throws InterruptedException 
	{
		objdemo.itemClick();
		objdemo.addItem();
		System.out.println("Item added to cart");
	}

	@Then("user should be able to add the same item into cart and get confirmation message")
	public void user_should_be_able_to_add_the_same_item_into_cart_and_get_confirmation_message() throws InterruptedException 
	{
		objdemo.confirm();
	}

	@Given("user navigates to serach  bar")
	public void user_navigates_to_serach_bar()
	{
	   System.out.println("User is in search page");
	   
	}

	@When("user leaves the search bar empty and clicks on search button")
	public void user_leaves_the_search_bar_empty_and_clicks_on_search_button() 
	{
		 objdemo.SearchBtn();
	}

	@Then("user should get the popup saying Please enter some search keyword")
	public void user_should_get_the_popup_saying_Please_enter_some_search_keyword() throws InterruptedException 
	{
		objdemo.alrt();
	}

	@Given("user navigates to serach  bar, enters the required product and clicks on search button")
	public void user_navigates_to_serach_bar_enters_the_required_product_and_clicks_on_search_button() throws InterruptedException 
	{
	   objdemo.enterkey();
	    
	}

	@When("user  clicks on Add to Cart for the first jewellry")
	public void user_clicks_on_Add_to_Cart_for_the_firstitem() 
	{
		objdemo.Addjewel();
		
		
	}
	@Then("user should get notification")
	public void user_gets_notification() throws InterruptedException{
		objdemo.Notify();
		objdemo.shoppingCart();
	}

	
	
	@Given("User navigates to shopping cart")
	public void user_navigates_to_shopping_cart() throws InterruptedException
	{
		objdemo.shoppingCart();
	}
	@When("user checks the checkbox of the product which is not required and click on update shopping cart")
	public void user_checks_the_checkbox_of_the_product_which_is_not_required_and_click_on_update_shopping_cart() 
	{	    
	    objdemo.removeItem();
	}

	@Then("user should be able to remove the product selected from the cart")
	public void user_should_be_able_to_remove_the_product_selected_from_the_cart() 
	{		
		objdemo.updateRemove();
	}
	
	
	// Failing to check out by not agreeing the terms of service
	@Given("user navigates to the shopping cart")
	public void user_navigation_shopping_cart() throws Exception
	{
		//objdemo.shoppingCart();
		System.out.println("Shopping cart");
		//*[@id="topcartlink"]/a/span[1]
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
		driver.findElement(By.name("giftcardcouponcode")).sendKeys("abcdef");
		Thread.sleep(5000);
	}
	@When("user clicks checkout button without checking the Terms of Service checkbox")
	public void user_clicks_checkout_button_without_checking_the_Terms_of_Service_checkbox() 
	{
	    objdemo.CheckBox();
	}

	@Then("user should get popup saying Please accept the Terms of Service before the next step")
	public void user_should_get_popup_saying_Please_accept_the_Terms_of_Service_before_the_next_step()
    {
		
	    objdemo.WarningTerms();
	}

	//Checking out from shopping cart page
	@Given("user navigates to the shopping cart and clicks close button in warning box")
	public void user_navigates_to_cart()
	{
		System.out.println("Shopping cart");
	}
	@When("user checks the checkbox to agree terms of service and clicks on checkout button")
	public void user_selects_the_country_state_and_checks_the_checkbox_to_agree_terms_of_service_and_clicks_on_checkout_button() 
	{
	    objdemo.CheckBoxClick();
	    objdemo.CheckBox();
	}

	@Then("user should be able to navigate to payment page")
	public void user_should_be_able_to_navigate_to_payment_page() 
	{
	    
	    objdemo.PaymentsPage();
	  
	}

	//Failed payment by leaving the credit card number field empty
	@Given("user navigates to payment page and enters valid billing address, shipping address, shipping method and payment method as Credit card")
	public void user_opts_CreditCard() 
	{
		 objdemo.BillAddContinue();
		 objdemo.Shipping_continue();
		 objdemo.Shipping_method_continue();
		 
	}

	@When("user leaves the credit card number field empty and clicks continue button")
	public void user_enters_the_billing_address_shipping_address_shipping_method_payment_method_payment_information_and_clicks_on_confirm_button() 
	{
		objdemo.ChooseCredit();
		objdemo.ContinueCC();
		objdemo.Card_type("Visa");
		objdemo.Expire_month("03");
	    objdemo.Expire_year("2021");
	    objdemo.Cname("Nischitha");
	    objdemo.CardCode("225");
	    objdemo.ContinueCard();
	    
	}

	@Then("user should get the error message saying Wrong card number")
	public void user_should_get_the_message_saying_Wrong_card_number() throws InterruptedException 
	{
		objdemo.cardError();
	}

	// Successful payment
	@Given("user navigates to payment page")
	public void user_navigates_to_payment_page_and_enters_valid_Credit_card_details() throws InterruptedException 
	{
	    objdemo.CardNumb("123456789123456789");
	}

	@When("user enters valid creditcard number")
	public void user_clicks_continue_button()
	{
		objdemo.CContinue();
	}

	@Then("user should be able to book the item and see the confirmation message")
	public void user_should_get_the_confirmation_message() throws InterruptedException 
	{
		objdemo.ConfirmOrder();
		objdemo.ConfirmOrderMessage();
	}


	
}