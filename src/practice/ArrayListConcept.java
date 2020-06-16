package practice;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add("Giri");
		ar.add(15);
		ar.add(1.5);
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		ar.remove(1);
		
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
	}

}
