import java.util.ArrayList;
import java.util.Scanner;
public class Novel extends Book{
	//extind clasa Book cu Novel si creez variabila care e in plus fata de ce exista deja in Book
	private static String novelType;
	static Scanner novelInput = new Scanner(System.in);
	
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
		System.out.println("asta e tipul de carte");
		return novelType;
	}
	public static void  addNovel(){
	novelInventory = new ArrayList<Novel>();
		System.out.println("enter novel title:");
		bookName = novelInput.nextLine();
		System.out.println("enter novel type (mistery, sci fi, etc.:");
		novelType = novelInput.nextLine();
		System.out.println("enter novel number of pages:");
		pageNumbers = novelInput.nextInt();
		//a = new Novel(bookName, novelType, pageNumbers);
		Novel roman = new Novel(bookName,novelType, pageNumbers);
		novelInventory.add(roman);
	}
	
	public static void listNovel(){
		System.out.println("There are: "+novelInventory+" novels");
	}
	
}