import java.util.ArrayList;
import java.util.Scanner;
public class ArtAlbum extends Book{
	static Scanner inputAlbum = new Scanner(System.in);
	private static String paperQuality;
	static Book bookInventoryObject;
	static ArrayList<ArtAlbum> albumInventory = new ArrayList<ArtAlbum>();
	
	
	public ArtAlbum(){
	}
	
	public ArtAlbum(String bookName,String paperQuality, int pageNumbers){
		super(bookName, pageNumbers);
		this.paperQuality = paperQuality;
	}

	public void setPaperQuality (String newPaperQuality){
		paperQuality = newPaperQuality;
	}
	
	public String getPaperQuality(){
		System.out.println("asta e tipul de hartie");
		return paperQuality;
	}
	
	public static void  addAlbum(){
		
		System.out.println("enter album title:");
		bookName = inputAlbum.nextLine();
		System.out.println("enter album number of pages:");
		pageNumbers = inputAlbum.nextInt();
		System.out.println("enter album quality of paper:");
		paperQuality = inputAlbum.nextLine();
		ArtAlbum album = new ArtAlbum(bookName,paperQuality,pageNumbers);
	}
	
	public static void listAlbum(){
		System.out.println("There are "+albumInventory + " albums");
	}

}