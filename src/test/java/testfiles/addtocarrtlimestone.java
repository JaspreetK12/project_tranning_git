package testfiles;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.limeroadbase;
import localfiles.limeroadpage;

public class addtocarrtlimestone extends limeroadbase {
	limeroadpage lp;
	String actualTitle;
	
@BeforeSuite
public void Launch() throws InterruptedException 
{
	initialization();
	lp=new limeroadpage();
}
@Test(priority=1)
public void clicklogowomen()throws InterruptedException{
	lp.lgwomen().click();
	//actualTitle=driver.getTitle();
	Assert.assertEquals(driver.getTitle(), "Online Shopping Site - Shop Men & Women Fashion Online in India");
}
@Test(priority=2)
public void kurtas() throws InterruptedException{
	lp.kurta().click();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.limeroad.com/feed?feed_kyc=true&top_level=Women");
}
@Test(priority=3)
public void click() throws InterruptedException{
	lp.clickb().click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.limeroad.com/?occasion=kurta");
}
@Test(priority=4)
public void kurtaclick() throws InterruptedException{
	lp.kurtaclickb().click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.limeroad.com/sets-here-for-go-cart-ing-by-shivangini-st64490e31f47b700827dfebcf?src_id=feed_story__0");
}
@Test(priority=5)
public void size() throws InterruptedException{
	lp.sizes().click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.limeroad.com/blue-cotton-ishin-p19414400?imgIdx=3&src_id=feed_story__0&reference_story_id=64490e31f47b700827dfebcf");
}
@Test(priority=6)
public void cart() throws InterruptedException{
	lp.addcart().click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.limeroad.com/blue-cotton-ishin-p19414400?imgIdx=3&src_id=feed_story__0&reference_story_id=64490e31f47b700827dfebc");
}
@Test(priority=7)
public void logo() throws InterruptedException{
	lp.logob().click();
	//Assert.assertEquals(driver.getCurrentUrl(), "");
}




}
