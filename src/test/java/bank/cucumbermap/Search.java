package bank.cucumbermap;

import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search 

{

	@When("^user click on branches$")
	public void user_click_on_branches() throws Throwable 
	{
		Object[] input5 = new Object[1];
		input5[0] = "//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.click(input5);

	}

	@When("^user select \"([^\"]*)\" as country$")
	public void user_select_as_country(String country) throws Throwable 
	{
		Object[] input6 = new Object[2];
		input6[0]= "//*[@id='lst_countryS']";
		input6[1]= country;
		SeleniumOperations.dropdown(input6);

	}

	@When("^user select \"([^\"]*)\" as state$")
	public void user_select_as_state(String state) throws Throwable
	{
		Object[] input7 = new Object[2];
		input7[0]= "//*[@id='lst_stateS']";
		input7[1]= state;
		SeleniumOperations.dropdown(input7);

	}

	@When("^user select \"([^\"]*)\" as city$")
	public void user_select_as_city(String city) throws Throwable
	{
		Object[] input8 = new Object [2];
		input8[0]="//*[@id='lst_cityS']";
		input8[1]= city;
		SeleniumOperations.dropdown(input8);

	}

	@When("^user click on Search button$")
	public void user_click_on_Search_button() throws Throwable 
	{
		Object[] input9 = new Object[1];
		input9[0]= "//*[@id='btn_search']";
		SeleniumOperations.click(input9);

	}

	@Then("^Application shows search result for \"([^\"]*)\" city\\.$")
	public void application_shows_search_result_for_city(String result) throws Throwable 
	{
		  Object[] search = new Object[2];
		  search[0]= "(//*[text()='MUMBAI'])[1]";
		  search[1]= result;
		  SeleniumOperations.validation(search);

	}

	
	
}
