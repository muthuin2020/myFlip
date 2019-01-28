package main;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dummy2{
	
  @Test
  public void f() throws InterruptedException, ParseException {	 
	  
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\HP\\Downloads\\Drivers\\IEDriverServer.exe");
	  System.out.println("Initialyzing Browser");
	 // ChromeOptions co1=new ChromeOptions();
	  DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	  Date d2=new Date();
	  String sd1=new String("12/11/2019 10:11:01");
	  d2=dateFormat.parse(sd1);
	  
	  //get current date time with Date()
	  Date date =new Date();
	  	  
	  // Now format the date
	  String date1= dateFormat.format(date);
	  
	  // Print the Date
	  System.out.println(date1);
	  
	 // WebDriver a1=new ChromeDriver(co1);	
	  WebDriver a1=new InternetExplorerDriver();
	  
	  WebDriverWait w1=new WebDriverWait(a1, 30);
	
	  
	  a1.manage().window().maximize();
	  a1.get("https://www.flipkart.com/");
	  a1.findElement(By.xpath("//input[@type='text'][@class='_2zrpKA']")).sendKeys("9092913756");
	  a1.findElement(By.xpath("//input[@type='password']")).sendKeys("Royal@123");
	  a1.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	  
Dummy1 d1=PageFactory.initElements(a1, Dummy1.class);
d1.aaa(a1);
	  
  }
}
