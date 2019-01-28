package CollectionsFrameworkPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

import org.testng.annotations.Test;

public class ListPractice {
  @Test(priority=0)
  public void arrayListPractice() {
	  
	ArrayList<String> s1=new ArrayList<>();
	
	s1.add("Muthu");
	s1.add("Raina");
	s1.add("78");
	s1.add("Yuvi");
	s1.add("Dhoni");
	s1.add("SAchin");	
	s1.remove(3);
	
	System.out.println("Inside Array List");
	
	Iterator<String> it1=s1.iterator();
	
	while(it1.hasNext()) {

		System.out.println(it1.next());
		
	}	  
  }
  
  @Test(priority=1)
  public void linkedListPractice() {
	  
	LinkedList<String> s1=new LinkedList<>();
	
	s1.add("Muthu");
	s1.add("Raina");
	s1.add("SAchin");
	s1.add("Yuvi");
	s1.add("Dhoni");
	s1.add("SAchin");
	s1.remove(3);
	s1.remove();
		
	System.out.println("Inside Linked List");
	
	Iterator<String> it1=s1.iterator();
	
	while(it1.hasNext()) {
		System.out.println(it1.next());
		
	}	  
  } 
  
  
  @Test(priority=2)
  public void vectorPractice() {
	  
	Vector<String> s1=new Vector<String>();
	
	s1.add("Muthu");
	s1.add("Raina");
	s1.add("SAchin");
	s1.add("Yuvi");
	s1.add("Dhoni");
	s1.add("SAchin");
	s1.remove(3);
	System.out.println("Inside Vector");
	
Iterator<String> it1=s1.iterator();

while(it1.hasNext()) {
	System.out.println(it1.next());
}
	
  }
  
  @Test(priority=3)
  public void stackPractice() {
  Stack<String> stack = new Stack<String>();  
  stack.push("Ayush");  
  stack.push("Garvit");  
  stack.push("Amit");  
  stack.push("Ashish");  
  stack.push("Garima");  
  stack.remove(3);
  stack.add("adding");
  stack.add(1, "addingAtindex1");
  stack.pop(); 
  //stack.peek();
  stack.push("Pushing");
  System.out.println("Inside Stack");
  Iterator<String> itr=stack.iterator();  
  while(itr.hasNext()){  
  System.out.println(itr.next());  
  }  
  } 
  
  
  
  
  
}
