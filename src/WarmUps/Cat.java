package WarmUps;

public class Cat {
	String name;

	public Cat(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o) {
		if(((Cat)o).name.equals(this.name)) {
		return true;
		}
		return false;
	}
		
}
