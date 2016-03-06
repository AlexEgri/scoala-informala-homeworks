public class Novel extends Book{
	
	private String novelType;
	private Novel(String bookName, int pageNumbers){
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
}