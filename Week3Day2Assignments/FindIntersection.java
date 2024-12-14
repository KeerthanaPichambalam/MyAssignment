package Week3Day2Assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 = {3, 2, 11, 4, 6, 7};
		int[] a2 = {1, 2, 8, 4, 9, 7,11};
		FindIntersection findInter = new FindIntersection();
		findInter.findIntersection(a1, a2);

	}
	
	public void findIntersection(int[] arr1, int[] arr2) {
		
		//create List 
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> intersect = new ArrayList<Integer>();
		
		//add elements to list from array using for loop
		for(int i:arr1) {
			l1.add(i);
		}
		System.out.println("List 1 "+l1);
		for(int i:arr2) {
			l2.add(i);
		}
		System.out.println("List 1 "+l2);
		//add elements to list from array using Collections method which works for String
		//Collections.addAll(l3, arr2);
		
		//add elements to list from array using Arrays.aslist()method
		//List<int[]> l4 = Arrays.asList(arr2);
				
		//compare both list - retainALL will retain elements found in both list
		l1.retainAll(l2);
		System.out.println("common elements are "+l1);
		
		//compare list using for loop
		for(int i=0;i<l1.size();i++) {
			for(int j=0;j<l2.size();j++) {
				if(l1.get(i).equals(l2.get(j))) {
					if(!intersect.contains(l1.get(i))) //avoid duplicate before add element into intersect array
					intersect.add(l1.get(i));
				}
			}
		}
		System.out.println("intersect is "+intersect);
					
	}

}
