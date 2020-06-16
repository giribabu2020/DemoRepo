package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("giri");
		ll.add("babu");
		ll.add("boyani");
		System.out.println(ll);
		for(int i=0;i<ll.size();i++)
			System.out.println(ll.get(i));
		
		for(String str:ll)
			System.out.println(str);
		
		Iterator it = ll.iterator();
		while(it.hasNext())
				{
			  String s = (String) it.next();
			  System.out.println(s);
			
				}
			
				
		
	}

}
