package testfiles;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.limeroadbase;
import localfiles.limeroadpage;

public class queryoptions extends limeroadbase {
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
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.limeroad.com/?logoutsuccess=true");

}

@Test(priority=3)
public void clickprofile()throws InterruptedException{
	lp.profile().click();
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.limeroad.com/feed?feed_kyc=true&top_level=Women");

}

@Test(priority=4)
public void clickfaq()throws InterruptedException{
	
	lp.faqs().click();
	//Thread.sleep(1000);
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.limeroad.com/feed?feed_kyc=true&top_level=Women");

}

@Test(priority=5)
public void clickaboutus()throws InterruptedException{
	//Thread.sleep(1000);
	String a=lp.about().getText();
	System.out.println(a);
	//Assert.assertEquals(driver.getCurrentUrl(), "https://www.limeroad.com/feed?feed_kyc=true&top_level=Women");

}

}
