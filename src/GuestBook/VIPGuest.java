package GuestBook;

public class VIPGuest implements Guest {
	
	private String name;
	
	public VIPGuest (String name) {
		this.name = "VIP: " + name;
	}
	
	
	public String getListing() {
		return name;
	}
	
	public String toString() {
		return name;
	}
}
