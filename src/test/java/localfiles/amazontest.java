package localfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basefiles.testbase;


public class amazontest  extends testbase {
	public WebDriver driver;
	
	{
		this .driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement search;
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement email;
	@FindBy(id="continue")
	WebElement continues;
	
	public amazontest()
	{
		PageFactory.initElements(driver, this);
		
	}
	public WebElement sign() {
		return search;
	}
		public WebElement mail() {
			return email;
		}
		public WebElement continubutton() {
			return continues;
		}
    }


