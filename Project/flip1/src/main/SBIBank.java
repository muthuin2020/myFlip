package main;

import org.testng.annotations.Test;

public class SBIBank implements BankInterface,BankIntef{
	
	 String s1="selvam";
	
@Test
	public  void main() {
		
		System.out.println(s1);		

	}

	public float rateOfInterest() {
		System.out.println("SBIbank");
		return 10;
	}
	
}
