package BlackJack;



import gui.mainvvd;

public class GenericPlayer {
		public static  Card[] p_cards;
		public static  Card[] p_cardsDealer;
		public Integer sum_cards;
		public String name;
		private int currect_cards;
		public int ace_value=0;
		public int score;
		public int scoreBet;
		public GenericPlayer(String name) {
			super();
			this.name=name;
			p_cards = new Card[5];
			 p_cardsDealer=new Card[5];
			for(int i=0;p_cards.length<5;i++){
				System.out.println("4444");
				p_cards[i] =new Card();
				 p_cardsDealer[i]=new Card();
			}
			this.setSum_cards(0);
			this.setCurrect_cards(0);
			this.score=100;
			this.scoreBet=0;
			
		}
		public int getSum_cards() {
			return sum_cards;
		}
		public void setSum_cards(int sum_cards) {
			this.sum_cards = sum_cards;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCurrect_cards() {
			return currect_cards;
		}
		public void setCurrect_cards(int currect_cards) {
			this.currect_cards = currect_cards;
		}
		///hit mithod he hit for the plaer and the deler a card and the value abd update the sum card and the count of card to player
		public String Hit(){
			System.out.println();
			Card tmp1 = new Card();
			tmp1 = mainvvd.engine.Game.hand_round.getCard();
			System.out.println(tmp1.src);
			String CardName = new String();
			CardName = tmp1.getSrc();
					
			if(this.name=="Dealer"){	
					if(tmp1.getNumber()==1){
						if(this.sum_cards+11>21)
							this.ace_value=1;
							
						else
							this.ace_value=11;
					}
					
					this.currect_cards ++;
					
					if(tmp1.getNumber()==1){
						
						
							this.sum_cards+=this.ace_value;
																	
					}
					else if(tmp1.getNumber()>9){
							this.sum_cards+=10;
						}
					else this.sum_cards += tmp1.getNumber();
					
					if(this.sum_cards>21){
							if(this.ace_value==11){
								this.sum_cards-=this.ace_value;
								this.ace_value=1;
								this.sum_cards+=this.ace_value;
					}
					}
		
			}else{
				if((tmp1.getNumber()==1)){
					this.ace_value++;
					if(this.ace_value==1)
						this.sum_cards+=11;
					else
						this.ace_value+=1;
				}
				else if(tmp1.getNumber()>9){
					this.sum_cards+=10;
				}
				else this.sum_cards += tmp1.getNumber();
				if(this.name!="Dealer")
					addCard(tmp1);
				else
					addCardDealer(tmp1);
				this.currect_cards ++;	
				

			}
			
		
			
				
			
			return CardName=tmp1.getSrc();
			
		
		}
		////////aadd card 
		
		public void addCard(Card card){
			this.p_cards[this.currect_cards] = card;
			//this.currect_cards++;
			//TODO STOP at 5 CARDS
		}
		public void addCardDealer(Card card){
			p_cardsDealer[this.currect_cards] = card;
			//this.currect_cards++;
			//TODO STOP at 5 CARDS
		}
		public boolean IsBusted(){
			
			if(this.getSum_cards()>21){
			return true;
			}
			else {
			return false;
			}
				
		}
		public Card[] getAllCards()
		{
			return p_cards;
		}
		
		
		
		
}
