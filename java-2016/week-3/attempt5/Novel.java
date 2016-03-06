import java.util.*;
public class Novel extends Book{
	//extind clasa Book cu Novel si creez variabila care e in plus fata de ce exista deja in Book
	private String novelType;
	static Scanner novelInput = new Scanner(System.in);
	
	public Novel(){
	}
	
	public Novel(String bookName, int pageNumbers){
		super(bookName, pageNumbers);
		this.novelType = novelType;
	}
	
	public void setNovelType(String newNovelType){
		novelType = newNovelType;
	}
	
	public String retrieveNovelType(){
		System.out.println("asta e tipul de carte");
		return novelType;
	}
	//am incercat sa imi fac aici metodele prin care sa se adauge obiectele de tip novel
	//insa ma lovesc de probleme de genul chestii statice folosite unde nu tb sau chestii private ce nu pot fi accesate 
	public void addNovel(){
		System.out.println("please enter novel title: ");
		bookName = novelInput.nextLine();
	
		cucu = new Novel(bookName, pageNumbers, novelType);
	}
	
}