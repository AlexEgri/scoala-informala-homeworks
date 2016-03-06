import java.util.Scanner;
public class ArtAlbum extends Book{
	static Scanner inputAlbum = new Scanner(System.in);
	private static String paperQuality;
	
	public ArtAlbum(){
	}
	
	public ArtAlbum(String bookName, int pageNumbers){
		super(bookName, pageNumbers);
		this.paperQuality = paperQuality;
	}

	public void setPaperQuality (String newPaperQuality){
		paperQuality = newPaperQuality;
	}
	
	public String retrievePaperQuality(){
		System.out.println("asta e tipul de hartie");
		return paperQuality;
	}
	
	public static void  addAlbum(){
		ArtAlbum album = new ArtAlbum();
		System.out.println("enter album title:");
		bookName = inputAlbum.nextLine();
		System.out.println("enter album number of pages:");
		pageNumbers = inputAlbum.nextInt();
		System.out.println("enter album quality of paper:");
		paperQuality = inputAlbum.nextLine();
	}
	

}