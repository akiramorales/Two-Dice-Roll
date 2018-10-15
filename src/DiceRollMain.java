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
		int counter = 0;
		Scanner in = new Scanner (System.in);
		
		/**while (die1.roll() != die2.roll())
		{
			int sum = die1.roll() + die2.roll();

			System.out.println("Value of die 1: " + die1.roll() + "\tValue of die 2: " + die2.roll() + "\tSum: " + sum );
			counter++;
		}
		System.out.println("Number of rolls to get doubles: " + counter);
		*/
		System.out.println("Input target sum of dice: ");
		int target = in.nextInt();
		in.nextLine();
		
		if (target <= 2 || target >=12)
		{
			System.out.println("Error- Input invalid, please enter a value from 2 to 12: ");
			target = in.nextInt();
		}
		else if (target >= 2 || target <=12)
		{
			while(target != (die1.roll() + die2.roll()))
			{
				int sum = die1.roll() + die2.roll();

				System.out.println("Value of die 1: " + die1.roll() + "\tValue of die 2: " + die2.roll() + "\tSum: " + sum );
				counter++;
			}
			System.out.println("Number of rolls to match target value: " + counter);
		}
	}

}
