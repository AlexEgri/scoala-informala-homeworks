package ro.sci.bookstore;


public class Customer {
	private String customerName;
	private String customerEmail;
	private Cart customerCart;
	private Address adress;
	
	public Customer (String customerName,String customerEmail,Cart customerCart,Address adress){
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerCart = customerCart;
		this.adress = adress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Cart getCustomerCart() {
		return customerCart;
	}

	public void setCustomerCart(Cart customerCart) {
		this.customerCart = customerCart;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}
}
