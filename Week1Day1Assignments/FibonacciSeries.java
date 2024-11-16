package Week1Day1Assignments;

public class FibonacciSeries {
	
	public static void main(String[] args) {

	    int i = 1, n = 8, first = 0, second = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    while (i <= n) {
	      System.out.print(first + ", ");

	      int nextTerm = first + second;
	      first = second;
	      second = nextTerm;

	      i++;
	    }
	  }


}
