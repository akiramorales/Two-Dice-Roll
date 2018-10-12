/**
 * 
 * @author Akira Morales
 * 
 */
public class DiceRollMain {

	public static void main(String[] args)
	{

		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int rollVal1;
		int rollVal2;
		
		
		while (die1!=die2)
		{
			die1.roll();
			die2.roll();
			
		}

	}

}
