package coinflip;
import java.util.Random;


public class Coin {
	private enum CoinType {
		Heads, Tails
	};

	Random randomNum = new Random();
	private int result;
	private int heads = 0;
	private int tails = 1;
	CoinType coinFlip;

	public void flip(){
	    result = randomNum.nextInt(2);
	    if(result == 0){
	        coinFlip = CoinType.Heads;
	        System.out.println("You flipped Heads!");
	    }
	    else{
	        coinFlip = CoinType.Tails;
	        System.out.println("You flipped Tails!");
	    }

	}
}
