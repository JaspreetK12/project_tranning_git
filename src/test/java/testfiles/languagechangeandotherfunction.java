package testfiles;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.limeroadbase;
import localfiles.limeroadpage;

public class languagechangeandotherfunction  extends limeroadbase {
	
		limeroadpage lp;
		String actualTitle;
		
	@BeforeSuite
	public void Launch() throws InterruptedException 
	{
		initialization();
		lp=new limeroadpage();
	}
	@Test(priority=1)
	public void accessibility() {
		actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals("Online Shopping Site - Shop Men & Women Fashion Online in India", actualTitle);	
	}

	@Test(priority=2)
	public void clicklogowomen()throws InterruptedException{
		lp.lgwomen().click();	
	}
	@Test(priority=3)
	public void clickprofile()throws InterruptedException{
		lp.logoo().click();	
		Thread.sleep(1000);
	}
	@Test(priority=4)
	public void clicklanguage()throws InterruptedException{
		lp.hindii().click();	
	}
	@Test(priority=5)
	public void clickdresses()throws InterruptedException{
		Thread.sleep(1000);
		lp.dresses().click();	
	}
	@Test(priority=6)
	public void clickdressesthird()throws InterruptedException{
		lp.thirdicon().click();	
	}
	@Test(priority=7)
	public void clickcoloure()throws InterruptedException{
		lp.colour().click();	
	}
	@Test(priority=8)
	public void clickblack()throws InterruptedException{
		lp.colourblack().click();	
	}
	@Test(priority=9)
	public void clickbrand()throws InterruptedException{
		lp.brand().click();	
	}
	@Test(priority=10)
	public void clickbrandss()throws InterruptedException{
		lp.brands().click();	
	}
	@Test(priority=11)
	public void clicklanguages()throws InterruptedException{
		lp.profiles().click();	
	}
	@Test(priority=12)
	public void clicklanguagess()throws InterruptedException{
		lp.languagess().click();	
	}
	@Test(priority=13)
	public void clickadd()throws InterruptedException{
		Thread.sleep(1000);
		lp.add().click();	
	}
	@Test(priority=14)
	public void clickaddcart()throws InterruptedException{
		//Thread.sleep(1000);
		lp.addtocart().click();	
	}
	@Test(priority=15)
	public void clickdetails()throws InterruptedException{
		//Thread.sleep(1000);
		String a=lp.detail().getText();	
		System.out.println(a);
		driver.quit();
	}
//	@Test(priority=16)
//	public void clicklogos()throws InterruptedException{
//		Thread.sleep(1000);
//		lp.logos().click();	
//		
//	}
	





}
