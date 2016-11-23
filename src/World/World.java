package World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import Player.*;

public class World {
	private ArrayList<Continent> continents;
	private ArrayList<Card> cards;
	private ArrayList<Card> deck;
	
	
	public World() { 
		/*
		 Hardcoded countries, cards, and continent. Will hopefully be able to programatically
		 read this from json file but in case we don't have time to design that just making
		 this. 
		 */
		this.continents = new ArrayList<Continent>();
		this.deck = new ArrayList<Card>();
		Continent NorthAmerica = new Continent("Yellow", "North America", 5, this); // intializing NorthAmerica
		Country Alaska = new Country("Alaska");
		Country NorthWestTerritory = new Country("North West Territory");
		Country Greenland = new Country("Greenland");
		Country Alberta = new Country("Alberta");
		Country Ontario = new Country("Ontario");
		Country Quebec = new Country("Quebec");
		Country WesternUnitedStates = new Country("Western United States");
		Country EasternUnitedStates = new Country("Eastern United States");
		Country CentralAmerica = new Country("Central America");
		NorthAmerica.addCountry(Alaska);
		NorthAmerica.addCountry(Greenland);
		NorthAmerica.addCountry(Alberta);
		NorthAmerica.addCountry(Ontario);
		NorthAmerica.addCountry(Quebec);
		NorthAmerica.addCountry(WesternUnitedStates);
		NorthAmerica.addCountry(EasternUnitedStates);
		NorthAmerica.addCountry(CentralAmerica);
		NorthAmerica.addCountry(NorthWestTerritory);

		
		Continent SouthAmerica = new Continent("Brown", "South America", 2, this);
		Country Venezuela = new Country("Venezuela");
		Country Peru = new Country("Peru");
		Country Argentina = new Country("Argentina");
		Country Brazil = new Country("Brazil");
		SouthAmerica.addCountry(Venezuela);
		SouthAmerica.addCountry(Peru);
		SouthAmerica.addCountry(Argentina);
		SouthAmerica.addCountry(Brazil);
		
		Continent Africa = new Continent("Gray", "Africa", 5, this);
		Country NorthAfrica = new Country("North Africa");
		Country Egypt = new Country("Egypt");
		Country EastAfrica = new Country("East Africa");
		Country Congo = new Country("Congo");
		Country SouthAfrica = new Country("South Africa");
		Country Madagascar = new Country("Madagascar");
		
		Africa.addCountry(NorthAfrica);
		Africa.addCountry(Egypt);
		Africa.addCountry(EastAfrica);
		Africa.addCountry(Congo);
		Africa.addCountry(SouthAfrica);
		Africa.addCountry(Madagascar);
		
		Continent Europe = new Continent("Blue", "Europe", 5, this);
		Country Iceland = new Country("Iceland");
		Country GreatBritain = new Country("Great Britain");
		Country WesternEurope = new Country("Western Europe");
		Country NorthernEurope = new Country("Northern Europe");
		Country Scandinavia = new Country("Scandinavia");
		Country Ukraine = new Country("Ukraine");
		Country SouthernEurope = new Country("Southern Europe");
		Europe.addCountry(Iceland);
		Europe.addCountry(GreatBritain);
		Europe.addCountry(WesternEurope);
		Europe.addCountry(NorthernEurope);
		Europe.addCountry(Scandinavia);
		Europe.addCountry(Ukraine);
		Europe.addCountry(SouthernEurope);
		
		Continent Asia = new Continent("Green", "Asia", 7, this);
		Country Ural = new Country("Ural");
		Country Afghanistan = new Country("Afghanistan");
		Country MiddleEast = new Country("Middle East");
		Country India = new Country("India");
		Country Siam = new Country("Siam");
		Country China = new Country("China");
		Country Siberia = new Country("Siberia");
		Country Mongolia = new Country("Mongolia");
		Country Irkutsk = new Country("Irkutsk");
		Country Yakutsk = new Country("Yakutsk");
		Country Kamchatka = new Country("Kamchatka");
		Country Japan = new Country("Japan");
		Asia.addCountry(Ural);
		Asia.addCountry(Afghanistan);
		Asia.addCountry(MiddleEast);
		Asia.addCountry(India);
		Asia.addCountry(Siam);
		Asia.addCountry(China);
		Asia.addCountry(Siberia);
		Asia.addCountry(Mongolia);
		Asia.addCountry(Irkutsk);
		Asia.addCountry(Yakutsk);
		Asia.addCountry(Kamchatka);
		Asia.addCountry(Japan);
		
		Continent Australia = new Continent("Europe", "Australia", 2, this);
		Country WesternAustralia = new Country("Western Australia");
		Country Indonesia = new Country("Indonesia");
		Country EasternAustralia = new Country("Eastern Australia");
		Country NewGuinea = new Country("New Guinea");
		Australia.addCountry(WesternAustralia);
		Australia.addCountry(Indonesia);
		Australia.addCountry(EasternAustralia);
		Australia.addCountry(NewGuinea);
		
		this.continents.add(NorthAmerica);
		this.continents.add(SouthAmerica);
		this.continents.add(Africa);
		this.continents.add(Europe);
		this.continents.add(Asia);
		this.continents.add(Australia);
		
		Alaska.addBorderingCountry(Kamchatka); // borders for North America
		Alaska.addBorderingCountry(NorthWestTerritory);
		Alaska.addBorderingCountry(Alberta);
		NorthWestTerritory.addBorderingCountry(Alberta);
		NorthWestTerritory.addBorderingCountry(Ontario);
		NorthWestTerritory.addBorderingCountry(Greenland);
		Alberta.addBorderingCountry(Ontario);
		Alberta.addBorderingCountry(WesternUnitedStates);
		Ontario.addBorderingCountry(Greenland);
		Ontario.addBorderingCountry(Quebec);
		Ontario.addBorderingCountry(WesternUnitedStates);
		Ontario.addBorderingCountry(EasternUnitedStates);
		Quebec.addBorderingCountry(Greenland);
		Quebec.addBorderingCountry(EasternUnitedStates);
		EasternUnitedStates.addBorderingCountry(WesternUnitedStates);
		EasternUnitedStates.addBorderingCountry(CentralAmerica);
		WesternUnitedStates.addBorderingCountry(CentralAmerica);
		Greenland.addBorderingCountry(Iceland);
		CentralAmerica.addBorderingCountry(Venezuela);
		
		Venezuela.addBorderingCountry(Brazil); // south america borders
		Venezuela.addBorderingCountry(Peru);
		Peru.addBorderingCountry(Brazil);
		Peru.addBorderingCountry(Argentina);
		Brazil.addBorderingCountry(Argentina);
		Brazil.addBorderingCountry(NorthAfrica);
		
		Madagascar.addBorderingCountry(SouthAfrica); // africa borders
		Madagascar.addBorderingCountry(EastAfrica);
		Congo.addBorderingCountry(SouthAfrica);
		EastAfrica.addBorderingCountry(Congo);
		EastAfrica.addBorderingCountry(MiddleEast);
		Egypt.addBorderingCountry(MiddleEast);
		Egypt.addBorderingCountry(EastAfrica);
		Egypt.addBorderingCountry(SouthernEurope);
		NorthAfrica.addBorderingCountry(Egypt);
		NorthAfrica.addBorderingCountry(Congo);
		NorthAfrica.addBorderingCountry(EastAfrica);
		NorthAfrica.addBorderingCountry(WesternEurope);
		
		Iceland.addBorderingCountry(GreatBritain);
		Iceland.addBorderingCountry(Scandinavia);
		GreatBritain.addBorderingCountry(WesternEurope);
		GreatBritain.addBorderingCountry(NorthernEurope);
		GreatBritain.addBorderingCountry(Scandinavia);
		WesternEurope.addBorderingCountry(SouthernEurope);
		WesternEurope.addBorderingCountry(NorthernEurope);
		Scandinavia.addBorderingCountry(NorthernEurope);
		Scandinavia.addBorderingCountry(Ukraine);
		Ukraine.addBorderingCountry(NorthernEurope);
		Ukraine.addBorderingCountry(Ural);
		Ukraine.addBorderingCountry(Afghanistan);
		Ukraine.addBorderingCountry(MiddleEast);
		SouthernEurope.addBorderingCountry(NorthernEurope);
		SouthernEurope.addBorderingCountry(Ukraine);
		SouthernEurope.addBorderingCountry(MiddleEast);
		
		MiddleEast.addBorderingCountry(Afghanistan);
		MiddleEast.addBorderingCountry(India);
		Afghanistan.addBorderingCountry(India);
		Afghanistan.addBorderingCountry(China);
		Afghanistan.addBorderingCountry(Ural);
		Ural.addBorderingCountry(China);
		Ural.addBorderingCountry(Siberia);
		China.addBorderingCountry(Siam);
		China.addBorderingCountry(India);
		China.addBorderingCountry(Siberia);
		China.addBorderingCountry(Mongolia);
		India.addBorderingCountry(Siam);
		Siam.addBorderingCountry(Indonesia);
		Mongolia.addBorderingCountry(Siberia);
		Mongolia.addBorderingCountry(Japan);
		Mongolia.addBorderingCountry(Irkutsk);
		Mongolia.addBorderingCountry(Kamchatka);
		Irkutsk.addBorderingCountry(Siberia);
		Irkutsk.addBorderingCountry(Yakutsk);
		Irkutsk.addBorderingCountry(Kamchatka);
		Kamchatka.addBorderingCountry(Japan);
		
		Indonesia.addBorderingCountry(WesternAustralia);
		Indonesia.addBorderingCountry(NewGuinea);
		Indonesia.addBorderingCountry(EasternAustralia);
		NewGuinea.addBorderingCountry(EasternAustralia);
		NewGuinea.addBorderingCountry(WesternAustralia);
		WesternAustralia.addBorderingCountry(EasternAustralia);
	}
	
	public String toString() {
		String retString = "";
		for(Continent c : this.continents) {
			retString += c.toString();
		}
		return retString;
	}
	
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
	public void startGame(Group players){
		int count = 0;
		/*
		 Creating a card for every country, giving it a country and a star amount from 1 - 3
		 */
		for(Continent con : this.continents) {
			for(Country cou : con.getCountries()) {
				Card tempCard = new Card(cou, (count % 3) + 1);
				this.deck.add(tempCard);
				count++;
			}
		}
		
		/*
		 Shuffling the deck and then giving each player a card unit there are no cards left.
		 */
		this.shuffleDeck();
		for(int i = 0; i < this.deck.size(); i++) { 
			players.getPlayers().get(i % players.getPlayers().size()).getHand().add(this.deck.get(i));
		}
		
		/*
		 Iterating through the player's hands and assigning them the country
		 Still need to add giving the troops equal to the number of stars
		 to that country.
		 */
		for(Player p : players.getPlayers()) {
			for(Card c : p.getHand()) {
				c.getCountry().setPlayer(p);
				c.getCountry().addInfrantry(c.getNumStars());
				p.addInfrantry(c.getNumStars());
				p.addCountry(c.getCountry());
			}
			p.getHand().clear(); // putting it back in the deck
		}
	}
	public boolean checkIfWorldOwned(Player p){
		for(Continent con : this.continents) {
			for(Country cou : con.getCountries()) {
				if(cou.getPlayer() == p) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public void shuffleDeck() {
		long seed = System.nanoTime(); // shuffling
		Collections.shuffle(this.deck, new Random(seed));
	}
}
