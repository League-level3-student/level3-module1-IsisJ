package _06_Intro_To_Hash_Maps;

import java.util.HashMap;

public class _01_IntroToHashMaps {
	public static void main(String[] args) {
		HashMap<Integer, Double> numbers = new HashMap<>();
		for(int i = 0; i <500; i++) {
			numbers.put(i,Math.sqrt(i));
		}
//		for(int i = 0; i<numbers.size();i++) {
//			System.out.println("The square root of "+i+" is "+numbers.get(i));
//		}
		
		for(Integer i : numbers.keySet()){
			System.out.println("The square root of "+i+" is "+numbers.get(i));
		}
		
	}
}
