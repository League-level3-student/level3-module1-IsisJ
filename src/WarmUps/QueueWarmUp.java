package WarmUps;

import java.util.LinkedList;
import java.util.Queue;

public class QueueWarmUp {
	
	public static void main(String[] args) {

		Queue<String> candies = new LinkedList<>();
		candies.add("Jolly Ranchers");
		candies.add("Kit Kat");
		System.out.println(candies.peek());
		candies.add("Snickers");
		System.out.println(candies.peek());
		System.out.println(candies.poll());
		System.out.println(candies.peek());
		candies.poll();
		System.out.println(candies.peek());
		
		
		
	}
}
