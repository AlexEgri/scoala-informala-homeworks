import java.util.*;

public class Library {
	
	private static String bookTypeChosen;
	private static String continuare;
	
public Library(){	
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
		System.out.println("Continuati aplicatia ? yes/no");
			continuare = input.nextLine();
		}
		while (continuare.equals("yes"));
	}
	public static void main(String[] args) {
		Library biblioteca = new Library();
	}
}