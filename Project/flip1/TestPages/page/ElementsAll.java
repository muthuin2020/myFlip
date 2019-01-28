package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementsAll {
	
	
	
		
	//--------Home Page Elements----------------
	//@FindBy(how=How.XPATH, using="//div[@class='_1Wr4v5']/div[1]") WebElement myAccnt;
	@FindBy(how=How.CSS, using="div[class='_1Wr4v5']/div[1]") WebElement myAccnt;
	@FindBy(how=How.XPATH, using="//div[text()='Orders']") WebElement orders;
	@FindBy(how=How.XPATH, using="//div[text()='My Profile']") WebElement myPrfl;
	@FindBy(how=How.XPATH, using="//div[text()='Rewards']") WebElement rwrd;
	@FindBy(how=How.XPATH, using="//div[text()='Wishlist']") WebElement wshlst;
	
	
	//--------Login Page Elements----------------
	@FindBy(how=How.XPATH, using="//input[@type='text'][@class='_2zrpKA']") WebElement UserName;
	@FindBy(how=How.XPATH, using="//input[@type='password']") WebElement passwrd;
	@FindBy(how=How.XPATH, using="//button[@class='_2AkmmA _1LctnI _7UHT_c']") WebElement login_Button;

}
