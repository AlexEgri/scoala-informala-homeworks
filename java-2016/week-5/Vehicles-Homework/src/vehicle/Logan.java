package vehicle;

public class Logan extends Dacia {

	private int musicStoragecapacity;

	public Logan(String chasseNumber,int currentFuelAmmount ) {
		super(chasseNumber, currentFuelAmmount );
	//	setCurrentFuelAmmount(currentFuelAmmount);
		//setChasseNumber(chasseNumber);
	}

	

	public int getMusicStoragecapacity() {
		return musicStoragecapacity;
	}

	public void setMusicStoragecapacity(int musicStoragecapacity) {
		this.musicStoragecapacity = musicStoragecapacity;
	}

}
