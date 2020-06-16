package practice;

public class CodingPractice {
// print series 333 222 111,33 22 22, 3 2 2
	public static void main(String[] args) {
		/*int n=3;
		int temp=n,temp1=n,j;
		for(int i=n;i>=1;i--)
		{
			temp=temp1;
			while(temp>=1)
			{
				j=1;
				while(j<=i)
				{
					System.out.print(temp+" ");
					j++;
				}
				temp--;
			}
			System.out.println();
		}
		
		
	}
*/
	int n=5;
	
	StringBuffer s= new StringBuffer();
	//s="";
	while(n>1)
	{
		
		if(n%2==0) s.append("0");
		else s.append("1");
	}
	if(n==1) s.append("1");
	else s.append("0");
	
	System.out.println("result is::"+s.toString());
	
	}
}

	
	
