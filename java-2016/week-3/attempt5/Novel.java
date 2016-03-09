import java.util.ArrayList;
import java.util.Scanner;

// CODE REVIEW - andrei.hegedus - You should try formatting and indenting your code because it is hard to read.
public class Novel extends Book{
	//extind clasa Book cu Novel si creez variabila care e in plus fata de ce exista deja in Book
	private static String novelType;
	static Scanner novelInput = new Scanner(System.in);
	//datorita faptului ca nu am habar cum as putea pune si novel si albums intr-un singur array le-am facut separat un array la fiecare
	static ArrayList<Novel> novelInventory;
	static Book bookInventoryObject;	
	
	
	public Novel(){
	}
	
	
	
	public Novel(String bookName,String novelType, int pageNumbers){
		//super(bookName, pageNumbers);
		this.bookName = bookName;
		this.novelType = novelType;
	}
	
	public void setNovelType(String newNovelType){
		novelType = newNovelType;
	}
	
	public String getNovelType(){
		System.out.println("asta e tipul de carte");//sa pot testa daca merge, inca nu am apucat sa testez
		return novelType;
	}
	public static void  addNovel(){
	// in mod cert am o problema si la novel si la albume, dupa ce adaug o data un obiect in array, cand mai adaug unul mi-l suprascrie si sare peste titlu
	novelInventory = new ArrayList<Novel>();
		System.out.println("enter novel title:");
		bookName = novelInput.nextLine();
		System.out.println("enter novel type (mistery, sci fi, etc.:");
		novelType = novelInput.nextLine();
		System.out.println("enter novel number of pages:");
		pageNumbers = novelInput.nextInt();
		//deocamdata lipseste verificarea pentru cazul in care in loc de int se introduce un string la numarul de pagini
		Novel roman = new Novel(bookName,novelType, pageNumbers);
		novelInventory.add(roman);
	}
	
	public static void listNovel(){
		System.out.println("There are: "+novelInventory+" novels");
	}
	
	//habar nu am ce face acest override dar altfel nu imi arata cum tb resultatul de la listNovel sau listAlbum
	 @Override
    public String toString(){
	return " Novel title: " + bookName +" |"+ " Novel Type: " + novelType +" |"+ "  Number of Pages: " + pageNumbers;
	}
	
}