package practice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesStringsinStringArray {

	public static void main(String[] args) {

  String names[]= {"Java", "Python","Ruby", "C Sharp", "Java","Appium"};
  
  Set<String> store = new HashSet<String>();
  
  for(String name : names)
  {
	  if(store.add(name)== false)
		  System.out.println("The duplicate string in array is "+name);
  }
  
  
	}

}
