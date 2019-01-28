package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LoginPage extends ElementsAll{
	

public void logInPage(String userName, String passWrd) throws Exception {	
UserName.sendKeys(userName);

Thread.sleep(3000);
passwrd.sendKeys(passWrd);
Thread.sleep(3000);
login_Button.click();	

}

}
