package CollectionsFrameworkPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pomtest {
  @Test
  public void f() {
	  
	  System.out.println("muthu selvam");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Drivers\\chromedriver.exe");
	  System.out.println("Initialyzing Browser");
	 WebDriver a1=new ChromeDriver();	  
	  a1.manage().window().maximize();
	  a1.get("https://www.tutorialspoint.com/testng/testng_basic_annotations.htm");
	  System.out.println(a1.getTitle());	  
	  
  }
}
