package swiggytests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.swiggybasefile;
import localfiles.swiggytest;

public class logintest extends swiggybasefile {
	swiggytest st;
	String actualTitle;
	
@BeforeSuite
public void Launch() throws InterruptedException 
{
	initialization();
	st=new swiggytest();
}
@Test(priority=1)
public void clicklogin()throws InterruptedException{
	st.login().click();
	//actualTitle=driver.getTitle();
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=2)
public void clickmobileno()throws InterruptedException{
	st.mobileno().sendKeys("9417585370");
	//actualTitle=driver.getTitle();
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=3)
public void clicklogins()throws InterruptedException{
	st.loginclick().click();
	//Thread.sleep(1000);
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=4)
public void clickverify()throws InterruptedException{
	Thread.sleep(20000);
	st.verifyotp().click();
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=5)
public void clicklocation()throws InterruptedException{
	//Thread.sleep(20000);
	st.location().sendKeys("Rajpura");
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}
@Test(priority=6)
public void clicklocationfill()throws InterruptedException{
	//Thread.sleep(20000);
	st.search().click();;
	Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
}

}
