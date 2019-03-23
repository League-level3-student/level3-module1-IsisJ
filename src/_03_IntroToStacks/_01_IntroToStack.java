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
		
		//randomDoubles.peek();
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		
		
		String userInput1 = JOptionPane.showInputDialog("Give me a number between 0 and 100");
		String userInput2 = JOptionPane.showInputDialog("Give me a second number between 0 and 100");

		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		
		
		
		//maybe find a way to put the between numbers in the right order...if that makes sense?
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		
		int userNumInput1 = Integer.parseInt(userInput1);
		int userNumInput2 = Integer.parseInt(userInput2);
		
		if(userNumInput1-userNumInput2 < 0) {
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
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
