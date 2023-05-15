package swiggytests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.swiggybasefile;
import localfiles.swiggytest;

public class vissibilitytestswiggy extends swiggybasefile {
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
	Assert.assertEquals(st.login().isDisplayed(),true);
	System.out.println("logo is displayed");
} 
@Test(priority=2)
public void clicksign()throws InterruptedException{
	Assert.assertEquals(st.signinlogo().isDisplayed(),true);
	System.out.println("logo is displayed");
} 
@Test(priority=3)
public void clicklogo()throws InterruptedException{
	Assert.assertEquals(st.swiggyylogo().isDisplayed(),true);
	System.out.println("logo is displayed");
} 

}
