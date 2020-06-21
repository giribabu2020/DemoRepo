package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	ArrayList ar = new ArrayList();
		ar.add("Giri");
		ar.add(15);
		ar.add(1.5);
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		ar.remove(1);
		
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
			
			*/
		ArrayList<String> tvSeries = new ArrayList<String>();
		
		tvSeries.add("ab");
		tvSeries.add("cd");
		tvSeries.add("de");
		tvSeries.add("gh");
		// print using for loop
	 for(int i=0;i<tvSeries.size();i++)
	 {
		 System.out.println(tvSeries.get(i));
	 }
		
	 // 2nd way using for loop
	 System.out.println("2nd way");
	 for(String s: tvSeries)
	 {

		System.out.println(s); 
	 }
	 System.out.println("3rd way");
	// using lambda expression
	 tvSeries.forEach(s -> 
		 System.out.println(s));
	 
	 System.out.println("4th way using iterator");
	 
	 Iterator<String> it = tvSeries.iterator();
	 while(it.hasNext())
	 {
		 String s=it.next();
		 System.out.println(s);
		 
	 }
	 
	 System.out.println("5th way using array size and get method");
	 
	 for(int i=0; i<tvSeries.size();i++)
	 {
		 System.out.println(tvSeries.get(i));
	 }
		
	}

		
		
}
