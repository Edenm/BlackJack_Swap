package BlackJack;
//the black jack game 
public class BlackJack {
	public Player player;
	public Dealer dealer;
	public Hand hand_round;
	
	////deal start a hand to player and deler
	public void Deal(){
		player.startHand(hand_round);
		dealer.startHand(hand_round);	
		ClearCards();
		System.out.println("new game");
		
	}

/////new game ///////////////////////////////////////////
	public BlackJack() {
		super();
		 player = new Player("Max");
		 dealer =  new Dealer("Dealer");
		 hand_round = new Hand();
	}
	
	private void ClearCards()
	{
		for(int i=0;i<5;i++)
		{
			GenericPlayer.p_cards[i] =new Card();
			GenericPlayer.p_cardsDealer[i] =new Card();
		}
	}


}
