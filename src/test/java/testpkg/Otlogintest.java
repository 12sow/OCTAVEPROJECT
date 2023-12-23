package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Menpage;
import pagepkg.Otloginpage;
import utilitiespkg.Excelutilities;

public class Otlogintest extends Baseclass {
	@Test
	public void otlogin() throws Exception
	{
		Otloginpage fb1=new Otloginpage(driver);
	
		Thread.sleep(5000);
		fb1.otlogin();
		String xl="/Users/arunk/Desktop/book5.xlsx";
		String Sheet="Sheet1";
		int rowcount=Excelutilities.getRowCount(xl, Sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String UserName=Excelutilities.getCellvalue(xl, Sheet, i,0);
			System.out.println("username--"+UserName);
			
			String Pwd=Excelutilities.getCellvalue(xl, Sheet, i, 1);
			System.out.println("password--"+Pwd);
			//Passing username and password as parameters
			fb1.setvalues(UserName,Pwd);
			//Thread.sleep(5000);
			//driver.navigate().refresh();
			//submitting the data by clicking on login button
			fb1.login();
			
		}
	}
	@Test
	public void otselect() throws Exception 
	{
		
		
		Menpage om=new Menpage(driver);
		
	
		om.otselect();
		
		om.imageclick();
		driver.navigate().refresh();
		
		om.addtocart();
		//driver.navigate().forward();
		
				}
	
	

}
