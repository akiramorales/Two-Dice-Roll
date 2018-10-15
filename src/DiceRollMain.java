/**
 * 
 * @author Akira Morales
 * 
 */
import java.util.Scanner;
public class DiceRollMain {

	public static void main(String[] args)
	{

		Dice die1 = new Dice();
		Dice die2 = new Dice();
		Scanner in = new Scanner (System.in);
		int roll1 = die1.roll();
		int roll2 = die2.roll();
		int counter = 1;
		
		System.out.println("Value of die 1: " + roll1 + "\tValue of die 2: " + roll2);
		
		while (roll1 != roll2)
		{
			roll1 = die1.roll();
			roll2 = die2.roll();
			System.out.println("Value of die 1: " + roll1 + "\tValue of die 2: " + roll2);
			counter++;		
		}
		
		System.out.println("Number of rolls to get doubles: " + counter);
		
		System.out.println("Input target sum of dice: ");
		int target = in.nextInt();
		in.nextLine();
		
		while (target <= 2 || target >=12)
		{
			System.out.println("Error- Input invalid, please enter a value from 2 to 12: ");
			in.nextInt();
			in.nextLine();
		}

		while(target != (roll1 + roll2))
		{
			roll1 = die1.roll();
			roll2 = die2.roll();
			int sum = roll1 + roll2;

			System.out.println("Value of die 1: " + roll1 + "\tValue of die 2: " + roll2 + "\tSum: " + sum );
			counter++;
		}
		System.out.println("Number of rolls to match target value: " + counter);
		
	}

}
