package testfiles;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import basefiles.limeroadbase;
import localfiles.limeroadpage;

public class visibilitytestoflimeroad  extends limeroadbase {
	limeroadpage lp;
	String actualTitle;
	public ExtentTest test;
	public ExtentReports extent;
	
	
@BeforeSuite
public void Launch() throws InterruptedException 
{
	initialization();
	lp=new limeroadpage();

}
@BeforeTest
public void x() {
	extent=new ExtentReports("C:\\Users\\jaskaur\\Desktop\\ExtentReports\\filtersExtentReport.html",true);	
}

@AfterTest
public void y() {
	extent.endTest(test);
	extent.flush();
}
@Test(priority=1)
public void clicklogowomen()throws InterruptedException{
	
	test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
	test.log(LogStatus.INFO, "limeroad page load Test is intiated");
	test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
	
	lp.lgwomen().click();
	String actual=driver.getCurrentUrl();
	System.out.println(actual);
	String expected="https://www.limeroad.com/?logoutsuccess=true";
	

	if(actual.equals(expected)) {
		test.log(LogStatus.PASS, " Click home page navigation properly");
	}
	else {
		test.log(LogStatus.FAIL, "Not clicked home page navigation loaded properly");
	}
	
	assertEquals(actual,expected);
	
}
@Test(priority=2)
public void logo()throws InterruptedException{
	test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
	test.log(LogStatus.INFO, "limeroad page load Test is intiated");
	test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
	lp.vibilitylogo().isDisplayed();
	String actual=driver.getCurrentUrl();
	System.out.println(actual);
	String expected="https://www.limeroad.com/?logoutsuccess=true";
	

	if(actual.equals(expected)) {
		test.log(LogStatus.PASS, " logo of website is vissible");
	}
	else {
		test.log(LogStatus.FAIL, "logo of website is not vissible");
	}
	
	assertEquals(actual,expected);
	
}
@Test(priority=3)
public void menlogo()throws InterruptedException{
	test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
	test.log(LogStatus.INFO, "limeroad page load Test is intiated");
	test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
	lp.menlogo().isDisplayed();
	String actual=driver.getCurrentUrl();
	System.out.println(actual);
	String expected="https://www.limeroad.com/?logoutsuccess=true";
	

	if(actual.equals(expected)) {
		test.log(LogStatus.PASS, "mens logo of website is vissible");
	}
	else {
		test.log(LogStatus.FAIL, "mens logo of website is not vissible");
	}
	
	assertEquals(actual,expected);
	
}



@Test(priority=4)
public void kidslogo()throws InterruptedException{
	test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
	test.log(LogStatus.INFO, "limeroad page load Test is intiated");
	test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
	lp.kidslogo().isDisplayed();
	String actual=driver.getCurrentUrl();
	System.out.println(actual);
	String expected="https://www.limeroad.com/?logoutsuccess=true";
	

	if(actual.equals(expected)) {
		test.log(LogStatus.PASS, "womens logo of website is vissible");
	}
	else {
		test.log(LogStatus.FAIL, "womens logo of website is not vissible");
	}
	
	assertEquals(actual,expected);


}
@Test(priority=5)
public void homelogo()throws InterruptedException{
	test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
	test.log(LogStatus.INFO, "limeroad page load Test is intiated");
	test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
	lp.homelogo().isDisplayed();
	String actual=driver.getCurrentUrl();
	System.out.println(actual);
	String expected="https://www.limeroad.com/?logoutsuccess=true";
	

	if(actual.equals(expected)) {
		test.log(LogStatus.PASS, "home logo of website is vissible");
	}
	else {
		test.log(LogStatus.FAIL, "home logo of website is not vissible");
	}
	
	assertEquals(actual,expected);

}
@Test(priority=6)
public void offerlogo()throws InterruptedException{
	test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
	test.log(LogStatus.INFO, "limeroad page load Test is intiated");
	test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
	lp.offerlogo().isDisplayed();
	String actual=driver.getCurrentUrl();
	System.out.println(actual);
	String expected="https://www.limeroad.com/?logoutsuccess=true";
	

	if(actual.equals(expected)) {
		test.log(LogStatus.PASS, "offer logo of website is vissible");
	}
	else {
		test.log(LogStatus.FAIL, "offer logo of website is not vissible");
	}
	
	assertEquals(actual,expected);
	

}
}

