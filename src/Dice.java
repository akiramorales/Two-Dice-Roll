public class Dice
{

	private int rollCount;
	
	public Dice()
	{
		rollCount = 0;
	}
	
	public int roll()
	{		
		rollCount++;
		
		return (int)(Math.random()*6+1);
		
	}
	
	public int numRoll()
	{
		return rollCount;
	}
	
	public void reset()
	{
		rollCount = 0;
	}
}
