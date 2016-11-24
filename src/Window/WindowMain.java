package Window;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.border.LineBorder;

import Player.Player;
import World.*;

import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import javax.swing.JFormattedTextField;

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

public class WindowMain {

	private JFrame frame1;
	private JPanel cards;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private GameState gameState;
	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public WindowMain() throws IOException {
		gameState = new GameState();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
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
		
		cards.add(mainScreen, "Main Screen");
		cards.add(playerSelect, "Player Selection");
		cards.add(map, "Game");
		frame1.getContentPane().add(cards);
		
		mainScreen.setBackground(Color.LIGHT_GRAY);
		mainScreen.setLayout(null);
		//frame1.getContentPane().add(mainScreen, "name_21718623405784");
		
		CardLayout cardLayout = (CardLayout) cards.getLayout();
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(cards, "Player Selection");
			}
		});
		
		JPanel panel_13 = new JPanel();
		panel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		panel_13.setBackground(Color.RED);
		panel_13.setBounds(1130, 820, 50, 30);
		mainScreen.add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Exit");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 50, 30);
		panel_13.add(lblNewLabel);
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(451, 177, 317, 77);
		mainScreen.add(panel);
		panel.setLayout(null);
		
		JLabel lblStart = new JLabel("Start Game");
		lblStart.setForeground(new Color(255, 255, 255));
		lblStart.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblStart.setBounds(0, 0, 317, 77);
		panel.add(lblStart);
		
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
		
		JPanel panel_2 = new JPanel();
		JPanel panel_3 = new JPanel();
		JPanel panel_4 = new JPanel();
		JPanel panel_5 = new JPanel();
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.CYAN);
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.MAGENTA);
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.GREEN);
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.YELLOW);
		panel_8.setVisible(false);
		panel_9.setVisible(false);
		panel_10.setVisible(false);
		panel_11.setVisible(false);
		panel_12.setVisible(false);
		
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.setBackground(Color.BLUE);
				panel_3.setBackground(Color.RED);
				panel_4.setBackground(Color.RED);
				panel_5.setBackground(Color.RED);
				panel_8.setVisible(true);
				panel_9.setVisible(true);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				
			}
		});
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.setBackground(Color.RED);
				panel_3.setBackground(Color.BLUE);
				panel_4.setBackground(Color.RED);
				panel_5.setBackground(Color.RED);
				panel_8.setVisible(true);
				panel_9.setVisible(true);
				panel_10.setVisible(true);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
			}
		});
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.setBackground(Color.RED);
				panel_3.setBackground(Color.RED);
				panel_4.setBackground(Color.BLUE);
				panel_5.setBackground(Color.RED);
				panel_8.setVisible(true);
				panel_9.setVisible(true);
				panel_10.setVisible(true);
				panel_11.setVisible(true);
				panel_12.setVisible(false);
			}
		});
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.setBackground(Color.RED);
				panel_3.setBackground(Color.RED);
				panel_4.setBackground(Color.RED);
				panel_5.setBackground(Color.BLUE);
				panel_8.setVisible(true);
				panel_9.setVisible(true);
				panel_10.setVisible(true);
				panel_11.setVisible(true);
				panel_12.setVisible(true);
			}
		});
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(200, 300, 100, 100);
		playerSelect.add(panel_2);
		
		JLabel label_1 = new JLabel("2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 50));
		label_1.setBackground(new Color(0, 128, 128));
		label_1.setBounds(0, 0, 100, 100);
		panel_2.add(label_1);
		
		
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBackground(Color.RED);
		panel_3.setBounds(433, 300, 100, 100);
		playerSelect.add(panel_3);
		
		JLabel label_3 = new JLabel("3");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 50));
		label_3.setBackground(new Color(0, 128, 128));
		label_3.setBounds(0, 0, 100, 100);
		panel_3.add(label_3);
		
		
		panel_4.setLayout(null);
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.setBackground(Color.RED);
		panel_4.setBounds(667, 300, 100, 100);
		playerSelect.add(panel_4);
		
		JLabel label_4 = new JLabel("4");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 50));
		label_4.setBackground(new Color(0, 128, 128));
		label_4.setBounds(0, 0, 100, 100);
		panel_4.add(label_4);
		
		
		panel_5.setLayout(null);
		panel_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_5.setBackground(Color.RED);
		panel_5.setBounds(900, 300, 100, 100);
		playerSelect.add(panel_5);
		
		JLabel label_5 = new JLabel("5");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Dialog", Font.PLAIN, 50));
		label_5.setBackground(new Color(0, 128, 128));
		label_5.setBounds(0, 0, 100, 100);
		panel_5.add(label_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(cards, "Main Screen");
			}
		});
		panel_6.setLayout(null);
		panel_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_6.setBackground(Color.RED);
		panel_6.setBounds(700, 780, 200, 50);
		playerSelect.add(panel_6);
		
		JLabel label_6 = new JLabel("Cancel");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_6.setBounds(0, 0, 200, 50);
		panel_6.add(label_6);
		JPanel panel_1 = new JPanel();
		
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
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(cards, "Game");
				gameState.stopCurrentSound();
				gameState.playSound("music\\introToMap.wav");
				//gameState.playSound("music\\Risk.wav");
				if(panel_8.isVisible()) {
					Player p1 = new Player(textField.getText(), "Orange");
					gameState.addPlayer(p1);
				}
				if(panel_9.isVisible()) {
					Player p2 = new Player(textField_1.getText(), "Magenta");
					gameState.addPlayer(p2);
				}
				if(panel_10.isVisible()) {
					Player p3 = new Player(textField_2.getText(), "Green");
					gameState.addPlayer(p3);
				}
				if(panel_11.isVisible()) {
					Player p4 = new Player(textField_3.getText(), "Blue");
					gameState.addPlayer(p4);
				}
				if(panel_12.isVisible()) {
					Player p5 = new Player(textField_4.getText(), "Yellow");
					gameState.addPlayer(p5);
				}
				gameState.gameStart();
				System.out.println(gameState);
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
			}
		});
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(300, 180, 200, 50);
		playerSelect.add(panel_1);
		
		JLabel lblStartGame = new JLabel("Start Game!");
		lblStartGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblStartGame.setForeground(Color.WHITE);
		lblStartGame.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStartGame.setBounds(0, 0, 200, 50);
		panel_1.add(lblStartGame);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(200, 450, 800, 300);
		playerSelect.add(panel_7);
		panel_7.setLayout(null);
		

		panel_8.setBounds(0, 0, 300, 80);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.add(panel_8);
		
		JLabel lblNameOfPlayer = new JLabel("Name of Player 1:");
		lblNameOfPlayer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_8.add(lblNameOfPlayer);
		
		textField = new JTextField();
		panel_8.add(textField);
		textField.setColumns(10);
		
		
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setBounds(500, 0, 300, 80);
		panel_7.add(panel_9);
		
		JLabel label_9 = new JLabel("Name of Player 2:");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_9.add(label_9);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_9.add(textField_1);
		
		
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setBounds(0, 120, 300, 80);
		panel_7.add(panel_10);
		
		JLabel label_10 = new JLabel("Name of Player 3:");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_10.add(label_10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_10.add(textField_2);
		
		
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBounds(500, 120, 300, 80);
		panel_7.add(panel_11);
		
		JLabel label_11 = new JLabel("Name of Player 4:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_11.add(label_11);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_11.add(textField_3);
		
		
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_12.setBounds(250, 220, 300, 80);
		panel_7.add(panel_12);
		
		JLabel lblNameOfPlayer_1 = new JLabel("Name of Player 5:");
		lblNameOfPlayer_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_12.add(lblNameOfPlayer_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_12.add(textField_4);
		
		map.setLayout(null);
		new Game(map, gameState.getWorld()); 
		
		JLabel lblPlayer = new JLabel("");
		lblPlayer.setIcon(new ImageIcon("GimpFiles\\Map.png"));
		lblPlayer.setBounds(0, 29, 1194, 831);
		map.add(lblPlayer);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1200, 30);
		map.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Game");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("item1");
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
		
		arrow0.setVisible(true);
		arrow1.setVisible(false);
		arrow2.setVisible(false);
		
		JPanel nextStage = new JPanel();
		nextStage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gameState.setCurrPhase((gameState.getCurrPhase() + 1) % 3);
				if (gameState.getCurrPhase() == 0){
					arrow0.setVisible(true);
					arrow1.setVisible(false);
					arrow2.setVisible(false);
					gameState.getCurrPlayer().getPlayerTextName().setBackground(Color.LIGHT_GRAY);
					gameState.setNextPlayer();
					gameState.getCurrPlayer().getPlayerTextName().setBackground(Color.GRAY);
				}
				else if (gameState.getCurrPhase() == 1){
					arrow0.setVisible(false);
					arrow1.setVisible(true);
					arrow2.setVisible(false);
				}
				else {
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
		
		JLabel lblNewLabel_1 = new JLabel("Next Stage");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(0, 0, 170, 50);
		nextStage.add(lblNewLabel_1);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.LIGHT_GRAY);
		panel_15.setBounds(780, 765, 200, 31);
		map.add(panel_15);
		panel_15.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Obtain Troops Stage");
		lblNewLabel_2.setBounds(0, 0, 200, 31);
		panel_15.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.LIGHT_GRAY);
		panel_16.setBounds(780, 795, 200, 31);
		map.add(panel_16);
		panel_16.setLayout(null);
		
		JLabel lblAttackStage = new JLabel("Attack Stage");
		lblAttackStage.setBounds(0, 0, 200, 31);
		panel_16.add(lblAttackStage);
		lblAttackStage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.LIGHT_GRAY);
		panel_17.setBounds(780, 825, 200, 31);
		map.add(panel_17);
		panel_17.setLayout(null);
		
		JLabel lblMoveStaeg = new JLabel("Move Stage");
		lblMoveStaeg.setBounds(0, 0, 200, 31);
		panel_17.add(lblMoveStaeg);
		lblMoveStaeg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		

		
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
		
		JPanel resultsScreen = new JPanel();
		resultsScreen.setBackground(Color.LIGHT_GRAY);
		cards.add(resultsScreen, "name_263613888585938");
		resultsScreen.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.RED);
		panel_14.setBounds(300, 100, 600, 150);
		resultsScreen.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel lblPlayername = new JLabel("playerName");
		lblPlayername.setForeground(Color.WHITE);
		lblPlayername.setBounds(0, 0, 600, 150);
		panel_14.add(lblPlayername);
		lblPlayername.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblPlayername.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.RED);
		panel_18.setBounds(300, 280, 600, 75);
		resultsScreen.add(panel_18);
		panel_18.setLayout(null);
		
		JLabel lblHasWonThe = new JLabel("Has won the game!");
		lblHasWonThe.setForeground(Color.WHITE);
		lblHasWonThe.setBounds(0, 0, 600, 75);
		panel_18.add(lblHasWonThe);
		lblHasWonThe.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblHasWonThe.setHorizontalAlignment(SwingConstants.CENTER);

	}
}
