package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class Testbase {	
	
	public static WebDriver a1;
	
	@BeforeSuite
  public void initDriver() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Drivers\\chromedriver.exe");
	  System.out.println("Initialyzing Browser");
	   a1=new ChromeDriver();	  
	  a1.manage().window().maximize();
  }
  
  @AfterSuite
  public void quitDriver() {
	 System.out.println("Quiting browser"); 
	 a1.quit();	  
  }
  
}
