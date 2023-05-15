package swiggytests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.swiggybasefile;
import localfiles.swiggytest;

public class searchfunctionality extends swiggybasefile{
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
	public void clicksearchbutton()throws InterruptedException{
		st.searchclick().click();
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=4)
	public void clicksearchpiza()throws InterruptedException{
		st.searchpizaa().click();
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=5)
	public void clickpiz()throws InterruptedException{
		st.pizaa().click();
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=6)
	public void clickresturant()throws InterruptedException{
		st.resturant().click();
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=7)
	public void clickdishes()throws InterruptedException{
		st.dishes().click();
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=8)
	public void clicklogo()throws InterruptedException{
		st.swiggylogo().click();
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	

}





