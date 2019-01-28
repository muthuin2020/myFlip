package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogIn {
  @Test
  public void f() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Drivers\\chromedriver.exe");
	  System.out.println("Initialyzing Browser");
	 WebDriver a1=new ChromeDriver();	  
	  a1.manage().window().maximize();
	  a1.get("https://www.flipkart.com/");
	  Thread.sleep(10000);
	  String s1=a1.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).getAttribute("value");
	  System.out.println(s1);
  }
}
