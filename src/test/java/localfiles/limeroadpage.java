package localfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basefiles.limeroadbase;

public class limeroadpage extends limeroadbase {

	public limeroadpage()
	{
	PageFactory.initElements(driver, this);
	}
	
	
	//login to limeroad
	@FindBy(xpath="//span[text()='SHOP WOMEN']")
	WebElement logowomen;
	@FindBy(id="desktop_profile")
	WebElement profile;
	@FindBy(xpath="//*[@id=\"desktop_profile_expand\"]/div[1]/div[3]/a")
	WebElement login;
	@FindBy(id="emph")
	WebElement mobileno;
	@FindBy(xpath="/html/body/div[1]/main/div/div/div/div[2]/form/div[3]/input")
	WebElement next;
	@FindBy(id="modify_for_ctob")
	WebElement otp;
	
	
	//add to cart 
	@FindBy(id="kurta")
	WebElement kurtabutton;
	@FindBy(id="64490e31f47b700827dfebcf")
	WebElement clicks;
	@FindBy(xpath="/html/body/div[1]/main/div[1]/div[2]/div/div[1]/div")
	WebElement kurtaclick;
	@FindBy(id="//*[@id=size_31866830")
	WebElement size;
	@FindBy(xpath="/html/body/div/main/div/div/div[3]/div[1]/div[4]/div[4]/div[2]")
	WebElement addtocart;
	@FindBy(id="DeskLogo")
	WebElement logo;
	//searchitems 
	@FindBy(xpath="//*[@id=\"deskSearch\"]/a")
	WebElement searchbutton;
	@FindBy(id="srcInpu")
	WebElement serachinput;
	@FindBy(xpath="/html/body/div/div[10]/div[1]/div[2]/form/div[3]")
	WebElement searchbuttonclick;
	//Visibility test
	@FindBy(xpath="//a[@id='women_category']")
	WebElement logovisibility;
	@FindBy(xpath="//*[@id=\"men_category\"]")
	WebElement menslogo;
	@FindBy(xpath="//*[@id=\"kids_category\"]")
	WebElement kidslogo;
	@FindBy(xpath="//*[@id=\"home_category\"]")
	WebElement homelogo;
	@FindBy(xpath="//*[@id=\"newDeskOffers\"]/a")
	WebElement offerlogo;
	//functionality of kids logo
	@FindBy(xpath="//*[@id=\"kids_category\"]")
	WebElement kids;
	@FindBy(id="home_category")
	WebElement home;
	@FindBy(id="men_category")
	WebElement men;
	@FindBy(id="women_category")
	WebElement womens;
	@FindBy(xpath="//*[@id=\"DeskLogo\"]")
	WebElement dress;
	//languagechnage
	@FindBy(id="desktop_profile")
	WebElement profileicon;
	@FindBy(xpath="//*[@id=\"desktop_profile_expand\"]/div[4]/div/span")
	WebElement hindi;
	@FindBy(xpath="//*[@id=\"643e85b113cb38081a5d7995\"]")
	WebElement dresses;
	@FindBy(xpath="/div/div[2]/div/div[1]/div/a[1]")
	WebElement third;
	@FindBy(xpath="/html/body/div[1]/main/div/div/div[2]/div[2]/div[1]/div/div[2]/span")
	WebElement colour;
	@FindBy(xpath="/html/body/div[1]/main/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[1]")
	WebElement black;
	@FindBy(xpath="/html/body/div[1]/main/div/div/div[2]/div[2]/div[1]/div/div[3]")
	WebElement brand;
	@FindBy(xpath="/html/body/div[1]/main/div/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/div")
	WebElement brandss;
	@FindBy(xpath="/html/body/div[1]/main/div/div/div[4]/span[2]")
	WebElement languages;
	@FindBy(id="desktop_profile")
	WebElement profileicons;
	@FindBy(xpath="//*[@id=\"desktop_profile_expand\"]/div[4]/div/span")
	WebElement english;
	@FindBy(id="size_27477173")
	WebElement add;
	@FindBy(xpath="/html/body/div[1]/main/div/div/div[3]/div[1]/div[4]/div[4]/div[2]")
	WebElement addcart;
	@FindBy(xpath="/html/body/div[1]/main/div/div/div[3]/div[1]")
	WebElement details;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div[1]/a/div/svg/use")
	WebElement logos;
	//faq section
	@FindBy(xpath="//*[@id=\"desktop_profile_expand\"]/div[3]/div/a")
	WebElement faq;
	@FindBy(xpath="/html/body/div/main/div/div")
	WebElement aboutus;
	
	
	
	

	
	public WebElement lgwomen() {
		return logowomen;
	}
	public WebElement profile() {
		return profile;
	}
		public WebElement login() {
			return login;
		}
		public WebElement mobileno() {
			return mobileno;
		}
		public WebElement nexts() {
			return next;
		}
		public WebElement otp() {
			return otp;
		}
		//add to cart
		public WebElement kurta() {
			return kurtabutton;
		}
		public WebElement clickb() {
			return clicks;
		}
		public WebElement kurtaclickb() {
			return kurtaclick;
		}
		public WebElement sizes() {
			return size;
		}
		public WebElement addcart() {
			return addtocart;
		}
		public WebElement logob() {
			return logo;
		}
		//searchfunctionality
		public WebElement searchbutton() {
			return searchbutton;
		}
		public WebElement searchitems() {
			return serachinput;
		}
		public WebElement searchbuttons() {
			return searchbuttonclick;
    }
		//visibility test
		public WebElement vibilitylogo() {
			return logovisibility;
    }
		public WebElement menlogo() {
			return menslogo;
    }
		public WebElement kidslogo() {
			return kidslogo;
    }
		public WebElement homelogo() {
			return homelogo;
    }
		public WebElement offerlogo() {
			return offerlogo;
    }
		//kidslogofunctionsality
		public WebElement kids() {
			return kids;
    
    }
		public WebElement home() {
			return home;
    
    }
		public WebElement homelink() {
			return men;
    
    }
		public WebElement womens() {
			return womens;
    
    }
		public WebElement dress() {
			return dress;
    
    }
		//language change
		public WebElement logoo() {
			return profileicon;
		}
		public WebElement hindii() {
			return hindi;
		}
		public WebElement dresses() {
			return dresses;
		}
		public WebElement thirdicon() {
			return third;
		}
		public WebElement colour() {
			return colour;
		}
		public WebElement colourblack() {
			return black;
		}
		public WebElement brand() {
			return brand;
		}
		public WebElement brands() {
			return brandss;
		}
		public WebElement languages() {
			return languages;
		}
		public WebElement profiles() {
			return profileicons;
		}
		public WebElement languagess() {
			return english;
		}
		public WebElement add() {
			return add;
		}
		public WebElement addtocart() {
			return addcart;
		}
		public WebElement detail() {
			return details;
		}
		public WebElement logos() {
			return logos;
		}
		//faq section
		public WebElement faqs() {
			return faq;
		}
		public WebElement about() {
			return aboutus;
		}
		
		
		
		
		
}
	


