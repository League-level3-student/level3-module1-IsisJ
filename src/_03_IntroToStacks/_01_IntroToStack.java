package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
	
		Stack<Double> randomDoubles = new Stack<Double>();
		int smallerNum;
		int biggestNum;
		int randomDoublesSize = 100;
		
		for(int i = 0; i< randomDoublesSize; i++) {
			Random random = new Random();
			Double ranNum = random.nextDouble()*100;
			randomDoubles.push(ranNum);
		}
		
		String userInput1 = JOptionPane.showInputDialog("Give me a number between 0 and 100");
		String userInput2 = JOptionPane.showInputDialog("Give me a second number between 0 and 100");
		
		int userNumInput1 = Integer.parseInt(userInput1);
		int userNumInput2 = Integer.parseInt(userInput2);
		
		if(userNumInput1 < userNumInput2) {
			smallerNum = userNumInput1;
			biggestNum = userNumInput2;
		}else {
			smallerNum = userNumInput2;
			biggestNum = userNumInput1;
		}
		
		System.out.println("Popping elements between " +smallerNum+" and "+biggestNum+" off the stack:");
		
		while(!randomDoubles.empty()) {
			double beingPopped = randomDoubles.pop();
			if(beingPopped > smallerNum && beingPopped < biggestNum) {
				System.out.println(beingPopped);
			}
		}
	}
}
