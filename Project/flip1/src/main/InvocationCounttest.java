package main;

import org.testng.annotations.Test;

public class InvocationCounttest {
  @Test(invocationCount=18, invocationTimeOut=1000)
  public void f() throws InterruptedException {
	  Thread.sleep(500);
	  System.out.println("muthu");
	  
  }
}
