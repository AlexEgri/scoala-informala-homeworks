package vehicle;

public class Logan extends Dacia {

	private int musicStoragecapacity;

	public Logan(float currentFuelAmmount, String chasseNumber) {
		super(currentFuelAmmount, chasseNumber);
		setCurrentFuelAmmount(currentFuelAmmount);
		setChasseNumber(chasseNumber);
	}

	public Logan() {
		// TODO Auto-generated constructor stub
	}

	public int getMusicStoragecapacity() {
		return musicStoragecapacity;
	}

	public void setMusicStoragecapacity(int musicStoragecapacity) {
		this.musicStoragecapacity = musicStoragecapacity;
	}

}
