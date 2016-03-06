public class ArtAlbum extends Book{
	private String paperQuality;
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
}