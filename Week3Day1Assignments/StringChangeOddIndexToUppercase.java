package Week3Day1Assignments;

public class StringChangeOddIndexToUppercase {
	
public static void main(String[] args) {
		
		String input= "changeme";
		
		char[] charArray= input.toCharArray();
	
		for (int i = charArray.length-1; i >= 0; i--) {  
			
			if (i%2 != 0) {  
				charArray[i]= Character.toUpperCase(charArray[i]);
			}
			
		}
		
		System.out.println(new String(charArray));
	}

}
