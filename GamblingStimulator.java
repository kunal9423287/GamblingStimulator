package Workshop;

public class GamblingStimulator {

	public static void main(String[] args) {
	//gambler's stack as 100$ and 1$ bet
		int  stake=100;
		final int bet =1;
		
		
		
		
		//Gambler is wining or loosing
	double betting =Math.floor(Math.random()*100)%2;
	
	if (betting==bet) {
		stake++;
		System.out.println("Gambler is win 1$");
		System.out.println("stakes "+stake);
		
	}
	else {
		stake--;
		System.out.println("gambler is loosing");
		System.out.println("stakes "+stake);
	}
	
	
	
	
	
	
	}

}
