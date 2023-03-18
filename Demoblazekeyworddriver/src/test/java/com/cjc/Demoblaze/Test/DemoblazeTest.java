package com.cjc.Demoblaze.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cjc.Demoblaze.pages.Addtocart;
import com.cjc.Demoblaze.pages.Login;
import com.cjc.Demoblaze.pages.Orderplace;
import com.cjc.Demoblaze.pages.Register;





public class DemoblazeTest 
{
	static Logger log=Logger.getLogger(DemoblazeTest.class.getName());
    WebDriver driver;
	@BeforeSuite()
	public void Openbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Browserexe/chromedriver.exe");
		 driver=new ChromeDriver();
	  
	}
    @BeforeTest
    public void openurl()
    {
	driver.get("https://www.demoblaze.com/index.html");
    }
    @BeforeClass
    public void windowshandle()
    {
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority=0)
    public void Registercheck() throws InterruptedException, IOException
    {
    	  Register rg=PageFactory.initElements(driver,Register.class); 
	        rg.registercheck();
    }
  
    @Test(priority=1)
    public void Logintest() throws IOException, InterruptedException
    {
 	 Login rg=PageFactory.initElements(driver,Login.class); 
 	        rg.logincheck();
} 
    @Test(priority=2)
public void addtocart() throws Exception
{
 Addtocart rg=PageFactory.initElements(driver, Addtocart.class); 
        rg.cartcheck();
}
@Test(priority=3)
public void ordplace() throws Exception
{
 Orderplace rg=PageFactory.initElements(driver, Orderplace.class); 
        rg.ordercheck();
}

@AfterSuite
public void browserclosed()
{
	driver.close();
}
}