import java.util.*;

public class Library {
	
	private Book [] inventory = new Book[100];
	private int inventoryCount = 0;

	
	





	
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Hello what would you want to do?");
	System.out.println("Add a book? Press (1)");
	System.out.println("Remove a book? Press (2)");
	System.out.println("List all books? Press (3)");
	String  choice = input.nextLine();
	switch(choice){
		case "1":
		System.out.println("What type of book?");
		System.out.println("For a novel press N");
		System.out.println("For an art album  press A");
		String bookChoice = input.nextLine();
		if (bookChoice == "A"){
			//addAlbum();
				System.out.println("album added!");
				return;
		}
		else if (bookChoice == "N"){
			//addNovel();
				System.out.println("novel added!");
			return;
		}
		
		case "2":
		System.out.println("Removing book");
		//removeBook();
			System.out.println("book removed!");
		return;
		case "3":
		System.out.println("listing books");
		return;
	}
	
	
	}
}