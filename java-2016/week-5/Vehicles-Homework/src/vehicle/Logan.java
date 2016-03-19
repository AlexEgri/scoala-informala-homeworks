package vehicle;

public class Logan extends Dacia {

	private int musicStorageCapacity;

	public Logan(String chasseNumber, int currentFuelAmmount) {
		super(chasseNumber, currentFuelAmmount);

	}

	public Logan(String chasseNumber, int currentFuelAmmount, int musicStorageCapacity) {
		super(chasseNumber, currentFuelAmmount);
		this.musicStorageCapacity = musicStorageCapacity;
	}

	public int getMusicStoragecapacity() {
		return musicStorageCapacity;
	}

	public void setMusicStoragecapacity(int musicStoragecapacity) {
		this.musicStorageCapacity = musicStoragecapacity;
	}

}
