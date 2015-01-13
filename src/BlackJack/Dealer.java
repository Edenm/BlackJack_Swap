package BlackJack;
/////deler class 
public class Dealer extends GenericPlayer {

	public Dealer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//// at next itration 
	public void autoHit(){
	
		
	}
	
	public void startHand(Hand hand){
		
	}
	public boolean isGoodForSwap()
	{
		for(Card c :super.getAllCards())
			if(c.getNumber()==12&&c.getSuit()==4)
				return false;
		if(super.sum_cards==21)
			return false;
		return true;
		
	}
		
}
