package localfiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basefiles.swiggybasefile;

public class swiggytest extends swiggybasefile {
	public swiggytest ()
	{
	PageFactory.initElements(driver, this);
	}
	//login for 
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]")
	WebElement login;
	@FindBy(xpath="//*[@id=\"mobile\"]")
	WebElement mobile;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")
	WebElement clicklogin;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a")
	WebElement verifyotp;
	@FindBy(xpath="//*[@id=\"location\"]")
	WebElement location;
	
	//search functionality
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[2]/button[1]")
	WebElement search;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]")
	WebElement searchclick;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[3]/div[1]/div[3]/div/div/div[2]/div/div/div[1]/button")
	WebElement pizaa;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/button[1]/div[1]")
	WebElement clickpiza;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/span[1]")
	WebElement resturant;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/span[2]/span")
	WebElement dishes;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/a")
	WebElement swiggylogo;
	
	//visibility test
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[2]")
	WebElement sign;
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/svg")
	WebElement swiggyloggo;
	
	
	//addtocart
	@FindBy(xpath="//*[@id=\"all_restaurants\"]/div/div[2]/div[1]/div/div[1]/div[2]/a/div/div[1]/div[1]")
	WebElement bakery;
	@FindBy(xpath="//*[@id=\"cid-Recommended\"]/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div")
	WebElement menus;
	@FindBy(xpath="//*[@id=\"cid-Recommended\"]/div[1]/div/div[1]/div[1]/div/div[1]")
	WebElement details;
	@FindBy(xpath="//div[@class='MenuStickyBottom_viewCart__2nNZr MenuStickyBottom_viewCartVisible__37lWa']/button")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]")
	WebElement price;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/a")
	WebElement back;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/div/span[1]")
	WebElement locations;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[2]/div[2]/div/input")
	WebElement changeloc;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div/div/div[1]/div/div[2]/div[1]")
	WebElement chd;
	
	//clicka= all links
	@FindBy(xpath="//*[@id=\"all_restaurants\"]/div/div[1]/div/div/div/div[2]/div[1]")
	WebElement relavent;
	@FindBy(xpath="//*[@id=\"all_restaurants\"]/div/div[1]/div/div/div/div[2]/div[2]")
	WebElement dileverytime;
	@FindBy(xpath="//*[@id=\"all_restaurants\"]/div/div[1]/div/div/div/div[2]/div[3]")
	WebElement ratings;
	
	//filters
	@FindBy(xpath="//*[@id=\"all_restaurants\"]/div/div[1]/div/div/div/div[2]/div[6]")
	WebElement filters;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[1]/div[2]/label[5]/div/div[1]")
	WebElement item1;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[1]/div[2]/label[13]")
	WebElement item2;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[1]/div[2]/label[14]/div")
	WebElement item3;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[1]/div[2]/label[18]/div")
	WebElement item4;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[1]/div[2]/label[20]/div")
	WebElement item5;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[1]/div[2]/label[11]/div")
	WebElement item6;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[4]/div/a[2]")
	WebElement item7;
	
	
	//offers test
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/ul/li[4]")
	WebElement offers;
	@FindBy(xpath="//*[@id=\"payment\"]")
	WebElement payment;
	@FindBy(xpath="//*[@id=\"offers-containers\"]/div[3]/div[1]/div/div[1]/div[1]/button[1]")
	WebElement offer1;
	
	
	
	
	//login
	public WebElement login() {
		return login;
	}
	public WebElement mobileno() {
		return mobile;
	}
	public WebElement loginclick() {
		return clicklogin;
	}
	public WebElement verifyotp() {
		return verifyotp;
	}
	public WebElement location() {
		return location;
	}
	//search functionality
	
	public WebElement search() {
		return search;
	}
	public WebElement searchclick() {
		return searchclick;
	}
	public WebElement searchpizaa() {
		return pizaa;
	}
	public WebElement pizaa() {
		return clickpiza;
	}
	public WebElement resturant() {
		return resturant;
	}
	public WebElement dishes() {
		return dishes;
	}
	public WebElement swiggylogo() {
		return swiggylogo;
	}
	//visibility
	public WebElement signinlogo() {
		return sign;
	}
	public WebElement swiggyylogo() {
		return swiggyloggo;
	}
	
	
	//add to cart
	public WebElement bakerys() {
		return bakery;
	}
	public WebElement menu() {
		return menus;
	}
	public WebElement details() {
		return details;
	}
	public WebElement cartitems() {
		return cart;
	}
	public WebElement price() {
		return price;
	}
	public WebElement back() {
		return back;
	}
	public WebElement locations() {
		return locations;
	}
	public WebElement changelocations() {
		return changeloc;
	}
	public WebElement changechd() {
		return chd;
	}
	//click all links
	public WebElement link1() {
		return relavent;
	}
	public WebElement link2() {
		return dileverytime;
	}
	public WebElement link3() {
		return ratings;
	}
	//filters
	public WebElement filters() {
		return filters;
	}
	public WebElement items1() {
		return item1;
	}
	public WebElement items2() {
		return item2;
	}
	public WebElement items3() {
		return item3;
	}
	public WebElement items4() {
		return item4;
	}
	public WebElement items5() {
		return item5;
	}
	public WebElement items6() {
		return item6;
	}
	public WebElement items7() {
		return item7;
	}
	
	//offers test 
	public WebElement offers() {
		return offers;
	}
	public WebElement payment() {
		return payment;
	}
	public WebElement offer1() {
		return offer1;
	}
	
	



	
	
	

}
