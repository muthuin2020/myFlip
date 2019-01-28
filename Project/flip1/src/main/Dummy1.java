package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dummy1 {
	
	@FindBy(how=How.XPATH, using="//div[@class='_1Wr4v5']/div[1]") WebElement myAccnt;
	@FindBy(how=How.XPATH, using="//div[text()='Orders']") WebElement orders;
	@FindBy(how=How.XPATH, using="//div[text()='My Profile']") WebElement myPrfl;
	@FindBy(how=How.XPATH, using="//div[text()='Rewards']") WebElement rwrd;
	@FindBy(how=How.XPATH, using="//div[text()='Wishlist']") WebElement wshlst;
	
	
	public void aaa(WebDriver a1) throws InterruptedException {
		Thread.sleep(3000);
		Actions ac=new Actions(a1);
		ac.moveToElement(a1.findElement(By.xpath("//div[@class='_1Wr4v5']/div[1]"))).build().perform();
	    wshlst.click();
		Thread.sleep(3000); 
	}

}
