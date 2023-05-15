package testfiles;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.limeroadbase;
import localfiles.limeroadpage;

public class kidsfunctionality extends limeroadbase {
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
}
@Test(priority=2)
public void clickkids()throws InterruptedException{
	lp.kids().click();
	
}
@Test(priority=3)
public void clickhome()throws InterruptedException{
	lp.home().click();
	
}
@Test(priority=4)
public void clickhomelink()throws InterruptedException{
	lp.homelink().click();
	
}
@Test(priority=5)
public void clickwomen()throws InterruptedException{
	lp.womens().click();
	
}
@Test(priority=6)
public void clickdress()throws InterruptedException{
	lp.dress().click();
	
}

	


	



}
