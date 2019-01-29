package CollectionsFrameworkPractice;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import main.BankInterface;
import main.SBIBank;

class PNB implements BankInterface{  
public float rateOfInterest(){return 9.7f;}  
}  
class TestInterface2{  
public static void main(String[] args){  
SBIBank b=new SBIBank();  
System.out.println("ROI: "+b.rateOfInterest());  
}} 
