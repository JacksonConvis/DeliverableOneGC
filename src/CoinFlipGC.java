import java.util.Random;
import java.util.Scanner;

public class CoinFlipGC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin, numberOfFlips, headcount = 0, tailcount = 0, correctCount;
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Guess which side will appear more: heads or tails?");
		String headsOrTailsGuess = scan.next();
		 
		System.out.println("How many times do you want to flip the coin?");
		numberOfFlips = scan.nextInt();
		
		if(numberOfFlips <= 0)
{
			System.out.println("Must flip coin more than once");
}
		else
{ 
			for (int i = 0; i < numberOfFlips; i++)
{		
			coin = rand.nextInt(2);
		  if(coin == 0)
{ 
			  System.out.println ("heads");
			  headcount++;
}
		  else
{
			  System.out.println("tails");
			  tailcount++;
}
}
			 if (headsOrTailsGuess.equals("tails")); {	 
					 correctCount = tailcount;}
			 if (headsOrTailsGuess.equals("heads")); {
				 correctCount = headcount;} 
							
			System.out.println("your guess was " + headsOrTailsGuess + " which came up " + correctCount + " times"  );
			System.out.println("Heads percentage: " + headcount * 100.0 / numberOfFlips + "%" );
			System.out.println("Tails percentage: " + tailcount * 100.0 / numberOfFlips + "%" );
			
			
}
}
}
			  
