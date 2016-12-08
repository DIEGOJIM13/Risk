package Window;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.border.LineBorder;

import Army.Troop;
import Player.Player;
import World.*;

import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JSplitPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Scrollbar;
import javax.swing.JButton;
import java.awt.Component;

public class WindowMain {

	private JFrame frame1;
	private JPanel cards;
	private JTextField player1TextField;
	private JTextField player2TextField;
	private JTextField player3TextField;
	private JTextField player4TextField;
	private JTextField player5TextField;
	private GameState gameState;
	private int troopsLeft;
	private JLabel playerWonLabell;
	private CardLayout cardLayout;

	public WindowMain() throws IOException {
		gameState = new GameState(this);
		initialize();
	}

	private void initialize() throws IOException {
		frame1 = new JFrame();
		frame1.setResizable(false);
		gameState.playSound("music\\intro_music.wav");
		frame1.setTitle("Risk - The Game of Global Domination");
		frame1.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame1.setBounds(100, 100, 1200, 900);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		frame1.getContentPane().setLayout(new CardLayout(0, 0));
	
		cards = new JPanel(new CardLayout());
		cards.setBounds(100, 100, 1200, 900);
	
		cards.setVisible(true);
		JPanel mainScreen = new JPanel();
		JPanel playerSelect = new JPanel();
		JPanel map = new JPanel();
		map.setBackground(Color.LIGHT_GRAY);
		
		JPanel resultsScreen = new JPanel();
		cards.add(mainScreen, "Main Screen");
		cards.add(playerSelect, "Player Selection");
		cards.add(map, "Game");
		cards.add(resultsScreen, "Results");
		frame1.getContentPane().add(cards);
		
		mainScreen.setBackground(Color.LIGHT_GRAY);
		mainScreen.setLayout(null);
		//frame1.getContentPane().add(mainScreen, "name_21718623405784");
		
		this.cardLayout = (CardLayout) cards.getLayout();
		JPanel startGame = new JPanel();
		startGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(cards, "Player Selection");
				
			}
		});
		
		JPanel exitPanel = new JPanel();
		exitPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exitPanel.setBackground(Color.RED);
		exitPanel.setBounds(1130, 820, 50, 30);
		mainScreen.add(exitPanel);
		exitPanel.setLayout(null);
		
		JLabel exitLabel = new JLabel("Exit");
		exitLabel.setForeground(Color.WHITE);
		exitLabel.setHorizontalAlignment(SwingConstants.CENTER);
		exitLabel.setBounds(0, 0, 50, 30);
		exitPanel.add(exitLabel);
		startGame.setBackground(new Color(255, 0, 0));
		startGame.setBounds(451, 680, 317, 77);
		mainScreen.add(startGame);
		startGame.setLayout(null);
		
		JLabel labelStart = new JLabel("Start Game");
		labelStart.setForeground(new Color(255, 255, 255));
		labelStart.setFont(new Font("Tahoma", Font.PLAIN, 60));
		labelStart.setHorizontalAlignment(SwingConstants.CENTER);
		labelStart.setBounds(0, 0, 317, 77);
		startGame.add(labelStart);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1194, 860);
		mainScreen.add(label);
		label.setIcon(new ImageIcon("GimpFiles\\StartGame.png")); //This should work for you, let me know if it does not. -Diego
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(1168, 102, 26, 200);
		mainScreen.add(scrollbar);
		playerSelect.setBackground(Color.LIGHT_GRAY);
		//frame1.getContentPane().add(playerSelect, "UnknownPlyer");
		playerSelect.setLayout(null);
		JPanel playerQuestion = new JPanel();
		playerQuestion.setLayout(null);
		playerQuestion.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		playerQuestion.setBackground(Color.RED);
		playerQuestion.setBounds(200, 100, 800, 100);
		playerSelect.add(playerQuestion);
		
		JLabel label_2 = new JLabel("How many Players will be playing?");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 50));
		label_2.setBackground(Color.RED);
		label_2.setBounds(0, 0, 800, 100);
		playerQuestion.add(label_2);
		
		JPanel playerTwo = new JPanel();
		JPanel playerThree = new JPanel();
		JPanel playerFour = new JPanel();
		JPanel playerFive = new JPanel();
		JPanel playerOneText = new JPanel();
		playerOneText.setBackground(Color.CYAN);
		JPanel playerTwoText = new JPanel();
		playerTwoText.setBackground(Color.MAGENTA);
		JPanel playerThreeText = new JPanel();
		playerThreeText.setBackground(Color.GREEN);
		JPanel playerFourText = new JPanel();
		playerFourText.setBackground(Color.WHITE);
		JPanel playerFiveText = new JPanel();
		playerFiveText.setBackground(Color.YELLOW);
		playerOneText.setVisible(false);
		playerTwoText.setVisible(false);
		playerThreeText.setVisible(false);
		playerFourText.setVisible(false);
		playerFiveText.setVisible(false);
		
		playerTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				playerTwo.setBackground(Color.BLUE);
				playerThree.setBackground(Color.RED);
				playerFour.setBackground(Color.RED);
				playerFive.setBackground(Color.RED);
				playerOneText.setVisible(true);
				playerTwoText.setVisible(true);
				playerThreeText.setVisible(false);
				playerFourText.setVisible(false);
				playerFiveText.setVisible(false);
				
			}
		});
		playerThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				playerTwo.setBackground(Color.RED);
				playerThree.setBackground(Color.BLUE);
				playerFour.setBackground(Color.RED);
				playerFive.setBackground(Color.RED);
				playerOneText.setVisible(true);
				playerTwoText.setVisible(true);
				playerThreeText.setVisible(true);
				playerFourText.setVisible(false);
				playerFiveText.setVisible(false);
			}
		});
		playerFour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				playerTwo.setBackground(Color.RED);
				playerThree.setBackground(Color.RED);
				playerFour.setBackground(Color.BLUE);
				playerFive.setBackground(Color.RED);
				playerOneText.setVisible(true);
				playerTwoText.setVisible(true);
				playerThreeText.setVisible(true);
				playerFourText.setVisible(true);
				playerFiveText.setVisible(false);
			}
		});
		playerFive.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				playerTwo.setBackground(Color.RED);
				playerThree.setBackground(Color.RED);
				playerFour.setBackground(Color.RED);
				playerFive.setBackground(Color.BLUE);
				playerOneText.setVisible(true);
				playerTwoText.setVisible(true);
				playerThreeText.setVisible(true);
				playerFourText.setVisible(true);
				playerFiveText.setVisible(true);
			}
		});
		playerTwo.setLayout(null);
		playerTwo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		playerTwo.setBackground(Color.RED);
		playerTwo.setBounds(200, 300, 100, 100);
		playerSelect.add(playerTwo);
		
		JLabel playerTwoLabel = new JLabel("2");
		playerTwoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerTwoLabel.setForeground(Color.WHITE);
		playerTwoLabel.setFont(new Font("Dialog", Font.PLAIN, 50));
		playerTwoLabel.setBackground(new Color(0, 128, 128));
		playerTwoLabel.setBounds(0, 0, 100, 100);
		playerTwo.add(playerTwoLabel);
		
		
		playerThree.setLayout(null);
		playerThree.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		playerThree.setBackground(Color.RED);
		playerThree.setBounds(433, 300, 100, 100);
		playerSelect.add(playerThree);
		
		JLabel playerThreeLabel = new JLabel("3");
		playerThreeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerThreeLabel.setForeground(Color.WHITE);
		playerThreeLabel.setFont(new Font("Dialog", Font.PLAIN, 50));
		playerThreeLabel.setBackground(new Color(0, 128, 128));
		playerThreeLabel.setBounds(0, 0, 100, 100);
		playerThree.add(playerThreeLabel);
		
		
		playerFour.setLayout(null);
		playerFour.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		playerFour.setBackground(Color.RED);
		playerFour.setBounds(667, 300, 100, 100);
		playerSelect.add(playerFour);
		
		JLabel playerFourLabel = new JLabel("4");
		playerFourLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerFourLabel.setForeground(Color.WHITE);
		playerFourLabel.setFont(new Font("Dialog", Font.PLAIN, 50));
		playerFourLabel.setBackground(new Color(0, 128, 128));
		playerFourLabel.setBounds(0, 0, 100, 100);
		playerFour.add(playerFourLabel);
		
		
		playerFive.setLayout(null);
		playerFive.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		playerFive.setBackground(Color.RED);
		playerFive.setBounds(900, 300, 100, 100);
		playerSelect.add(playerFive);
		
		JLabel playerFiveLabel = new JLabel("5");
		playerFiveLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerFiveLabel.setForeground(Color.WHITE);
		playerFiveLabel.setFont(new Font("Dialog", Font.PLAIN, 50));
		playerFiveLabel.setBackground(new Color(0, 128, 128));
		playerFiveLabel.setBounds(0, 0, 100, 100);
		playerFive.add(playerFiveLabel);
		
		JPanel cancelPanel = new JPanel();
		cancelPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(cards, "Main Screen");
			}
		});
		cancelPanel.setLayout(null);
		cancelPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		cancelPanel.setBackground(Color.RED);
		cancelPanel.setBounds(700, 780, 200, 50);
		playerSelect.add(cancelPanel);
		
		JLabel cancelLabel = new JLabel("Cancel");
		cancelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cancelLabel.setForeground(Color.WHITE);
		cancelLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancelLabel.setBounds(0, 0, 200, 50);
		cancelPanel.add(cancelLabel);
		JPanel startGamePanel = new JPanel();
		
		JFormattedTextField player1Name = new JFormattedTextField();
		player1Name.setVisible(false);
		player1Name.setBackground(Color.GRAY);
		JFormattedTextField player2Name = new JFormattedTextField();
		player2Name.setVisible(false);
		JFormattedTextField player3Name = new JFormattedTextField();
		player3Name.setVisible(false);
		JFormattedTextField player4Name = new JFormattedTextField();
		player4Name.setVisible(false);
		JFormattedTextField player5Name = new JFormattedTextField();
		player5Name.setVisible(false);
		JLabel numberOfTroops = new JLabel("0");
		JLabel country1 = new JLabel((String) null);
		JLabel country2 = new JLabel((String) null);
		
		JButton cancelCountryButton = new JButton("Cancel\r\n");
		cancelCountryButton.setVisible(false);
		cancelCountryButton.setEnabled(false);
		cancelCountryButton.setBackground(Color.RED);
		cancelCountryButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancelCountryButton.setBounds(371, 775, 124, 60);
		map.add(cancelCountryButton);
		
		cancelCountryButton.addActionListener(new ActionListener(){
	    	@Override
            public void actionPerformed(ActionEvent e) {
	    		gameState.setCountry1(null);
	    		gameState.setCountry2(null);
	    		country1.setText((String) null);
	    		country2.setText((String) null);
	    		cancelCountryButton.setEnabled(false);
	    		cancelCountryButton.setVisible(false);
	    	}
		});
		
		startGamePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(cards, "Game");
				gameState.stopCurrentSound();
				gameState.playSound("music\\introToMap.wav");
				//gameState.playSound("music\\Risk.wav");
				if(playerOneText.isVisible()) {
					Player p1 = new Player(player1TextField.getText(), Color.cyan, gameState);
					gameState.addPlayer(p1);
				}
				if(playerTwoText.isVisible()) {
					Player p2 = new Player(player2TextField.getText(), Color.magenta, gameState);
					gameState.addPlayer(p2);
				}
				if(playerThreeText.isVisible()) {
					Player p3 = new Player(player3TextField.getText(), Color.green, gameState);
					gameState.addPlayer(p3);
				}
				if(playerFourText.isVisible()) {
					Player p4 = new Player(player4TextField.getText(), Color.white, gameState);
					gameState.addPlayer(p4);
				}
				if(playerFiveText.isVisible()) {
					Player p5 = new Player(player5TextField.getText(), Color.yellow, gameState);
					gameState.addPlayer(p5);
				}
				gameState.gameStart();
				troopsLeft = gameState.getCurrPlayer().getBonus();
				numberOfTroops.setText(Integer.toString(troopsLeft));
				System.out.println(gameState.getAllPlayers().getPlayers().size());
				if (gameState.getAllPlayers().getPlayers().size() > 0){	//Display the 
					if (gameState.getAllPlayers().getPlayers().size() > 0) {
						player1Name.setText(gameState.getAllPlayers().getPlayers().get(0).getName());
						gameState.getAllPlayers().getPlayers().get(0).setPlayerTextName(player1Name);
						player1Name.setVisible(true);
						player1Name.setBackground(Color.GRAY);
					}
					if (gameState.getAllPlayers().getPlayers().size() > 1){
						player2Name.setText(gameState.getAllPlayers().getPlayers().get(1).getName());
						gameState.getAllPlayers().getPlayers().get(1).setPlayerTextName(player2Name);
						player2Name.setVisible(true);
					}
					if (gameState.getAllPlayers().getPlayers().size() > 2){
						player3Name.setText(gameState.getAllPlayers().getPlayers().get(2).getName());
						gameState.getAllPlayers().getPlayers().get(2).setPlayerTextName(player3Name);
						player3Name.setVisible(true);
					}
					if (gameState.getAllPlayers().getPlayers().size() > 3){
						player4Name.setText(gameState.getAllPlayers().getPlayers().get(3).getName());
						gameState.getAllPlayers().getPlayers().get(3).setPlayerTextName(player4Name);
						player4Name.setVisible(true);
					}
					if (gameState.getAllPlayers().getPlayers().size() > 4){
						player5Name.setText(gameState.getAllPlayers().getPlayers().get(4).getName());
						gameState.getAllPlayers().getPlayers().get(4).setPlayerTextName(player5Name);
						player5Name.setVisible(true);
					}
				}
				JOptionPane.showMessageDialog(null, "It is the beggining of " + gameState.getCurrPlayer().getName() + "'s turn!");

			}
		});
		
		
		startGamePanel.setLayout(null);
		startGamePanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		startGamePanel.setBackground(Color.RED);
		startGamePanel.setBounds(300, 780, 200, 50);
		playerSelect.add(startGamePanel);
		
		JLabel startGameLabel = new JLabel("Start Game!");
		startGameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		startGameLabel.setForeground(Color.WHITE);
		startGameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		startGameLabel.setBounds(0, 0, 200, 50);
		startGamePanel.add(startGameLabel);
		
		JPanel playerNamesPanel = new JPanel();
		playerNamesPanel.setBackground(Color.LIGHT_GRAY);
		playerNamesPanel.setBounds(200, 450, 800, 300);
		playerSelect.add(playerNamesPanel);
		playerNamesPanel.setLayout(null);
		

		playerOneText.setBounds(0, 0, 300, 80);
		playerOneText.setBorder(new LineBorder(new Color(0, 0, 0)));
		playerNamesPanel.add(playerOneText);
		
		JLabel player1Text = new JLabel("Name of Player 1:");
		player1Text.setFont(new Font("Tahoma", Font.PLAIN, 30));
		playerOneText.add(player1Text);
		
		player1TextField = new JTextField();
		player1TextField.setText("");
		playerOneText.add(player1TextField);
		player1TextField.setColumns(10);
		
		
		playerTwoText.setBorder(new LineBorder(new Color(0, 0, 0)));
		playerTwoText.setBounds(500, 0, 300, 80);
		playerNamesPanel.add(playerTwoText);
		
		JLabel player2Text = new JLabel("Name of Player 2:");
		player2Text.setFont(new Font("Tahoma", Font.PLAIN, 30));
		playerTwoText.add(player2Text);
		
		player2TextField = new JTextField();
		player2TextField.setText("");
		player2TextField.setColumns(10);
		playerTwoText.add(player2TextField);
		
		
		playerThreeText.setBorder(new LineBorder(new Color(0, 0, 0)));
		playerThreeText.setBounds(0, 120, 300, 80);
		playerNamesPanel.add(playerThreeText);
		
		JLabel player3Text = new JLabel("Name of Player 3:");
		player3Text.setFont(new Font("Tahoma", Font.PLAIN, 30));
		playerThreeText.add(player3Text);
		
		player3TextField = new JTextField();
		player3TextField.setText("");
		player3TextField.setColumns(10);
		playerThreeText.add(player3TextField);
		
		
		playerFourText.setBorder(new LineBorder(new Color(0, 0, 0)));
		playerFourText.setBounds(500, 120, 300, 80);
		playerNamesPanel.add(playerFourText);
		
		JLabel player4Text = new JLabel("Name of Player 4:");
		player4Text.setFont(new Font("Tahoma", Font.PLAIN, 30));
		playerFourText.add(player4Text);
		
		player4TextField = new JTextField();
		player4TextField.setColumns(10);
		playerFourText.add(player4TextField);
		
		
		playerFiveText.setBorder(new LineBorder(new Color(0, 0, 0)));
		playerFiveText.setBounds(250, 220, 300, 80);
		playerNamesPanel.add(playerFiveText);
		
		JLabel player5Text = new JLabel("Name of Player 5:");
		player5Text.setFont(new Font("Tahoma", Font.PLAIN, 30));
		playerFiveText.add(player5Text);
		
		player5TextField = new JTextField();
		player5TextField.setColumns(10);
		playerFiveText.add(player5TextField);
		this.playerWonLabell = new JLabel("playerName");
		map.setLayout(null);
		Game g = new Game(map, gameState.getWorld()); 
		
		for (CountryButton countryButton : g.getButtons()){
			countryButton.b.addActionListener(new ActionListener(){
		    	@Override
	            public void actionPerformed(ActionEvent e) {
		    		if (gameState.getCurrPhase() == 0){ 
		    			if (gameState.getCurrPlayer() == countryButton.country.getPlayer() && troopsLeft > 0){
		    				troopsLeft--;
		    				countryButton.country.addInfrantry(1);
		    				numberOfTroops.setText(Integer.toString(troopsLeft));
		    				gameState.updateCountryLabels();
		    			}
		    			else if (troopsLeft == 0){
		    				JOptionPane.showMessageDialog(countryButton.b, "Out of troops to add");
		    			}
		    			else{
		    				JOptionPane.showMessageDialog(countryButton.b, "That country does not belong to you.");
		    			}
		    		}
		    		else if (gameState.getCurrPhase() == 1){
			    		if (countryButton.country.getPlayer() == gameState.getCurrPlayer() && gameState.getCountry1() == null){
			    			if(countryButton.country.getTroops().size() > 1){
				    			gameState.setCountry1(countryButton.country);
				    			//JOptionPane.showMessageDialog(countryButton.b, "Country1 is " + gameState.getCountry1().getName());
				    			country1.setText(gameState.getCountry1().getName());
				    			cancelCountryButton.setVisible(true);
				    			cancelCountryButton.setEnabled(true);
			    			}
			    			else{
			    				gameState.setCountry1(null);
			    				JOptionPane.showMessageDialog(countryButton.b, "Country does not have enough troops to attack");
			    				country1.setText((String) null);
			    			}
			    		}
			    		else if (countryButton.country.getPlayer() != gameState.getCurrPlayer() && gameState.getCountry1() != null && gameState.getCountry2() == null){
			    			gameState.setCountry2(countryButton.country);
			    			if (gameState.getCountry1().checkAdjacent(gameState.getCountry2())){
			    				cancelCountryButton.setVisible(false);
				    			cancelCountryButton.setEnabled(false);
			    				country2.setText(gameState.getCountry2().getName());
			    				//JOptionPane.showMessageDialog(countryButton.b, "Country2 is " + gameState.getCountry2().getName());	    				
			    				gameState.getCurrPlayer().attack(gameState.getCountry1(), gameState.getCountry2());
//			    				if (gameState.getCountry2().getPlayer().getCountries().size() == 0){
//			    					gameState.getCountry2().getPlayer().getPlayerTextName().setVisible(false);
//			    					gameState.getAllPlayers().getPlayers().remove(gameState.getCountry2().getPlayer());
//			    				}
				    			gameState.updateCountryLabels();
				    			gameState.setCountry1(null);
				    			gameState.setCountry2(null);
				    			country1.setText((String) null);
				    			country2.setText((String) null);
			    			}
			    			else{
			    				JOptionPane.showMessageDialog(countryButton.b, "Countries are not adjacent, select the second country again.");			    				
			    				gameState.setCountry2(null);
			    				country2.setText((String) null);
			    			}
			    		}			    		
		    		}
		    		else{
		    			if (gameState.getCountry1() == null){
			    			gameState.setCountry1(countryButton.country);
			    			country1.setText(gameState.getCountry1().getName());
			    			if (gameState.getCountry1().getTroops().size() == 1){
			    				JOptionPane.showMessageDialog(countryButton.b, "Troops cannot be moved from here because " + gameState.getCountry1().getName() + " only has 1 troop.");
			    				gameState.setCountry1(null);
			    				country1.setText((String) null);
			    			}
			    			else{
			    				cancelCountryButton.setVisible(true);
			    				cancelCountryButton.setEnabled(true);
			    			}
			    		}
			    		else if (countryButton.country.getPlayer() == gameState.getCurrPlayer() && gameState.getCountry1() != null && gameState.getCountry2() == null){
			    			gameState.setCountry2(countryButton.country);
			    			country2.setText(gameState.getCountry2().getName());
			    			if (gameState.getCountry1().checkAdjacent(gameState.getCountry2())){
			    				cancelCountryButton.setVisible(false);
				    			cancelCountryButton.setEnabled(false);
			    				JPanel numPanel = new JPanel();
			    				numPanel.add(new JLabel("Select how many troops to add"));
			    				DefaultComboBoxModel<String> selection = new DefaultComboBoxModel<String>();
			    				for (int i = 1; i < gameState.getCountry1().getTroops().size(); i++){
			    					selection.addElement(Integer.toString(i));
			    				}
			    				JComboBox<String> comboBox = new JComboBox<String>(selection);
			    				numPanel.add(comboBox);
			    				int result = JOptionPane.showConfirmDialog(null, numPanel, "Number of Troops", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			    				if (result == JOptionPane.OK_OPTION){
			    					gameState.getCurrPlayer().moveTroops(gameState.getCountry1(), gameState.getCountry2(), Integer.parseInt(comboBox.getSelectedItem().toString()));
					    			gameState.updateCountryLabels();
					    			gameState.setCountry1(null);
					    			gameState.setCountry2(null);
					    			country1.setText((String) null);
					    			country2.setText((String) null);
			    				}
			    				else{
			    					JOptionPane.showMessageDialog(countryButton.b, "Move was cancelled.");
			    					gameState.setCountry1(null);
					    			gameState.setCountry2(null);
					    			country1.setText((String) null);
					    			country2.setText((String) null);
			    				}
			    			}
			    			else{
			    				JOptionPane.showMessageDialog(countryButton.b, "Countries are not adjacent, select the second country again.");
			    				gameState.setCountry2(null);
			    				country2.setText((String) null);
			    			}
			    			gameState.updateCountryLabels();
			    			gameState.setCountry1(null);
			    			gameState.setCountry2(null);
			    			country1.setText((String) null);
			    			country2.setText((String) null);
			    		}
		    		}
	            }
		    });
		}
		
		JLabel labelPlayer = new JLabel("");
		labelPlayer.setIcon(new ImageIcon("GimpFiles\\Map.png"));
		labelPlayer.setBounds(0, 30, 1194, 831);
		map.add(labelPlayer);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1200, 30);
		map.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Game");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		
		player1Name.setBackground(Color.LIGHT_GRAY);
		player1Name.setForeground(Color.CYAN);
		player1Name.setFont(new Font("Tahoma", Font.PLAIN, 30));
		player1Name.setHorizontalAlignment(SwingConstants.CENTER);
		player1Name.setEditable(false);
		player1Name.setBounds(100, 40, 175, 60);
		map.add(player1Name);
		
		
		player2Name.setHorizontalAlignment(SwingConstants.CENTER);
		player2Name.setForeground(Color.MAGENTA);
		player2Name.setFont(new Font("Tahoma", Font.PLAIN, 30));
		player2Name.setEditable(false);
		player2Name.setBackground(Color.LIGHT_GRAY);
		player2Name.setBounds(300, 40, 175, 60);
		map.add(player2Name);
		
		
		player3Name.setHorizontalAlignment(SwingConstants.CENTER);
		player3Name.setForeground(Color.GREEN);
		player3Name.setFont(new Font("Tahoma", Font.PLAIN, 30));
		player3Name.setEditable(false);
		player3Name.setBackground(Color.LIGHT_GRAY);
		player3Name.setBounds(500, 40, 175, 60);
		map.add(player3Name);
		
		
		player4Name.setHorizontalAlignment(SwingConstants.CENTER);
		player4Name.setForeground(Color.WHITE);
		player4Name.setFont(new Font("Tahoma", Font.PLAIN, 30));
		player4Name.setEditable(false);
		player4Name.setBackground(Color.LIGHT_GRAY);
		player4Name.setBounds(700, 40, 175, 60);
		map.add(player4Name);
		
		
		
		player5Name.setHorizontalAlignment(SwingConstants.CENTER);
		player5Name.setForeground(Color.YELLOW);
		player5Name.setFont(new Font("Tahoma", Font.PLAIN, 30));
		player5Name.setEditable(false);
		player5Name.setBackground(Color.LIGHT_GRAY);
		player5Name.setBounds(900, 40, 175, 60);
		map.add(player5Name);
		
		JPanel arrow0 = new JPanel();
		JPanel arrow1 = new JPanel();
		JPanel arrow2 = new JPanel();
		JPanel unitDisplay = new JPanel();

		numberOfTroops.setFont(new Font("Tahoma", Font.PLAIN, 20));

		unitDisplay.setVisible(true);
		arrow0.setVisible(true);
		arrow1.setVisible(false);
		arrow2.setVisible(false);
		
		JPanel nextStage = new JPanel();
		nextStage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gameState.setCurrPhase((gameState.getCurrPhase() + 1) % 3);
				if (gameState.getCurrPhase() == 0){
					unitDisplay.setVisible(true);
					arrow0.setVisible(true);
					arrow1.setVisible(false);
					arrow2.setVisible(false);
					gameState.getCurrPlayer().getPlayerTextName().setBackground(Color.LIGHT_GRAY);
					gameState.setNextPlayer();
					numberOfTroops.setText(Integer.toString(gameState.getCurrPlayer().getBonus()));
					troopsLeft = gameState.getCurrPlayer().getBonus();
					gameState.getCurrPlayer().getPlayerTextName().setBackground(Color.GRAY);
					gameState.setCountry1(null);
	    			gameState.setCountry2(null);
					System.out.println(gameState);
				}
				else if (gameState.getCurrPhase() == 1){
					unitDisplay.setVisible(false);
					arrow0.setVisible(false);
					arrow1.setVisible(true);
					arrow2.setVisible(false);
				}
				else {
					unitDisplay.setVisible(false);
					arrow0.setVisible(false);
					arrow1.setVisible(false);
					arrow2.setVisible(true);
				}
				
				
			}
		});
		nextStage.setBackground(Color.RED);
		nextStage.setBounds(1009, 785, 170, 50);
		map.add(nextStage);
		nextStage.setLayout(null);
		
		JLabel nextStageLabel = new JLabel("Next Stage");
		nextStageLabel.setForeground(Color.WHITE);
		nextStageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nextStageLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		nextStageLabel.setBounds(0, 0, 170, 50);
		nextStage.add(nextStageLabel);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.LIGHT_GRAY);
		panel_15.setBounds(780, 765, 200, 31);
		map.add(panel_15);
		panel_15.setLayout(null);
		
		JLabel obtainTroopLabel = new JLabel("Obtain Troops Stage");
		obtainTroopLabel.setBounds(0, 0, 200, 31);
		panel_15.add(obtainTroopLabel);
		obtainTroopLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.LIGHT_GRAY);
		panel_16.setBounds(780, 795, 200, 31);
		map.add(panel_16);
		panel_16.setLayout(null);
		
		JLabel attackStageLabel = new JLabel("Attack Stage");
		attackStageLabel.setBounds(0, 0, 200, 31);
		panel_16.add(attackStageLabel);
		attackStageLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.LIGHT_GRAY);
		panel_17.setBounds(780, 825, 200, 31);
		map.add(panel_17);
		panel_17.setLayout(null);
		
		JLabel moveStageLabel = new JLabel("Move Stage");
		moveStageLabel.setBounds(0, 0, 200, 31);
		panel_17.add(moveStageLabel);
		moveStageLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		

		
		arrow0.setBackground(Color.LIGHT_GRAY);
		arrow0.setBounds(740, 765, 30, 30);
		map.add(arrow0);
		arrow0.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("GimpFiles\\arrow.png"));
		lblNewLabel_3.setBounds(0, 0, 30, 30);
		arrow0.add(lblNewLabel_3);
		
		
		arrow1.setBounds(740, 795, 30, 30);
		map.add(arrow1);
		arrow1.setLayout(null);
		arrow1.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("GimpFiles\\arrow.png"));
		label_7.setBounds(0, 0, 30, 30);
		arrow1.add(label_7);
		
		
		arrow2.setLayout(null);
		arrow2.setBackground(Color.LIGHT_GRAY);
		arrow2.setBounds(740, 825, 30, 30);
		map.add(arrow2);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("GimpFiles\\arrow.png"));
		label_8.setBounds(0, 0, 30, 30);
		arrow2.add(label_8);
		
		
		unitDisplay.setBackground(Color.LIGHT_GRAY);
		unitDisplay.setBounds(510, 765, 220, 30);
		map.add(unitDisplay);
		unitDisplay.setLayout(null);
		
		JLabel troopRemainingLabel = new JLabel("Troops Remaining: ");
		troopRemainingLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		troopRemainingLabel.setBounds(0, 0, 174, 30);
		unitDisplay.add(troopRemainingLabel);
		
		
		numberOfTroops.setHorizontalAlignment(SwingConstants.CENTER);
		numberOfTroops.setBounds(175, 0, 45, 30);
		unitDisplay.add(numberOfTroops);
		
		JPanel Country1Display = new JPanel();
		Country1Display.setOpaque(false);
		Country1Display.setBounds(30, 765, 320, 35);
		map.add(Country1Display);
		
		JLabel Country1Label = new JLabel("Country 1:");
		Country1Label.setAlignmentY(Component.TOP_ALIGNMENT);
		Country1Label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Country1Display.add(Country1Label);
		
		//JLabel label_13 = new JLabel((String) null);
		country1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Country1Display.add(country1);
		
		JPanel Country2Display = new JPanel();
		Country2Display.setOpaque(false);
		Country2Display.setBounds(30, 812, 320, 35);
		map.add(Country2Display);
		
		JLabel Country2Label = new JLabel("Country 2:");
		Country2Label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Country2Display.add(Country2Label);
		
		//JLabel label_14 = new JLabel((String) null);
		country2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Country2Display.add(country2);
		
		
		
		resultsScreen.setBackground(Color.LIGHT_GRAY);
		
		resultsScreen.setLayout(null);
		
		JPanel playerPanelWin = new JPanel();
		playerPanelWin.setBackground(Color.RED);
		playerPanelWin.setBounds(300, 100, 600, 150);
		resultsScreen.add(playerPanelWin);
		playerPanelWin.setLayout(null);
		
		
		playerWonLabell.setForeground(Color.WHITE);
		playerWonLabell.setBounds(0, 0, 600, 150);
		playerPanelWin.add(playerWonLabell);
		playerWonLabell.setFont(new Font("Tahoma", Font.PLAIN, 70));
		playerWonLabell.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel playerWinTextPanel = new JPanel();
		playerWinTextPanel.setBackground(Color.RED);
		playerWinTextPanel.setBounds(300, 280, 600, 75);
		resultsScreen.add(playerWinTextPanel);
		playerWinTextPanel.setLayout(null);
		
		JLabel playerWinTextLabel = new JLabel("Has won the game!");
		playerWinTextLabel.setForeground(Color.WHITE);
		playerWinTextLabel.setBounds(0, 0, 600, 75);
		playerWinTextPanel.add(playerWinTextLabel);
		playerWinTextLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		playerWinTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("GimpFiles\\Soldiers.png"));
		label_12.setBounds(300, 400, 600, 321);
		resultsScreen.add(label_12);
		
		gameState.getWorld().getContinents().get(0).getCountries().get(0).getButton().b.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(gameState.getWorld().getContinents().get(0).getCountries().get(0).getName());
			
			}
		});

	}
	
	public void initializeEndGame() {
		playerWonLabell.setText(gameState.getCurrPlayer().getName());
		cardLayout.show(cards, "Results");
	}
}

