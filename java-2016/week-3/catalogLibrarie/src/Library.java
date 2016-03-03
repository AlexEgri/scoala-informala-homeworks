import java.util.Scanner;
public class Library {

		private ArrayList() inventoryBooks = new ArrayList();
		private int idBooks = 0;
	
		public void userChoice (){
			System.out.println("what operation do you want to perform: ");
			Scanner choice = new Scanner(System.in);
			int chosen = choice.nextInt();
			
			Switch (chosen){
				case 1: chosen = 1;
				addBook();
				break;
				case 2: chosen = 2;
				removeBook();
				break;
				case 3: chosen = 3;
				listBook();
				break;
				case 4: chosen != 1 || chosen != 2 || chosen != 3;
				System.out.println("Invalid Choice!!");
				break;
				default: break;				
			}
			
			
		}
		
		
	public static void main(String[] args) {
		
	}
	
}