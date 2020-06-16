package practice;
class Car
{
	public void start()
	{
		System.out.println("car start");
		
	}
	
	public void stop()
	{
		System.out.println("car stop");
		
	}
	
}

class BMW extends Car
{
	public void safety()
	{
		System.out.println("BMW safety");
	}
	
}

public class PolyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.start();
		c.stop();
		
		Car c1=new BMW();
		c1.start();
		c1.stop();
		
		//BMW b1= (BMW) new Car();
		//b1.safety();
		BMW b2 = new BMW();
		b2.start();
		b2.stop();
		b2.safety();
		

	}

}
