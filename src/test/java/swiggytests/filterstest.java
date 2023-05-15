package swiggytests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import basefiles.swiggybasefile;
import localfiles.swiggytest;

public class filterstest extends swiggybasefile {
	
		swiggytest st;
		String actualTitle;
		public ExtentTest test;
		public ExtentReports extent;
		
	@BeforeSuite
	public void Launch() throws InterruptedException 
	{
		initialization();
		st=new swiggytest();
	}
	@BeforeTest
	public void x() {
//		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);	
		extent=new ExtentReports("D:\\Eclipe IDe\\projecttrainig\\extent_report\\filtersExtentReport.html",true);
	}

	@AfterTest
	public void y() {
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=1)
	public void clicklocation()throws InterruptedException{
		
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.location().sendKeys("Rajpura");
		//Thread.sleep(1000);
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
		
		
	}
	@Test(priority=2)
	public void clicklocationfill()throws InterruptedException{
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.search().click();
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
		
		
	}
	@Test(priority=3)
	public void clickfilters()throws InterruptedException{
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.filters().click();
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=4)
	public void clickitems1()throws InterruptedException{
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.items1().click();
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=5)
	public void clickitems2()throws InterruptedException{
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.items2().click();
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=6)
	public void clickitems3()throws InterruptedException{
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.items3().click();
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=7)
	public void clickitems4()throws InterruptedException{
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.items4().click();
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=8)
	public void clickitems5()throws InterruptedException{
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.items5().click();
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=9)
	public void clickitems6()throws InterruptedException{
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.items6().click();
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	@Test(priority=10)
	public void clickitems7()throws InterruptedException{
		test=extent.startTest("Verify whether limeeoad  Page Loads Successfully");
		test.log(LogStatus.INFO, "limeroad page load Test is intiated");
		test.log(LogStatus.INFO,"Verify limeroad Page Loads Successfully");
		st.items7().click();
		String actual=driver.getTitle();
		String expected= "Order food online from India's best food delivery service. Order from restaurants near you";
		
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user is on homepage");
		}
		else {
			test.log(LogStatus.FAIL, "user is not on homepage");
		}
		Assert.assertEquals(driver.getTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}

}
