package practice;

import java.util.List;
import java.util.*;
public class LambdaExpressionConcept {

	public static void main(String[] args) {
		
		List<String>li = new ArrayList<String>();
		li.add("giri");
		li.add("babu");
		li.add("boyani");
		
		li.forEach(
			(n) -> System.out.println(n)
			) ;
		
	}

}
