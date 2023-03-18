package com.cjc.Demoblaze.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.cjc.Demoblaze.utility.Common;

public class Register 
{
	static Logger log=Logger.getLogger(Register.class.getName());
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"signin2\"]")
	WebElement signup;
	@FindBy(xpath = "//*[@id=\"sign-username\"]")
	WebElement uname;
	@FindBy(xpath = "//*[@id=\"sign-password\"]")
	WebElement pass;
	@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	WebElement register;
	//@FindBy(linkText = "OK")
	//WebElement ap;
	//@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")
	//WebElement close;
	public Register(WebDriver driver)
    {
	this.driver=driver;
			}
    public void registercheck() throws InterruptedException, IOException
	{
			signup.click();
			Thread.sleep(2000);
			Common.Data();
		 	String us=Common.Username;
		  	String ps=Common.password;
		  	uname.sendKeys(us);
		  	pass.sendKeys(ps);
			register.click();
			//Actions ac=new Actions(driver);
//			ac.click(ap).build().perform();
		//	driver.switchTo().alert().accept();
	//driver.navigate().back();
//	Thread.sleep(2000);

 //   driver.switchTo().alert().accept();
//		close.click();
//	
		log.info("Registration successfull");
}
}