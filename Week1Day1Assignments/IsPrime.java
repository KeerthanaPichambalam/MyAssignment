package Week1Day1Assignments;

public class IsPrime {

	public static void main(String[] args) {
		
		int n=31;
		int count=0;
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime: "+n);
		}
		else
		{
			System.out.println("not prime: "+n);
		}

	}


}
