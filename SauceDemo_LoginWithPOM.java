package jar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jar.SauceDemoPOM;


public class SauceDemo_LoginWithPOM {
	WebDriver driver;
	SauceDemoPOM login;
	String url="https://www.saucedemo.com/";
	String driverPath="..\\AutomationPractice\\Drivers\\chromedriver.exe";

	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions options=new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver= new ChromeDriver(options);
		driver.get(url);
     }
   
   @AfterSuite
 	public void cierreNavegador(){
   	driver.close();
      }
   
   @Test
   public void irRegistroLogin() {
	   
	   login=new SauceDemoPOM(driver);
	   login.enterEmail("standard_user","secret_sauce");
	   Assert.assertEquals(login.getTextTitleForm(), "Products");
}
}
