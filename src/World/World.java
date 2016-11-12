package World;

import java.util.ArrayList;

public class World {
	private ArrayList<Continent> continents;
	private ArrayList<Card> cards;
	private ArrayList<Card> deck;
	
	public void addContinent(Continent c){
		continents.add(c);
	}
	public void removeContinent(Continent c){
		for(Continent A : continents){
			if(A.equals(c)){
				continents.remove(A);
				break;
			}
		}
	}
	public ArrayList<Continent> getContinents(){
		return continents;
	}
	public void addToCards(Card c){
		cards.add(c);
	}
	public void removeFromCards(Card c){
		for(Card A : cards){
			if(A.equals(c)){
				cards.remove(A);
				break;
			}
		}
	}
	public ArrayList<Card> getCards(){
		return cards;
	}
	public void addToDeck(Card c){
		deck.add(c);
	}
	public void removeFromDeck(Card c){
		for(Card A : deck){
			if(A.equals(c)){
				deck.remove(A);
				break;
			}
		}
	}
	public ArrayList<Card> getDeck(){
		return deck;
	}
	public void startGame(){
		
	}
	public boolean checkWinner(){
		return true;
	}
}
