package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Otloginpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"block-useraccountmenu-2\"]/div/a")
	WebElement myaccount;
	@FindBy(id="edit-name")
	WebElement otemail;
	@FindBy(name="pass")
	WebElement otpass;
	@FindBy(name="op")
	WebElement loginbutton;
	
	
	public Otloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void otlogin()
	{
		myaccount.click();
	}
	 
	public void setvalues(String email,String pswd)
	{
		otemail.clear();
		otemail.sendKeys(email);
		otpass.clear();
		otpass.sendKeys(pswd);
	}
	public void login()
	{
		loginbutton.click();
	}


}
