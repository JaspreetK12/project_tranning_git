package testfiles;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.limeroadbase;

import localfiles.limeroadpage;


public class limeroadtest extends limeroadbase {
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
	lp.profile().click();
}
@Test(priority=4)
public void clicklogin()throws InterruptedException{
	lp.login().click();
}
@Test(priority=5)
public void clickmoblie()throws InterruptedException{
	lp.mobileno().sendKeys("9417585370");
}
@Test(priority=6)
public void clicknext()throws InterruptedException{
	lp. nexts().submit();
}
@Test(priority=7)
public void otps()throws InterruptedException{
	Thread.sleep(1000);
	lp.otp().click();
}
@Test(priority=8)
public void quit() {

driver.quit();
}
}

