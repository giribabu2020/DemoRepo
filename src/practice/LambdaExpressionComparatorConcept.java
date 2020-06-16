package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


	
	class Product
	{
		int id;
		String name;
		double price;
		
		public Product(int id,String name,double d)
		{
			this.id=id;
			this.name=name;
			this.price=d;
			
		}
	}
	public class LambdaExpressionComparatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> plist = new ArrayList<Product>();
		plist.add(new Product(1,"HP Laptop",5000.54));
		plist.add(new Product(2,"Key Board", 567.3));
		plist.add(new Product(3,"Dell Mouse",123.89));
		
		//sort
		Collections.sort(plist,(p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		
		//for(Product p:plist) {
			//System.out.println(p.id+ " "+p.name+" "+p.price);
		//}

		plist.forEach(p -> System.out.println(p.id+ " "+p.name+" "+p.price)
				);
		
	}

}
