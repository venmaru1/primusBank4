package bank.UnitSteps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Temptjava
{

	public static void main(String[] args) 
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\RohanHomePractice\\primusBank4\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.primusbank.qedgetech.com/");
	
	driver.findElementByXPath("//*[@id='txtuId']").sendKeys("Admin");
	
	driver.findElementByXPath("//*[@id='txtPword']").sendKeys("Admin");
	
	driver.findElementByXPath("//*[@id='login']").click();
	
	driver.findElementByXPath("//*[@src='images/Branches_but.jpg']").click();
	
 
	
	Select sel1 = new Select(driver.findElementByXPath("//*[@id='lst_countryS']"));
	sel1.selectByVisibleText("INDIA");
	
	Select sel2 = new Select(driver.findElementByXPath("//*[@id='lst_stateS']"));
	sel2.selectByVisibleText("MAHARASTRA");
	
	Select sel3 = new Select (driver.findElementByXPath("//*[@id='lst_cityS']"));
	sel3.selectByVisibleText("MUMBAI");
	
	driver.findElementByXPath("//*[@id='btn_search']").click();
	
	}

}
