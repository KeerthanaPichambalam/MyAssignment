package Week3Day1Assignments;

public class StringRemoveDuplicate {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		int count =0;

		for(int i=0;i<split.length;i++) {
			for(int j=1+1;j<i;j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					split[i]=" ";
					count+=1;					
				}
			}
		}
		StringBuilder output = new StringBuilder();
		for(String word: split) {
			if(!word.equals(" "))
				output.append(word).append(" ");
		}

		System.out.println("Count of duplicate words: " + count);
		System.out.println("Modified String: " + output.toString());
	}

}
