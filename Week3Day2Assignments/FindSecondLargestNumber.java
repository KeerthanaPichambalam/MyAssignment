package Week3Day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arary1 =  {3, 2, 11, 4, 6, 7};
		FindSecondLargestNumber large = new FindSecondLargestNumber();
		int number = large.findSecondLargeNumber(arary1);
		System.out.println("2nd Largest number is "+number);

	}
	
	public int findSecondLargeNumber(int[] arr1) {
		List<Integer> li = new ArrayList<>();
		for(int i:arr1) {
			li.add(i);
		}
		Collections.sort(li);
		System.out.println(li);	
		int secondLarge = li.get(1).intValue(); //unbox from Integer to int type
		return secondLarge;
	}

}