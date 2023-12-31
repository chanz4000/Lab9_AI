package game_nim_student;

import java.util.Arrays;
import java.util.List;

public class TestNode {
	public static void main(String[] args) {
		Node node = new Node();
		MinimaxAlgo algo = new MinimaxAlgo();
		
		Integer[] data = { 7 };
		node.addAll(Arrays.asList(data));
		System.out.println("Numbers of tokens = 7");
		System.out.print("Value = ");
		algo.execute(node);
		System.out.println("Best next move for MIN: " + node.getBestNextMove());
		System.out.println("——————————————————————————————————");
		
		Integer[] data1 = { 9 };
		node.addAll(Arrays.asList(data1));
		System.out.println("Numbers of tokens = 9");
		System.out.print("Value = ");
		algo.execute(node);
		System.out.println("Best next move for MIN: " + node.getBestNextMove());
		System.out.println("——————————————————————————————————");

		Integer[] data2 = { 5 };
		node.addAll(Arrays.asList(data2));
		System.out.println("Numbers of tokens = 5");
		System.out.print("Value = ");
		algo.execute(node);
		System.out.println("Best next move for MIN: " + node.getBestNextMove());
	}
}
