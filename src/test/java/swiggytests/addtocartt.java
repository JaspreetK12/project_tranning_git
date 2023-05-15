package swiggytests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.swiggybasefile;
import localfiles.swiggytest;

public class addtocartt extends swiggybasefile{
	swiggytest st;
	String actualTitle;
	
@BeforeSuite
public void Launch() throws InterruptedException 
{
	initialization();
	st=new swiggytest();
}
@Test(priority=1)
public void clicklocation()throws InterruptedException{
	st.location().sendKeys("Rajpura");
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=2)
public void clicklocationfill()throws InterruptedException{
	st.search().click();
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=3)
public void clickbakery()throws InterruptedException{
	st.bakerys().click();
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=4)
public void clickmenu()throws InterruptedException{
	st.menu().click();
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=5)
public void clickdetails()throws InterruptedException{
	 String aa=st.details().getText();
	 System.out.println(aa);
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=6)
public void clickcart()throws InterruptedException{
	Thread.sleep(1000);
	Actions act= new Actions(driver);
	act.moveToElement(st.cartitems()).click(st.cartitems()).perform();
	
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=7)
public void clickpricee()throws InterruptedException{
	String aaa=st.price().getText();
	System.out.println(aaa);
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=8)
public void clickback()throws InterruptedException{
	st.back().click();
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=9)
public void clickloc()throws InterruptedException{
	st.locations().click();
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=10)
public void clicklocations()throws InterruptedException{
	st.changelocations().sendKeys("chandigarh");
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=11)
public void clickchd()throws InterruptedException{
	st.changechd().click();
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}



}
