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
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class WindowMain {

	private JFrame frame1;
	private JPanel cards;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	/**
	 * Create the application.
	 */
	public WindowMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setTitle("Risk - The Game of Global Domination");
		frame1.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame1.setResizable(false);
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
		panel.setBounds(451, 677, 317, 77);
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
		//label.setIcon(new ImageIcon("GimpFiles\\StartGame.png")); //This should work for you, let me know if it does not. -Diego
		label.setIcon(new ImageIcon("C:\\Users\\Diego\\Documents\\eclipseWorkspace\\Risk\\GimpFiles\\StartGame.png"));
		
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
		JPanel panel_9 = new JPanel();
		JPanel panel_10 = new JPanel();
		JPanel panel_11 = new JPanel();
		JPanel panel_12 = new JPanel();
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
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(cards, "Game");
			}
		});
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(300, 780, 200, 50);
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1200, 30);
		map.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Game");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("item1");
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel label_7 = new JLabel("");
		//label.setIcon(new ImageIcon("GimpFiles\\Map.png")); //This should work for you, let me know if it does not. -Diego
		label_7.setIcon(new ImageIcon("C:\\Users\\Diego\\Documents\\eclipseWorkspace\\Risk\\GimpFiles\\Map.png"));
		label_7.setBounds(0, 29, 1194, 831);
		map.add(label_7);
	

	}
}
