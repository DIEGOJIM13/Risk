package World;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

import Player.*;
import Window.WindowMain;

public class GameState {
	private Player currPlayer;
	private Group allPlayers;
	private int currPhase; // 0 beggining, 1 attack, 2 move
	private World world;
	private Clip music;
	private Country country1;
	private Country country2;
	private WindowMain win;
	
	public GameState(WindowMain win) {
		this.win = win;
		this.currPlayer = null;  // will set this at the beggining of the turn
		this.allPlayers = new Group();
		this.currPhase = 0;
		this.world = new World(); // creating the world
		this.music = null;
	}
	
	public WindowMain getWindow() {
		return this.win;
	}
	public String toString() {
		String retString = "Players playing: \n";
		for(Player p : this.allPlayers.getPlayers()) {
			retString += p.getName() + "\n";
		}
		return retString +"\nWorld Info:\n" + world.toString(); // will have other ones but right now just the string
	}
	
	public void gameStart() { // will start the game setting player 1 as the current player
		this.currPhase = 0;
		this.currPlayer = this.allPlayers.getPlayers().get(0);
		this.world.startGame(this.allPlayers); // will deal out the cards and initialize countries
		this.updateCountryLabels();
	}
	
	public void updateCountryLabels() {
		for(Continent con : this.world.getContinents()) {
			for(Country cou : con.getCountries()) {
				cou.getButton().updateLabel(cou.getPlayer());
			}
		}
	}
	
	public Player getCurrPlayer() {
		return this.currPlayer;
	}
	
	public Group getAllPlayers() {
		return this.allPlayers;
	}
	
	public int getCurrPhase() {
		return this.currPhase;
	}
	
	public World getWorld() {
		return this.world;
	}
	
	public void setCurrPlayer(Player p1) {
		this.currPlayer = p1;
	}
	
	public void addPlayer(Player p1) {
		this.allPlayers.addPlayer(p1);
	}
	
	public void setCurrPhase(int p) {
		this.currPhase = p;
	}
	
	public Player checkWinner() {
		boolean won = false;
		if (this.allPlayers.getPlayers().size() == 1) { // if there is only one player they already win
			return this.allPlayers.getPlayers().get(0);
		}
		for(Player p : this.allPlayers.getPlayers()) {
			won = this.world.checkIfWorldOwned(p);
			if(won) {
				return p;
			}
		}
		return null;
	}
	
	public void setNextPlayer() {
		int currPlayerIndex = this.getAllPlayers().getPlayers().indexOf(this.currPlayer);
		this.currPlayer = this.getAllPlayers().getPlayers().get((currPlayerIndex + 1) % this.getAllPlayers().getPlayers().size());
	}
	
	public void playSound(String filename) {
	    try{
	      // from a wave File
	      File soundFile = new File(filename);
	      AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
	      this.music = AudioSystem.getClip();
	      this.music.open(audioIn);
	      this.music.start();
	    }
	    catch (UnsupportedAudioFileException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    } catch (LineUnavailableException e) {
	      e.printStackTrace();
	    }

	}
	
	public void stopCurrentSound() {
		this.music.close();
	}

	public Country getCountry1() {
		return country1;
	}

	public void setCountry1(Country country1) {
		this.country1 = country1;
	}

	public Country getCountry2() {
		return country2;
	}

	public void setCountry2(Country country2) {
		this.country2 = country2;
	}
	
	
	
}
