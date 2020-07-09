package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor
{
	public static void main(String[] args) 
	{
		Object[] input = new Object[2];
		input[0]="Chrome";
		input[1]= "C:\\RohanHomePractice\\primusBank4\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input);
		
		Object[] input1 = new Object[1];
		input1[0]= "http://www.primusbank.qedgetech.com/";
		SeleniumOperations.openUrl(input1);
		
		Object[] input2= new Object[2];
		input2[0]= "//*[@id='txtuId']";
		input2[1]= "Admin";
		SeleniumOperations.sendKey(input2);
		
		Object[] input3 = new Object[2];
		input3[0]= "//*[@id='txtPword']";
		input3[1]= "Admin";
		SeleniumOperations.sendKey(input3);
		
		Object[] input4 = new Object[1];
		input4[0]= "//*[@id='login']";
		SeleniumOperations.click(input4);
		
		Object[] input5 = new Object[1];
		input5[0] = "//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.click(input5);
		
		Object[] input6 = new Object[2];
		input6[0]= "//*[@id='lst_countryS']";
		input6[1]= "INDIA";
		SeleniumOperations.dropdown(input6);
		
		Object[] input7 = new Object[2];
		input7[0]= "//*[@id='lst_stateS']";
		input7[1]= "MAHARASTRA";
		SeleniumOperations.dropdown(input7);
		
		Object[] input8 = new Object [2];
		input8[0]="//*[@id='lst_cityS']";
		input8[1]="MUMBAI";
		SeleniumOperations.dropdown(input8);
		
		Object[] input9 = new Object[9];
		input9[0]= "//*[@id='btn_search']";
		SeleniumOperations.click(input9);
		
		// For Login Validation
		Object[] vtext = new Object[2];
		vtext[0]= "//*[text()='Admin']";
		vtext[1]= "Admin";
		SeleniumOperations.validation(vtext);
		
		// For Search Validation  
		  Object[] search = new Object[2];
		  search[0]= "(//*[text()='MUMBAI'])[1]";
		  search[1]=  "result";
		  SeleniumOperations.validation(search);
		
	}

}
