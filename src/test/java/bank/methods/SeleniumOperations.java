package bank.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
		
		
		public static WebDriver driver=null;
		
		// ***** Universal Methods Practice
		
		//Browser Launch Method
		
		public static void browserLaunch(Object[] inputParameters)
		{
			try{
				String strBrowserName = (String) inputParameters[0];
			
			String webDriverExePath = (String) inputParameters[1];
			
			if(strBrowserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", webDriverExePath);
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
			}else if(strBrowserName.equalsIgnoreCase("Firefox"))
			
			{
				System.setProperty("webdriver.gecko.driver", webDriverExePath);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			
			} catch (Exception e)
			
			{
				System.out.println(e);
			}
		}
			
		// Open Url method
		
		public static void openUrl(Object[] inputParameters)
		
		{
			try {
			
			String strgURL = (String) inputParameters[0];
			driver.get(strgURL);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		} catch (Exception e) 
			
		{
			System.out.println(e);
		}
			
		}
		
		
		// send key method
		
		public static void sendKey(Object[] inputParameters)
		{
			try {
		
			String xpath = (String) inputParameters[0];
			String value =  (String) inputParameters[1];
			WebElement obj =driver.findElement(By.xpath(xpath));
			obj.sendKeys(value);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		}catch(Exception e)
			
			{
			System.out.println(e);
			}
			
		}
		
		// Click method
		
		public static void click(Object[] inputParameters) 
		{
			
			try{
				String xpath = (String) inputParameters[0];
				WebElement obj = driver.findElement(By.xpath(xpath));
				obj.click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				}catch(Exception e)
					{
						System.out.println(e);
					}
			
		}
		// DropDown
		
		public static void dropdown(Object[] inputParameters)
		{
			try {
			String xpath= (String) inputParameters[0];
			String name = (String) inputParameters[1];
			
			Select sel = new Select(driver.findElement(By.xpath(xpath)));
			sel.selectByVisibleText(name);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
				}catch(Exception e)
					{
						System.out.println(e);
					}
		
		}
		
		public static void validation(Object[] inputParameters)
		{
			String xpath = (String) inputParameters[0];
			WebElement abc=driver.findElement(By.xpath(xpath));
			
			String nextpagetext = abc.getText();
			
			String result = (String) inputParameters[1];
			
			
			
			try {
				
			
			if(result.equalsIgnoreCase (nextpagetext))
				
				{
				System.out.println("TestCase Pass");
				}else
				
				{
				System.out.println("TestCase Fail");
			
				}
			
				}catch(Exception e)
				
					{
						System.out.println(e);
					}
		
			
		}	
		
		
}
		

