package _00_Dynamic_Integer_Array;

public class DynamicIntegerArray {
	private int[] num;

	public DynamicIntegerArray() {

		num = new int[0];
	}

	public void add(int v) {
		int[] temp = new int[num.length + 1];

		temp[temp.length - 1] = v;

		for (int i = 0; i < num.length; i++) {
			temp[i] = num[i];
		}
		num = temp;
	}

	
	public int get(int location) {
		

		return num[location];
	}

	
	public void set(int v, int location) {
		
		num[location] = v;
	}

	
	public void insert(int v, int location) {
		
		int[] temp = new int[num.length + 1];
		
		for (int i = 0; i < temp.length; i++) {
			if (i < location) {
				temp[i] = num[i];
			}
			if (i > location) {
				temp[i] = num[i - 1];
			}
			if (i == location) {
				temp[i] = v;
			}

		}
		num = temp;
		

	}

	public void remove(int location) {
		
		int[] temp = new int[num.length - 1];
		
		for (int i = 0; i < num.length; i++) {
			if (i < location) {
				temp[i] = num[i];
			}
			if (i > location) {
				temp[i - 1] = num[i];
			}

		}
		num = temp;
		
	}

	public int size() {
		return num.length;
	}

	public void clear() {
		num = new int[0];

	}

}
