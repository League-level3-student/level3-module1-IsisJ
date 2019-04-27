package WarmUps;

public class ArrayList_ToArray {
	public static void main(String[] args) {
		int ages[] = new int [3];
		ages[0] = 2;
		ages[1] = 3;
		ages[2] = 7;
		ages[0] = 19;
		int total = 0;
		for(int i = 0; i<ages.length; i++) {
			total+= ages[i];
		}
		float average = (float)(total/ages.length);
		System.out.println("average:" + average);
	}
}
