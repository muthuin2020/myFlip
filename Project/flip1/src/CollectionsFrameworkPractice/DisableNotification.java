import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import main.BankInterface;

class PNB implements BankInterface{  
public float rateOfInterest(){return 9.7f;}  
}  
class TestInterface2{  
public static void main(String[] args){  
Bank b=new SBI();  
System.out.println("ROI: "+b.rateOfInterest());  
}} 
