public class Novel extends Book{
	public string novelType;

	public Novel (string novelType, int pageNumbers, string bookName){
			super(bookName, pageNumbers);
			this.novelType = novelType;
	}
	
	public void setNovelType (String newNovelType){
		this.NovelType = newNovelType;
	}
	public void getNovelType (){
		return NovelType;
	}
}
