package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import tests.Testbase;


public class LogInTest extends Testbase{
  @Test
  public void logInToPage() throws Exception {	
a1.get("https://www.flipkart.com/");

LoginPage lp=PageFactory.initElements(a1, LoginPage.class);
lp.logInPage("9092913756","Royal@123");
System.out.println("Page Title is : "+a1.getTitle());




  }
  
}
