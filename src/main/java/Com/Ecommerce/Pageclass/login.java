package Com.Ecommerce.Pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.base;


//page class
public class login extends base
{
	
	public login ()
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="Email")
	public WebElement username;
	
	@FindBy(id="Password")
	public WebElement pass;
	
	@FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
	public WebElement click;
	
	public void setuse (String name)
	{
		username.sendKeys(name);
	}
	public void setpass(String password)
	{
		pass.sendKeys(password);
	}
	public void click()
	{
		click.click();
	}
	
	

}
