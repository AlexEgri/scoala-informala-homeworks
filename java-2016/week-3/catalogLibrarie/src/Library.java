import java.util.ArrayList;
import java.util.Scanner;
public class Library {

		private ArrayList inventoryBooks = new ArrayList();
		private int idBooks = 0;
	
		public void userChoice (){
			System.out.println("what operation do you want to perform? choose 1) to add book; 2) to remove a book or 3) to list the books ");
			Scanner choice = new Scanner(System.in);
			int inputChosen = choice.nextInt();
			int chosen = 1;
			switch(chosen){
				case 1: 
				addBook();
				break;
				case 2: 
				removeBook();
				break;
				case 3: 
				listBook();
				break;
				default: 				
				System.out.println("Invalid Choice!!");
				break;
			}
		}
		public void addBook(){
			System.out.println("adaugam carte:");
		}
		public void removeBook(){
			System.out.println("scoatem carte:");
		}	
		public void listBook(){
			System.out.println("listam carte:");
		}
		public static void main(String[] args) {
		
	}
	
}