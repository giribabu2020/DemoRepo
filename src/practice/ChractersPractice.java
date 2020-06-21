package practice;

public class ChractersPractice {

	public static void main(String[] args) {

   String s="abcd5666";
   for(int i=0;i<s.length();i++)
   {
	   if(Character.isDigit(s.charAt(i)))
	   {
		   System.out.println("String contains digits");
		   break;
	   }
			   
   }
 

	}

}
