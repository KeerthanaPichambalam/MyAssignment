package Week1Day2Assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		int n=121;
		int rev = 0;
		int output=n;
		for(int i=121;i>0;i=i/10)
		{
		rev =rev*10+i%10;
		}
		
		 if(rev==output) 
		 {   
			   System.out.println(rev +" is palindrome number ");
		 }
		 else    
			  {
			   System.out.println("not palindrome"); 
			   }  

	}


}
