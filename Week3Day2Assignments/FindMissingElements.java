package Week3Day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 2, 3, 4, 10, 6, 8};
		new FindMissingElements().findMissingElements(array);
	}
	
	public void findMissingElements(int[] arr) {
		//create list and add array elements into it
		List<Integer> list = new ArrayList<>();
		for(int i:arr) {
			list.add(i);
		}
		//sort list		
		Collections.sort(list);
		System.out.println("original sorted list "+list);
		System.out.println("size "+list.size());
		//create list to add missing elements
		List<Integer> missingElements =  new ArrayList<>();
		//iterate list elements to find gap
		for(int j=1;j<list.size();j++) {
			if((list.get(j)-list.get(j-1))>1) {
				for (int k = list.get(j - 1) + 1; k < list.get(j); k++) {
				missingElements.add(k);
				}
			}
		}
		System.out.println("missing elements are "+missingElements);
		
	}

}