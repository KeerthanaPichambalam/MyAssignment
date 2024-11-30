package Week3Day1Assignments;

public class StringReverseOdd {
	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] splitTest = test.split(" ");
		char[] oddWords = null;
		//char[] reverse = null;
		
		for(int i=0;i<splitTest.length;i++) {
			if(i%2==0){
				System.out.print(" "+splitTest[i]+" ");
			}
			else
			 {
				oddWords= splitTest[i].toCharArray();
				for(int j=oddWords.length-1;j>=0;j--) {
					System.out.print(oddWords[j]);}								
			}
		}
		
		

	}
}
