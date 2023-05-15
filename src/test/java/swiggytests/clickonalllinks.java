package swiggytests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.swiggybasefile;
import localfiles.swiggytest;

public class clickonalllinks extends swiggybasefile {
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
	public void clicklink1()throws InterruptedException{
		st.link1().click();
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=4)
	public void clicklink2()throws InterruptedException{
		st.link2().click();
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=5)
	public void clicklink3()throws InterruptedException{
		st.link3().click();
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
}
