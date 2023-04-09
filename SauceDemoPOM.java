package jar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SauceDemoPOM {
	
	@FindBy(id="user-name")
	WebElement txtUsername;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="login-button")
	WebElement btnLoginButton;
	
	@FindBy (className="title")
	WebElement TitleForm;
	
	public SauceDemoPOM (WebDriver driver) {
		 PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20),this);
		 
	 }
	
	public void enterEmail(String user,String password) {
		 txtUsername.clear();
		 txtUsername.sendKeys(user);
		 txtPassword.clear();
		 txtPassword.sendKeys(password);
		 btnLoginButton.click();
		 
	   }
	public String getTextTitleForm() {
		 
		 return TitleForm.getText();
	 }

}

