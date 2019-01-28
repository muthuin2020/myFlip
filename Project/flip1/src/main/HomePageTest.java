package main;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.HomePage;
import tests.Testbase;

public class HomePageTest extends Testbase {	
	
	  HomePage hp;
  
  @Test
  public void myOrdrs() throws Exception {	
	  hp=PageFactory.initElements(a1, HomePage.class);
	  hp.myCheckList(a1); 
  }
  
}

