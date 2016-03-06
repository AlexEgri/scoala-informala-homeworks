import java.util.*;
public class Novel extends Book{
	
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
	
	public void addNovel(){
		System.out.println("please enter novel title: ");
		bookName = novelInput.nextLine();
	
		cucu = new Novel(bookName, pageNumbers, novelType);
	}
	
}