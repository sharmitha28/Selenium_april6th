package stepss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Tricentis_pagefactory 
{
	WebDriver driver;
	
	  @FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a") 
	    WebElement Register;    
	    
	    @FindBy(how=How.ID, using="gender-female") 
	    WebElement gender;
	    
	    @FindBy(how=How.ID, using="FirstName")
	    WebElement fname;
	    
	    @FindBy(how=How.ID, using="LastName")
	    WebElement lname;
	    
	    @FindBy(how=How.ID, using="Email")
	    WebElement setemail;
		
	    @FindBy(how=How.ID, using="Password")
	    WebElement passwd;
	    
	    @FindBy(how=How.ID, using="ConfirmPassword")
	    WebElement cnfpasswd;
	    
	    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/span[2]/span") WebElement pwdError;
	    @FindBy(xpath="//*[@id='register-button']")
	    WebElement Regbutton;
	    
//	    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")
//	    WebElement RegPass;
	    @FindBy(how=How.ID, using="register-button")
	    WebElement RegPass;
	    @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a") WebElement login;    
	    @FindBy(how=How.ID, using="Email") WebElement email1;
	    @FindBy(how=How.ID, using="Password") WebElement pwd;
	    
	    @FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input") WebElement Login_button;
	    @FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div") WebElement error;
	    @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
		WebElement computer;
		
		@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")
		WebElement desktop;
		
		@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
		WebElement item;
		
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[8]/div/input[2]")
		WebElement addToCart;
		
		@FindBy(className="content")
		WebElement itemAdded;
		
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]") WebElement Search_button;
		@FindBy(how=How.XPATH, using="//*[@id='small-searchterms']") WebElement Search_bar;
		
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input") WebElement add_cart_jewel;
		
	    @FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a") WebElement Shoping_cart;
	    @FindBy(how=How.XPATH, using="//*[@id='bar-notification']/p") WebElement Notify;
	    
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input") WebElement remove_box ;
		@FindBy(how=How.NAME, using="updatecart") WebElement updatecart;
		
		@FindBy(id="terms-of-service-warning-box")
		WebElement termsWarning;
		
		@FindBy(className="ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ui-dialog-titlebar-close")
		WebElement closeWarning;
		
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input") WebElement quantity;
		@FindBy(how=How.XPATH, using="//*[@id='CountryId']") WebElement countryid;
		@FindBy(how=How.NAME, using="ZipPostalCode") WebElement zip;
		@FindBy(how=How.NAME, using="estimateshipping") WebElement estimate;
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[3]/input") WebElement terms_n_conditions;
		
		
		@FindBy(how=How.ID, using="termsofservice")  WebElement check_box;
		@FindBy(how=How.ID, using="checkout") WebElement checkout;
		                             //html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[4]/button
		@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[1]/h1") WebElement paymentPage;
		@FindBy(how=How.XPATH, using="//*[@id='billing-buttons-container']/input")WebElement bill_add_continue;
	
		@FindBy(how=How.XPATH, using="//*[@id='shipping-buttons-container']/input")WebElement shipping_continue;

		@FindBy(how=How.XPATH, using="//*[@id='shipping-method-buttons-container']/input")WebElement shipping_method_continue;
		@FindBy(id="CardNumber") WebElement Card_numb;
		
		@FindBy(how=How.XPATH, using="//*[@id='paymentmethod_2']")WebElement Credit_cardCheck;
		@FindBy(xpath="//*[@id='payment-method-buttons-container']/input")WebElement CreditContinue;
		
		
		@FindBy(how=How.XPATH, using="//*[@id='CreditCardType']")WebElement card_type;
		@FindBy(how=How.XPATH, using="//*[@id='ExpireMonth']")WebElement expire_month;
		@FindBy(how=How.XPATH, using="//*[@id='ExpireYear']")WebElement expire_year;
		@FindBy(how=How.NAME, using="CardholderName") WebElement C_name;
		//@FindBy(how=How.NAME, using="CardNumber") WebElement Card_numb;
		
		@FindBy(how=How.NAME, using="CardCode") WebElement Card_code;
		@FindBy(xpath="//*[@id='payment-info-buttons-container']/input")WebElement CardContinue;
		@FindBy(xpath="//*[@id='checkout-payment-info-load']/div/div/div[2]/div/ul/li") WebElement CardError;
		@FindBy(xpath="//*[@id='payment-info-buttons-container']/input") WebElement contCard;
		
		@FindBy(how=How.XPATH, using="//*[@id='confirm-order-buttons-container']/input")WebElement confirm;
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")WebElement confirmOrderMessage;

		public void Register() 
		{
			Register.click();
		}
		
		public void gender() 
		{
			gender.click();
		}

		public void fname(String firstname) 
		{
			fname.sendKeys(firstname);
		}
		
		public void lname(String lastname) 
		{
			lname.sendKeys(lastname);
		}
		
		public void setemail(String email)
		{
			setemail.sendKeys(email);
		}
		
		public void passwd(String pwd) 
		{
			passwd.sendKeys(pwd);
		}
		
		public void cnfpasswd(String cnfpwd) 
		{
			cnfpasswd.sendKeys(cnfpwd);
		}
		
		public void Regbutton() 
		{
			Regbutton.click();
		}
		
		public void PwdError() 
		{
			String passwdError = pwdError.getText();
			System.out.println(passwdError);
		}
		public void regPass() throws InterruptedException
		{
			Thread.sleep(3000);
			String registerPass = RegPass.getText();
			System.out.println(registerPass);
		}
	
		
		public void setlogin() 
		{
			login.click();
		}
		
		public void setEmail(String email) 
		{
			email1.sendKeys(email);
		}

		public void setpassword(String passwd) 
		{
			pwd.sendKeys(passwd);
		}
		
		public void setlogbutton()
		{
			Login_button.click();
		}
		
		public void SetError()
		{
			String pwdError = error.getText();
			System.out.println(pwdError);
		}
		
		
		//---------------------------Hover on Computers and add item to cart----------------------
		
		public void ClickComputer() throws InterruptedException{
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.moveToElement(computer).moveToElement(desktop).click().build().perform();	
		}
			
		public void itemClick() throws InterruptedException{
			item.click();
			Thread.sleep(2000);
		}
			
		public void addItem(){
			
			addToCart.click();
		}
		
		public void confirm() throws InterruptedException
		{
			Thread.sleep(1000);
			String confirmMessage = itemAdded.getText();
			System.out.println(confirmMessage);
		}
		
		public void SearchBtn()
		{
			Search_button.click();
			
		}
		public void alrt() throws InterruptedException
		{
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			String str=al.getText();
			System.out.println(str);
			al.accept();
		}
		
		public void enterkey() throws InterruptedException
		{
			Search_bar.sendKeys("Black & White Diamond Heart");
			Search_button.click();
			Thread.sleep(2000);
			
		}
		
		public void Addjewel()
		{
			add_cart_jewel.click();
		}
		
		public void shoppingCart() throws InterruptedException
		{
			Thread.sleep(1000);
			Actions act = new Actions(driver);
			act.moveToElement(Shoping_cart).click().build().perform();
		
		}
		
		public void Notify()
		{
			
			String notify=Notify.getText();
			System.out.println(notify);
		}
		
		
		public void removeItem()
		{
			remove_box.click();
		}
		public void updateRemove()
		{
			updatecart.click();
		}
		public void WarningTerms()
		{
			String warningTerms = termsWarning.getText();
			System.out.println(warningTerms);
		}
		
		public void CloseWarning()
		{
			closeWarning.click();
		}
		
		public void CheckBox()
		{
			checkout.click();
		}
		public void CheckBoxClick()
		{
			check_box.click();
		}
		
		
		public void PaymentsPage()
		{
			String pPage = paymentPage.getText();
			System.out.println(pPage);
		}
		
		public void BillAddContinue()
		{
			bill_add_continue.click();
		}
	
		
		public void Shipping_continue()
		{
			shipping_continue.click();
		}
			
		public void Shipping_method_continue()
		{
			shipping_method_continue.click();
		}
		
		public void ChooseCredit()
		{
			Credit_cardCheck.click();
		}
		
		public void ContinueCC()
		{
			CreditContinue.click();
		}		
		
		public void Card_type(String CardType)
		{
			card_type.sendKeys(CardType);
		}
		
		
		public void Expire_month(String Month)
		{
			expire_month.sendKeys(Month);
		}
		
		public void Expire_year(String Year)
		{
			expire_year.sendKeys(Year);
		}
		
		public void Cname(String CName)
		{
			C_name.sendKeys(CName);
		}
		
		public void CardNumb(String CNum) throws InterruptedException
		{
			Thread.sleep(2000);
			Card_numb.sendKeys(CNum);
		}
		
		public void CardCode(String Ccode)
		{
			Card_code.sendKeys(Ccode);
		}
		
		public void ContinueCard()
		{
			CardContinue.click();
		}
		public void cardError() throws InterruptedException
		{
			Thread.sleep(2000);
			String cardWarning = CardError.getText();
			System.out.println(cardWarning);
		}
		
		public void CContinue()
		{
			contCard.click();
		}
		
		public void ConfirmOrder()
		{
			confirm.click();
		}
		public void ConfirmOrderMessage() throws InterruptedException
		{
			Thread.sleep(2000);
		  String messageConfirm = confirmOrderMessage.getText();
		  System.out.println(messageConfirm);
		}
		
		public Tricentis_pagefactory(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

}