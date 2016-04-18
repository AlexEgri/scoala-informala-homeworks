package vehicle;

public class Client {

	private String clientName;
	private BankAccount bankAccount;

	public Client(String clientName) {
		this.clientName = clientName;
	}

	public BankAccount getClientBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

}
