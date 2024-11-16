package Week1Day2Assignments;

public class Library {
	

	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	 public void issueBook()
	{
	System.out.println("Book issued successfully");
	}
	
		public static void main(String[] args)
		{
			Library ref = new Library();
			String title = ref.addBook("War and Peace");
			System.out.println("Book Name: " +title);
			ref.issueBook();
		}
	


}
