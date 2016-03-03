public class ArtAlbum extends Book {
	private string paperQuality;
	
	public ArtAlbum(String paperQuality, String bookName, int pageNumbers){
	
		super(pageNumbers, bookName);
		this.paperQuality = paperQuality;
	}
	
	public void setPaperQuality (String newPaperQuality){
		this.paperQuality = newPaperQuality;
	}
	
	public void getPaperQuality (){
		return paperQuality;
	}
}