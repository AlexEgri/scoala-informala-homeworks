import java.util.Scanner;
public class Novel extends Book{
	//extind clasa Book cu Novel si creez variabila care e in plus fata de ce exista deja in Book
	private static String novelType;
	static Scanner novelInput = new Scanner(System.in);
	
	public Novel(){
	}
	
	public Novel(String bookName, int pageNumbers){
		//super(bookName, pageNumbers);
		this.bookName = bookName;
		this.novelType = novelType;
	}
	
	public void setNovelType(String newNovelType){
		novelType = newNovelType;
	}
	
	public String retrieveNovelType(){
		System.out.println("asta e tipul de carte");
		return novelType;
	}
	public static void  addNovel(){
		Novel roman = new Novel();
		System.out.println("enter novel title:");
		bookName = novelInput.nextLine();
		System.out.println("enter novel type (mistery, sci fi, etc.:");
		novelType = novelInput.nextLine();
		System.out.println("enter novel number of pages:");
		pageNumbers = novelInput.nextInt();

		
	}
	//am incercat sa imi fac aici metodele prin care sa se adauge obiectele de tip novel
	//insa ma lovesc de probleme de genul chestii statice folosite unde nu tb sau chestii private ce nu pot fi accesate 
	/* public static void addNovel(){
		Book book = new Book(bookName, pageNumbers, novelType);
		System.out.println("please enter novel title: ");
		book.retrieveBookName() = novelInput.nextLine();
		System.out.println("please enter number of pages: ");
		pageNumbers = novelInput.nextInt();
		System.out.println("please enter type of Novel (sci fi, mistery, romance, etc. : ");
		novelType = novelInput.nextLine();
		cucu = new Novel(bookName, pageNumbers, novelType);
	} */
	
}