package practice;

public class ArraysStringsConcept {

	public static void main(String[] args) {
		int []i = new int [5];
		System.out.println("array size is "+i.length );
		String s="abcd";
		System.out.println("String length is "+s.length());
		//swap two strings without third variable
		String s1="abced";
		String s2="wxyz";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
	}

}
