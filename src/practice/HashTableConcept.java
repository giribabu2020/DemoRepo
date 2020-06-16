package practice;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(1, "Giri");
		ht.put(2,"Shruti");
		ht.put(3, "Bhargavi");
		for(int i=1;i<=ht.size();i++)
			System.out.println(ht.get(i));
	
		
		
	}

}
