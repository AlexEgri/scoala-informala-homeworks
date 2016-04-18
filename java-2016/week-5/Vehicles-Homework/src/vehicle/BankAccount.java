package vehicle;

public class BankAccount {
	private float bankAccount;
	private float moneyAmount;

	public BankAccount(float moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

	public float getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(float bankAccount) {
		this.bankAccount = bankAccount;
	}

	public float getMoneyAmount() {
		return moneyAmount;
	}

	public void setMoneyAmount(float moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

}
