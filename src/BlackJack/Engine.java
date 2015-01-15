package BlackJack;

import java.util.ArrayList;

///////////class Engine
public class Engine {
	
	public BlackJack Game = new BlackJack();
	public void Creategame(){
				Game.hand_round.initialize();
		Game.Deal();
	}

}
