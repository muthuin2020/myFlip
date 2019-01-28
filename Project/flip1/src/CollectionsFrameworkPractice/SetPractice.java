package CollectionsFrameworkPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetPractice {
  @Test
  public void hashhSetPractice() {

  HashSet<String> s1=new HashSet<>();  
	s1.add("Muthu");
	s1.add("Raina");
	s1.add("SAchin");
	s1.add("Yuvi");
	s1.add("Dhoni");
	s1.add("");
	System.out.println("Inside HashSet");
	System.out.println("Size of HashSet : "+s1.size());
	s1.remove("Dhon");
	
	Iterator<String> it1=s1.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}	
  }
  
  @Test
  public void linkedHashsetPractice() {
LinkedHashSet<String> s1=new LinkedHashSet<>(); 
	s1.add("Muthu");
	s1.add("Raina");
	s1.add("SAchin");	
	s1.add("Yuvi");
	s1.add("Dhoni");
	s1.add("");
	System.out.println("Inside Linked_HashSet");
	System.out.println("Size of Linked_HashSet : "+s1.size());
	s1.remove("Dhoni");
	
	Iterator<String> it1=s1.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}	
  }
  
  
  @Test
  public void TreeSetPractice() {	  
TreeSet<String> s1=new TreeSet<>();
	s1.add("Muthu");
	s1.add("Raina");
	s1.add("SAchin");	
	s1.add("Yuvi");
	s1.add("Dhoni");
	s1.add("");
	System.out.println("Inside Tree Set");
	System.out.println("Size of Tree Set : "+s1.size());
	s1.remove("Doni");
	
	Iterator<String> it1=s1.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}	
  }
  
  
}
