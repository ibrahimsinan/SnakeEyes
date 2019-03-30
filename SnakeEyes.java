import java.util.Random;

public class SnakeEyes {

	public static void main(String[] args) {
		
		int die1, die2;
		int attempts = 0;
		
		Random generator = new Random();
		
		do {
			die1 = generator.nextInt(5) + 1;
			die2 = generator.nextInt(5) + 1;
			attempts++;
		} while (die1 != die2);
		
		System.out.println("It took " + attempts + " attempts to get the same number");
		System.out.print("Die 1: " + die1);
		System.out.print("   Die 2: " + die2);
	}

}
