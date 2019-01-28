package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage extends ElementsAll{


public void myCheckList(WebDriver a1) throws Exception {
	Thread.sleep(3000);
	Actions ac=new Actions(a1);
	ac.moveToElement(a1.findElement(By.xpath("//div[@class='_1Wr4v5']/div[1]"))).build().perform();
    orders.click();
	Thread.sleep(3000);
	System.out.println("Inside Orders");
    
	ac.moveToElement(a1.findElement(By.xpath("//div[@class='_1Wr4v5']/div[1]"))).build().perform();
    myPrfl.click();
	Thread.sleep(3000);
	System.out.println("Inside myProfile");
    
	ac.moveToElement(a1.findElement(By.xpath("//div[@class='_1Wr4v5']/div[1]"))).build().perform();
    rwrd.click();
	Thread.sleep(3000);
	System.out.println("Inside Rewards");
    
	ac.moveToElement(a1.findElement(By.xpath("//div[@class='_1Wr4v5']/div[1]"))).build().perform();
    wshlst.click();	
	Thread.sleep(3000);
	System.out.println("Inside Wishlist");

}
}
