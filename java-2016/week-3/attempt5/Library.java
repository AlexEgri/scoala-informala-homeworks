import java.util.*;

public class Library {
	
	private static String bookTypeChosen;
	
	
	public static void main(String[] args) {
	//interoghez userul asupra actiunii dorite din cele disponibile
	Scanner input = new Scanner(System.in);
	System.out.println("Hello what would you want to do?");
	System.out.println("Add a book? Press (1)");
	System.out.println("Remove a book? Press (2)");
	System.out.println("List all books? Press (3)");
	String  choice = input.nextLine();
	switch(choice){
		case "1":
		Book.addBook();
	
	
		case "2":
		System.out.println("Removing book");
		//removeBook();
		return;
	
		case "3":
		System.out.println("listing books");
		//listBooks();
		return;
		
		default: 
		System.out.println("invalid choice");
	}
	
	
	}
}