package com.cjc.Demoblaze.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import com.cjc.Demoblaze.utility.Common;

public class Orderplace 
{
	static Logger log=Logger.getLogger(Orderplace.class.getName());
	WebDriver driver;
public Orderplace(WebDriver driver)
	{
		this.driver=driver;
}
@FindBy(xpath="//*[@id=\"cartur\"]")
WebElement cart;
@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button")
WebElement orderplace;
@FindBy(xpath="//*[@id=\"name\"]")
WebElement name;
@FindBy(xpath="//*[@id=\"country\"]")
WebElement country;
@FindBy(xpath="//*[@id=\"city\"]")
WebElement city;
@FindBy(css =  "#card")
WebElement cd;
@FindBy(xpath="//*[@id=\"month\"]")
WebElement mnt;
@FindBy(xpath="//*[@id=\"year\"]")
WebElement year;
@FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
WebElement purchorder;
@FindBy(xpath="/html/body/div[10]/h2")
WebElement hdr;
@FindBy(xpath="//div[@class='sweet-alert  showSweetAlert visible']/child :: p")
WebElement id;
//@FindBy(xpath="/html/body/div[10]/p/text()[2]")
//WebElement amount;
//@FindBy(xpath="/html/body/div[10]/p/text()[3]")
//WebElement card;
//@FindBy(xpath="/html/body/div[10]/p/text()[4]")
//WebElement name1;
//@FindBy(xpath="/html/body/div[10]/p/text()[5]")
//WebElement date;
@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
WebElement orderid;

public void ordercheck() throws InterruptedException, IOException
{
	Thread.sleep(1000);
	cart.click();
	Thread.sleep(1000);
	orderplace.click();
	Thread.sleep(1000);
	Common.Data();
 	String a=Common.name;
    name.sendKeys(a);
	Thread.sleep(1000);
	String b=Common.country;
	country.sendKeys(b);
	Thread.sleep(1000);
	String c=Common.city;
	city.sendKeys(c);
	Thread.sleep(1000);
	String d=Common.card;
	cd.sendKeys(d);
	Thread.sleep(1000);
	String e=Common.month;
	mnt.sendKeys(e);
	Thread.sleep(1000);
	String f=Common.year;
	year.sendKeys(f);
	purchorder.click();
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scrollBy(0,100)");
    File fl=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFileToDirectory(fl, new File("src/test/resources/Screenshot"));
	Thread.sleep(2000);
	log.info("Screenshot taken successfull");
	Thread.sleep(2000);
	   WebElement ab= hdr;
       String  aaa=ab.getText();
             log.info(aaa);
             Thread.sleep(5000);
    WebElement abc= id;
     String  aa=abc.getText();
         log.info(aa);
//    WebElement abc1= amount;
//     String  aa1=abc1.getText();
//         log.info(aa1);
//    WebElement abc2= card;
//      String  aa2=abc2.getText();
//        log.info(aa2);
//    WebElement abc3= name1;
//     String  aa3=abc3.getText();
//         log.info(aa3);
//    WebElement abc4= date;
//     String  aa4=abc4.getText();
//         log.info(aa4);
	orderid.click();
}
}
