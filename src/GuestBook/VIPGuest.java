package GuestBook;

public class VIPGuest implements Guest {

	private String name;

	public VIPGuest(String name) {
		this.name = name;
	}

	public String getListing() {
		return "VIP: " + name;
	}

	public String toString() {
		return name;
	}
}
