package GuestBook;

public class RegularGuest implements Guest {
	
	private String name;

	public RegularGuest(String name) {
		this.name = name;
		
	}
	
	
	public String getListing() {
		
		return name;
	}


}
