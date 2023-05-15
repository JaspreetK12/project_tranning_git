package testfiles;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basefiles.limeroadbase;
import localfiles.limeroadpage;

public class searchbuttoninlimeroad extends limeroadbase {
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
public void clicksearch()throws InterruptedException{
	lp.searchbutton().click();	
}
@Test(priority=3)
public void searchitem()throws InterruptedException{
	lp.searchitems().sendKeys("rings");	
}
@Test(priority=4)
public void searchbutton()throws InterruptedException{
	lp.searchbuttons().click();	
}
}
