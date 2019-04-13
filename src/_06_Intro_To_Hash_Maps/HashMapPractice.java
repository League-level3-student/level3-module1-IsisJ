package _06_Intro_To_Hash_Maps;

import java.util.HashMap;

public class HashMapPractice {
	public static void main(String[] args) {
		HashMap<String, Integer> classMates = new HashMap<>();
		classMates.put("Esme", 16 );
		System.out.println(classMates.get("Esme"));
		System.out.println(classMates.get("John"));
	}

}
