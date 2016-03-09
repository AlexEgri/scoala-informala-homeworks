import java.util.*;

public class Library {
	
	private static String bookTypeChosen;
	private static String continuare;
	
    /* CODE REVIEW - andrei.hegedus - The purpose of a constructor is to initialize an object.
    The purpose is NOT to start a process / execution.
    */
public Library(){
    /* CODE REVIEW - andrei.hegedus - Keep everything that is code (including comments in English). 
    People who will read your code are expected to speak and understand English. Not Romanian.
    */
	//interoghez userul asupra actiunii dorite din cele disponibile
		
	do {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hello what would you want to do?");
		System.out.println("Add a book? Press (1)");
		System.out.println("Remove a book? Press (2)");
		System.out.println("List all books? Press (3)");
		String  choice = input.nextLine();
		switch(choice){
			case "1":
			Book.addBook(); //apelez metoda din clasa Book prin care sa adaug album sau novel, in functie de decizia userului
			break;
	
			case "2":
			System.out.println("Removing book");
			//removeBook();
			break;
	
			case "3":
			System.out.println("listing books");
			Book.listBook();
			//listBooks();
			break;
		
			default: 
			System.out.println("invalid choice");//daca userul nu introduce un numar valid, se permite revenirea la meniul de inceput
			break;
		}
        // CODE REVIEW - andrei.hegedus - Be consistent with the messages you show on your UI. You are using both english and romanian texts.
		System.out.println("Continuati aplicatia ? yes/no");
			continuare = input.nextLine();
		}
		while (continuare.equals("yes"));
	}
	public static void main(String[] args) {
		Library biblioteca = new Library();
        
        /* CODE REVIEW - andrei.hegedus
        
        The roles of the classes is missunderstood.
        Can you add a book to a Book? (Book.addBook())
        No
        But you can add one to a Library
        
        Book b = new Book(initialization parameters);
        library.addBook(b);
        
        This is what your main method should be doing.
        Using the Library and Book classes together.
        
        */
	}
}