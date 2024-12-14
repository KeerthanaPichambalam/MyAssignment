package Week3Day2Assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionSorting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare String array and assigning variables into it
		String[] array = new String[4];
		array[0]="HCL";
		array[1]="Wipro";
		array[2]="Aspire Systems";
		array[3]="CTS";
		System.out.println(Arrays.toString(array));
		
		//calling without object as method created as static
		sortCollection(array);
	}
	
	public static void sortCollection(String[] arr) {
		//inserting arraying elements into list using asList method (this can be used only when array size is fixed)
		List<String> list = Arrays.asList(arr);
		System.out.println("Original List "+list);
		
		//Sort the list
		Collections.sort(list);
		System.out.println("ascending order "+list);
		
		//reverse using Collections methods
		Collections.reverse(list);
		System.out.println("Reversed list "+list);
		
		//reverse using for loop
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+", ");
		}
	}
}
