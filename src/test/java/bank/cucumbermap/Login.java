package bank.cucumbermap;

import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login
{

	@When("^user opens the \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
	public void user_opens_the_browser_and_exe(String arg1, String arg2) throws Throwable 
	{
	   
		Object[] input = new Object[2];
		input[0]="Chrome";
		input[1]= "C:\\RohanHomePractice\\primusBank4\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input);
	}

	@When("^user enters the url \"([^\"]*)\"$")
	public void user_enters_the_url(String arg1) throws Throwable
	{
	
		Object[] input1 = new Object[1];
		input1[0]= "http://www.primusbank.qedgetech.com/";
		SeleniumOperations.openUrl(input1);
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable 
	{
		
		Object[] input2= new Object[2];
		input2[0]= "//*[@id='txtuId']";
		input2[1]= "Admin";
		SeleniumOperations.sendKey(input2);
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable 
	{
	   
		Object[] input3 = new Object[2];
		input3[0]= "//*[@id='txtPword']";
		input3[1]= "Admin";
		SeleniumOperations.sendKey(input3);
		
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		Object[] input4 = new Object[1];
		input4[0]= "//*[@id='login']";
		SeleniumOperations.click(input4);
		
	}
	
	@Then("^user is on the \"([^\"]*)\" main page and ge message as welcome to Admin$")
	public void user_is_on_the_main_page_and_ge_message_as_welcome_to_Admin(String msg) throws Throwable
	{
	   
		  Object[] vtext = new Object[2];
		  vtext[0]= "//*[text()='Admin']";
		  vtext[1]= msg;
		  SeleniumOperations.validation(vtext);
		  
	}
}
