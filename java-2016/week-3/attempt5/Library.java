import java.util.*;

public class Library {
		
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
		System.out.println("What type of book?");
		System.out.println("For a novel press N");
		System.out.println("For an art album  press A");
		String bookChoice = input.nextLine();
		
		switch(bookChoice){
			case "A":
			System.out.println("album added");
			return;
		
			case "N":
			//Novel.addNovel();
			// daca as sti cum sa fac asta ar fi minunat
				
	
			System.out.println("novel added");
			return;
		}
	
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