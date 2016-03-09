import java.util.ArrayList;
import java.util.Scanner;
public class ArtAlbum extends Book{
	static Scanner inputAlbum = new Scanner(System.in);
	private static String paperQuality;
	static Book bookInventoryObject;
	static ArrayList<ArtAlbum> albumInventory;
	
	
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
		System.out.println("asta e tipul de hartie"); //sa pot testa daca merge, inca nu am apucat sa testez
		return paperQuality;
	}
	
	public static void  addAlbum(){
		// in mod cert am o problema si la novel si la albume, dupa ce adaug o data un obiect in array, cand mai adaug unul mi-l suprascrie si sare peste titlu
		albumInventory = new ArrayList<ArtAlbum>();
		System.out.println("enter album title:");
		bookName = inputAlbum.nextLine();
		System.out.println("enter album quality of paper:");
		paperQuality = inputAlbum.nextLine();
		System.out.println("enter album number of pages:");
		pageNumbers = inputAlbum.nextInt();
		//deocamdata lipseste verificarea pentru cazul in care in loc de int se introduce un string la numarul de pagini
		ArtAlbum album = new ArtAlbum(bookName,paperQuality,pageNumbers);
		albumInventory.add(album);
	}
	
	public static void listAlbum(){
		System.out.println("There are "+albumInventory + " albums");
		
	}
	
	//habar nu am ce face acest override dar altfel nu imi arata cum tb resultatul de la listNovel sau listAlbum
	 @Override
    public String toString(){
	return " Art Album title: " + bookName +" |"+ " Quality of Paper: " + paperQuality +" |"+ "  Number of Pages: " + pageNumbers;
	}

}