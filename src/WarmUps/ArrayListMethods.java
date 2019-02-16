package WarmUps;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		System.out.println(nums.contains(3));
		System.out.println(nums.contains(2));
	
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Strawberry");
		fruits.add("Kiwi");
		System.out.println(fruits.indexOf("Kiwi"));
		System.out.println(fruits.indexOf("apple"));
		
		ArrayList<Cat> catList = new ArrayList<>();
		catList.add(new Cat("Kit"));
		catList.add(new Cat("Whiskers"));
		catList.add(new Cat("Kit"));
		System.out.println(catList.remove(new Cat("Kit")));
		
	}

}
