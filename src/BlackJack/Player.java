package BlackJack;

public class Player extends GenericPlayer {
	
	
	
	public Player(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void stand(){
		//TODO	
	} 	
	
	public void startHand(Hand hand){ 
	}
	
	public boolean sameColors()
	{
		int blackCounter=0;
		int redCounter=0;
		
		for(Card c : super.getAllCards())
		{
			if(c.color==Color.Black)
				blackCounter++;
			else
				redCounter++;
		}
		if(redCounter>=3 || blackCounter>=3)
			return true;
		return false;
	}
}
