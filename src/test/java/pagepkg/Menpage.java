package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menpage {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"block-mainnavigation-4\"]/div/div/div/ul/li[3]/a")
    WebElement men;
	@FindBy(xpath="//*[@id=\"tb-megamenu-column-1\"]/div/ul/li[2]/a")
	WebElement poloshirt;
	
	@FindBy(xpath="//*[@id=\"block-octave-content\"]/div/div/div/div[2]/div/div[3]/div/a/div[1]/img[1]")
	WebElement image;
	@FindBy(xpath="//*[@id=\"edit-purchased-entity-0-attributes-attribute-size\"]/div[2]/label")
	WebElement radiobutton;
	@FindBy(id="edit-submit--2")
	WebElement addtocart;
public Menpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void otselect()
	
	{
		//WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigation-4\"]/div/div/div/ul/li[3]/a"));

		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu
		actions.moveToElement(men);
		actions.moveToElement(poloshirt);
			
		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
		
	}
	 
public void imageclick()
{
	image.click();
	radiobutton.click();
	
}
public void addtocart()
{
	addtocart.click();
}
}
