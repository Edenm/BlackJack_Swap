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
		System.out.println("IN");
		
		int blackCounter=0;
		int redCounter=0;
		
			for(Card c : GenericPlayer.p_cards)
			{
			
			
				if(c!=null&&c.src!=null)
					if(c.color==Color.Black)
						blackCounter++;
					else
						redCounter++;
			}
		if(redCounter>=3 || blackCounter>=3)
		{
			System.out.println("red : " +redCounter);
			System.out.println("black : " +blackCounter);
			return true;
		}
		return false;
	}
	}

