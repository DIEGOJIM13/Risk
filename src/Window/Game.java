package Window;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game {

	private JPanel frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPanel thing = new JPanel();
					Game window = new Game(thing);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException
	 */
	public Game(JPanel map) throws IOException {
		initialize(map);
	}

	
	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize(JPanel map) throws IOException {
		frame = map;
		//frame.setBounds(100, 100, 1200, 900);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		
		//final BufferedImage GreenLand = ImageIO.read(new File("C:/Users/reboo_000/Desktop/Greenland.png"));
		//final BufferedImage IceLand = ImageIO.read(new File("C:/Users/reboo_000/Desktop/Iceland.png"));
		//final BufferedImage Quebec = ImageIO.read(new File("C:/Users/reboo_000/Desktop/Quebec.png"));
		//final BufferedImage EasternUS = ImageIO.read(new File("C:/Users/reboo_000/Desktop/EUS.png"));
		//CountryButton GRNLND = new CountryButton(GreenLand, "Greenland");
		//CountryButton ICELND = new CountryButton(IceLand, "Iceland");
		//CountryButton QUEBEC = new CountryButton(Quebec, "Quebec");
		//CountryButton EASTUS = new CountryButton(EasternUS, "EasternUS");
		
	//	frame.setLayout(null);
		
		CountryButton Afghanistan = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Afghanistan.png")), "Afghanistan");
		CountryButton Alaska = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Alaska.png")), "Alaska");
		CountryButton Alberta = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Alberta.png")), "Alberta");
		CountryButton Argentina = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Argentina.png")), "Argentina");
		CountryButton Brazil = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Brazil.png")), "Brazil");
		CountryButton Britain = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Britain.png")), "Britain");
		CountryButton CenAm = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\CenAm.png")), "Central America");
		CountryButton China = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\China.png")), "China");
		CountryButton Congo = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Congo.png")), "Congo");
		CountryButton EastAfrica = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\EastAfrica.png")), "East Africa");
		CountryButton EasternAustralia = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\EasternAustralia.png")), "EasternAustralia");
		CountryButton EasternUS = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\EasternUnitedStates.png")), "Eastern US");
		CountryButton Egypt = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Egypt.png")), "Egypt");
		CountryButton Greenland = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Greenland.png")), "Greenland");
		CountryButton Iceland = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Iceland.png")), "Iceland");
		CountryButton India = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\India.png")), "Inda");
		CountryButton Indonesia = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Indonesia.png")), "Indonesia");
		CountryButton Irkutsk = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Irkutsk.png")), "Irkutsk");
		CountryButton Japan = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Japan.png")), "Japan");
		CountryButton Kamchatka = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Kamchatka.png")), "Kamchatka");
		CountryButton Madagascar = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Madagascar.png")), "Madagascar");
		CountryButton MiddleEast = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\MiddleEast.png")), "MiddleEast");
		CountryButton Mongolia = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Mongolia.png")), "Mongolia");
		CountryButton NewGuinea = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\NewGuinea.png")), "NewGuinea");
		CountryButton NorthAfrica = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\NorthAfrica.png")), "North Africa");
		CountryButton NorthernEurope = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\NorthernEurope.png")), "Northern Europe");
		CountryButton NWTerritory = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\NorthWestTerritory.png")), "NorthWest Territory");
		CountryButton Ontario = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Ontario.png")), "Ontario");
		CountryButton Peru = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Peru.png")), "Peru");
		CountryButton Quebec = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Quebec.png")), "Quebec");
		CountryButton Scandinavia = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Scandinavia.png")), "Scandinavia");
		CountryButton Siam = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Siam.png")), "Siam");
		CountryButton Siberia = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Siberia.png")), "Siberia");
		CountryButton SouthAfrica = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\SouthAfrica.png")), "SouthAfrica");
		CountryButton SouthernEurope = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\SouthernEurope.png")), "Southern Europe");
		CountryButton Ukraine = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Ukraine.png")), "Ukraine");
		CountryButton Ural = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Ural.png")), "Ural");
		CountryButton Venezuela = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Venezuela.png")), "Venezuela");
		CountryButton WesternAustralia = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\WesternAustralia.png")), "Western Australia");
		CountryButton WesternEurope = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\WesternEurope.png")), "Western Europe");
		CountryButton WesternUS = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\WesternUnitedStates.png")), "Western US");
		CountryButton Yakutsk = new CountryButton(ImageIO.read(new File("GimpFiles\\Countries\\Yakutsk.png")), "Yakutsk");
		
		JButton btnNewButton = new JButton((String) null);
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon("GimpFiles\\Countries\\Alaska.png"));
		Alaska.b.setBounds(7, 177, 101, 100);
		frame.add(Alaska.b);
		
		JButton btnNewButton_1 = new JButton((String) null);
		btnNewButton_1.setIcon(new ImageIcon("GimpFiles\\Countries\\NorthWestTerritory.png"));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		NWTerritory.b.setBounds(82, 159, 175, 83);
		frame.add(NWTerritory.b);
		
		JButton btnNewButton_2 = new JButton((String) null);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon("GimpFiles\\Countries\\Quebec.png"));
		Quebec.b.setBounds(238, 227, 87, 118);
		frame.add(Quebec.b);
		
		JButton btnNewButton_3 = new JButton((String) null);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setIcon(new ImageIcon("GimpFiles\\Countries\\Alberta.png"));
		Alberta.b.setBounds(90, 235, 96, 71);
		frame.add(Alberta.b);
		
		JButton btnNewButton_4 = new JButton((String) null);
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setIcon(new ImageIcon("GimpFiles\\Countries\\Ontario.png"));
		Ontario.b.setBounds(173, 234, 75, 90);
		frame.add(Ontario.b);
		
		JButton btnNewButton_5 = new JButton((String) null);
		btnNewButton_5.setIcon(new ImageIcon("GimpFiles\\Countries\\EasternUnitedStates.png"));
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		EasternUS.b.setBounds(158, 302, 127, 118);
		frame.add(EasternUS.b);
		
		JButton btnNewButton_6 = new JButton((String) null);
		btnNewButton_6.setOpaque(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setIcon(new ImageIcon("GimpFiles\\Countries\\WesternUnitedStates.png"));
		WesternUS.b.setBounds(97, 300, 101, 100);
		frame.add(WesternUS.b);
		
		JButton btnNewButton_7 = new JButton((String) null);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setOpaque(false);
		btnNewButton_7.setIcon(new ImageIcon("GimpFiles\\Countries\\CenAm.png"));
		CenAm.b.setBounds(100, 374, 107, 118);
		frame.add(CenAm.b);
		
		JButton btnNewButton_8 = new JButton((String) null);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setOpaque(false);
		btnNewButton_8.setIcon(new ImageIcon("GimpFiles\\Countries\\Venezuela.png"));
		Venezuela.b.setBounds(177, 455, 127, 71);
		frame.add(Venezuela.b);
		
		JButton btnNewButton_9 = new JButton((String) null);
		btnNewButton_9.setOpaque(false);
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setIcon(new ImageIcon("GimpFiles\\Countries\\Argentina.png"));
		Argentina.b.setBounds(209, 585, 94, 175);
		frame.add(Argentina.b);
		
		JButton btnNewButton_10 = new JButton((String) null);
		btnNewButton_10.setOpaque(false);
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setContentAreaFilled(false);
		btnNewButton_10.setIcon(new ImageIcon("GimpFiles\\Countries\\Brazil.png"));
		Brazil.b.setBounds(198, 487, 188, 168);
		frame.add(Brazil.b);
		
		JButton btnNewButton_11 = new JButton((String) null);
		btnNewButton_11.setOpaque(false);
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setContentAreaFilled(false);
		btnNewButton_11.setIcon(new ImageIcon("GimpFiles\\Countries\\Peru.png"));
		Peru.b.setBounds(165, 499, 128, 128);
		frame.add(Peru.b);
		
		JButton btnNewButton_12 = new JButton((String) null);
		btnNewButton_12.setOpaque(false);
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setContentAreaFilled(false);
		btnNewButton_12.setIcon(new ImageIcon("GimpFiles\\Countries\\NorthAfrica.png"));
		NorthAfrica.b.setBounds(378, 446, 168, 163);
		frame.add(NorthAfrica.b);
		
		JButton btnNewButton_13 = new JButton((String) null);
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setOpaque(false);
		btnNewButton_13.setIcon(new ImageIcon("GimpFiles\\Countries\\Congo.png"));
		Congo.b.setBounds(488, 561, 101, 100);
		frame.add(Congo.b);
		
		JButton btnNewButton_14 = new JButton((String) null);
		btnNewButton_14.setOpaque(false);
		btnNewButton_14.setBorderPainted(false);
		btnNewButton_14.setContentAreaFilled(false);
		btnNewButton_14.setIcon(new ImageIcon("GimpFiles\\Countries\\SouthAfrica.png"));
		SouthAfrica.b.setBounds(498, 627, 116, 132);
		frame.add(SouthAfrica.b);
		
		JButton btnNewButton_15 = new JButton((String) null);
		btnNewButton_15.setOpaque(false);
		btnNewButton_15.setBorderPainted(false);
		btnNewButton_15.setContentAreaFilled(false);
		btnNewButton_15.setIcon(new ImageIcon("GimpFiles\\Countries\\EastAfrica.png"));
		EastAfrica.b.setBounds(537, 515, 116, 160);
		frame.add(EastAfrica.b);
		
		JButton btnNewButton_16 = new JButton((String) null);
		btnNewButton_16.setOpaque(false);
		btnNewButton_16.setBorderPainted(false);
		btnNewButton_16.setContentAreaFilled(false);
		btnNewButton_16.setIcon(new ImageIcon("GimpFiles\\Countries\\Egypt.png"));
		Egypt.b.setBounds(492, 453, 100, 83);
		frame.add(Egypt.b);
		
		JButton btnNewButton_17 = new JButton((String) null);
		btnNewButton_17.setOpaque(false);
		btnNewButton_17.setBorderPainted(false);
		btnNewButton_17.setContentAreaFilled(false);
		btnNewButton_17.setIcon(new ImageIcon("GimpFiles\\Countries\\Madagascar.png"));
		Madagascar.b.setBounds(592, 632, 78, 110);
		frame.add(Madagascar.b);
		
		JButton btnNewButton_18 = new JButton((String) null);
		btnNewButton_18.setBorderPainted(false);
		btnNewButton_18.setContentAreaFilled(false);
		btnNewButton_18.setIcon(new ImageIcon("GimpFiles\\Countries\\Greenland.png"));
		Greenland.b.setBounds(207, 127, 198, 133);
		frame.add(Greenland.b);
		
		JButton btnNewButton_19 = new JButton((String) null);
		btnNewButton_19.setOpaque(false);
		btnNewButton_19.setBorderPainted(false);
		btnNewButton_19.setContentAreaFilled(false);
		btnNewButton_19.setIcon(new ImageIcon("GimpFiles\\Countries\\Iceland.png"));
		Iceland.b.setBounds(375, 219, 87, 81);
		frame.add(Iceland.b);
		
		JButton btnNewButton_20 = new JButton((String) null);
		btnNewButton_20.setOpaque(false);
		btnNewButton_20.setContentAreaFilled(false);
		btnNewButton_20.setBorderPainted(false);
		btnNewButton_20.setIcon(new ImageIcon("GimpFiles\\Countries\\Britain.png"));
		Britain.b.setBounds(346, 269, 116, 96);
		frame.add(Britain.b);
		
		JButton btnNewButton_21 = new JButton((String) null);
		btnNewButton_21.setOpaque(false);
		btnNewButton_21.setContentAreaFilled(false);
		btnNewButton_21.setBorderPainted(false);
		btnNewButton_21.setIcon(new ImageIcon("GimpFiles\\Countries\\Scandinavia.png"));
		Scandinavia.b.setBounds(436, 189, 120, 112);
		frame.add(Scandinavia.b);
		
		JButton btnNewButton_22 = new JButton((String) null);
		btnNewButton_22.setOpaque(false);
		btnNewButton_22.setContentAreaFilled(false);
		btnNewButton_22.setBorderPainted(false);
		btnNewButton_22.setIcon(new ImageIcon("GimpFiles\\Countries\\Ukraine.png"));
		Ukraine.b.setBounds(519, 189, 158, 224);
		frame.add(Ukraine.b);
		
		JButton btnNewButton_23 = new JButton((String) null);
		btnNewButton_23.setOpaque(false);
		btnNewButton_23.setContentAreaFilled(false);
		btnNewButton_23.setBorderPainted(false);
		btnNewButton_23.setIcon(new ImageIcon("GimpFiles\\Countries\\WesternEurope.png"));
		WesternEurope.b.setBounds(380, 349, 90, 116);
		frame.add(WesternEurope.b);
		
		JButton btnNewButton_24 = new JButton((String) null);
		btnNewButton_24.setOpaque(false);
		btnNewButton_24.setContentAreaFilled(false);
		btnNewButton_24.setBorderPainted(false);
		btnNewButton_24.setIcon(new ImageIcon("GimpFiles\\Countries\\NorthernEurope.png"));
		NorthernEurope.b.setBounds(431, 284, 118, 94);
		frame.add(NorthernEurope.b);
		
		JButton btnNewButton_25 = new JButton((String) null);
		btnNewButton_25.setOpaque(false);
		btnNewButton_25.setBorderPainted(false);
		btnNewButton_25.setContentAreaFilled(false);
		btnNewButton_25.setIcon(new ImageIcon("GimpFiles\\Countries\\SouthernEurope.png"));
		SouthernEurope.b.setBounds(456, 352, 100, 114);
		frame.add(SouthernEurope.b);
		
		JButton btnNewButton_26 = new JButton((String) null);
		btnNewButton_26.setOpaque(false);
		btnNewButton_26.setContentAreaFilled(false);
		btnNewButton_26.setBorderPainted(false);
		btnNewButton_26.setIcon(new ImageIcon("GimpFiles\\Countries\\MiddleEast.png"));
		MiddleEast.b.setBounds(534, 399, 160, 153);
		frame.add(MiddleEast.b);
		
		JButton btnNewButton_27 = new JButton((String) null);
		btnNewButton_27.setBorderPainted(false);
		btnNewButton_27.setContentAreaFilled(false);
		btnNewButton_27.setOpaque(false);
		btnNewButton_27.setIcon(new ImageIcon("GimpFiles\\Countries\\Afghanistan.png"));
		Afghanistan.b.setBounds(614, 298, 121, 120);
		frame.add(Afghanistan.b);
		
		JButton btnNewButton_28 = new JButton((String) null);
		btnNewButton_28.setOpaque(false);
		btnNewButton_28.setContentAreaFilled(false);
		btnNewButton_28.setBorderPainted(false);
		btnNewButton_28.setIcon(new ImageIcon("GimpFiles\\Countries\\India.png"));
		India.b.setBounds(673, 391, 122, 172);
		frame.add(India.b);
		
		JButton btnNewButton_29 = new JButton((String) null);
		btnNewButton_29.setContentAreaFilled(false);
		btnNewButton_29.setBorderPainted(false);
		btnNewButton_29.setOpaque(false);
		btnNewButton_29.setIcon(new ImageIcon("GimpFiles\\Countries\\Siam.png"));
		Siam.b.setBounds(777, 445, 82, 104);
		frame.add(Siam.b);
		
		JButton btnNewButton_30 = new JButton((String) null);
		btnNewButton_30.setOpaque(false);
		btnNewButton_30.setBorderPainted(false);
		btnNewButton_30.setContentAreaFilled(false);
		btnNewButton_30.setIcon(new ImageIcon("GimpFiles\\Countries\\China.png"));
		China.b.setBounds(712, 321, 172, 154);
		frame.add(China.b);
		
		JButton btnNewButton_31 = new JButton((String) null);
		btnNewButton_31.setBorderPainted(false);
		btnNewButton_31.setOpaque(false);
		btnNewButton_31.setContentAreaFilled(false);
		btnNewButton_31.setIcon(new ImageIcon("GimpFiles\\Countries\\Mongolia.png"));
		Mongolia.b.setBounds(771, 288, 144, 96);
		frame.add(Mongolia.b);
		
		JButton btnNewButton_32 = new JButton((String) null);
		btnNewButton_32.setOpaque(false);
		btnNewButton_32.setContentAreaFilled(false);
		btnNewButton_32.setBorderPainted(false);
		btnNewButton_32.setIcon(new ImageIcon("GimpFiles\\Countries\\Ural.png"));
		Ural.b.setBounds(660, 166, 86, 178);
		frame.add(Ural.b);
		
		JButton btnNewButton_33 = new JButton((String) null);
		btnNewButton_33.setOpaque(false);
		btnNewButton_33.setContentAreaFilled(false);
		btnNewButton_33.setBorderPainted(false);
		btnNewButton_33.setIcon(new ImageIcon("GimpFiles\\Countries\\Siberia.png"));
		Siberia.b.setBounds(683, 133, 124, 210);
		frame.add(Siberia.b);
		
		JButton btnNewButton_34 = new JButton((String) null);
		btnNewButton_34.setOpaque(false);
		btnNewButton_34.setContentAreaFilled(false);
		btnNewButton_34.setBorderPainted(false);
		btnNewButton_34.setIcon(new ImageIcon("GimpFiles\\Countries\\Irkutsk.png"));
		Irkutsk.b.setBounds(763, 231, 112, 86);
		frame.add(Irkutsk.b);
		
		JButton btnNewButton_35 = new JButton((String) null);
		btnNewButton_35.setOpaque(false);
		btnNewButton_35.setContentAreaFilled(false);
		btnNewButton_35.setBorderPainted(false);
		btnNewButton_35.setIcon(new ImageIcon("GimpFiles\\Countries\\Yakutsk.png"));
		Yakutsk.b.setBounds(779, 151, 104, 94);
		frame.add(Yakutsk.b);
		
		JButton btnNewButton_36 = new JButton((String) null);
		btnNewButton_36.setOpaque(false);
		btnNewButton_36.setContentAreaFilled(false);
		btnNewButton_36.setBorderPainted(false);
		btnNewButton_36.setIcon(new ImageIcon("GimpFiles\\Countries\\Kamchatka.png"));
		Kamchatka.b.setBounds(836, 163, 302, 172);
		frame.add(Kamchatka.b);
		
		JButton btnNewButton_37 = new JButton((String) null);
		btnNewButton_37.setBorderPainted(false);
		btnNewButton_37.setContentAreaFilled(false);
		btnNewButton_37.setOpaque(false);
		btnNewButton_37.setIcon(new ImageIcon("GimpFiles\\Countries\\Japan.png"));
		Japan.b.setBounds(890, 285, 68, 118);
		frame.add(Japan.b);
		
		JButton btnNewButton_38 = new JButton((String) null);
		btnNewButton_38.setOpaque(false);
		btnNewButton_38.setContentAreaFilled(false);
		btnNewButton_38.setBorderPainted(false);
		btnNewButton_38.setIcon(new ImageIcon("GimpFiles\\Countries\\WesternAustralia.png"));
		WesternAustralia.b.setBounds(823, 591, 122, 158);
		frame.add(WesternAustralia.b);
		
		JButton btnNewButton_39 = new JButton((String) null);
		btnNewButton_39.setBorderPainted(false);
		btnNewButton_39.setContentAreaFilled(false);
		btnNewButton_39.setOpaque(false);
		btnNewButton_39.setIcon(new ImageIcon("GimpFiles\\Countries\\EasternAustralia.png"));
		EasternAustralia.b.setBounds(897, 584, 104, 178);
		frame.add(EasternAustralia.b);
		
		JButton btnNewButton_40 = new JButton((String) null);
		btnNewButton_40.setOpaque(false);
		btnNewButton_40.setBorderPainted(false);
		btnNewButton_40.setContentAreaFilled(false);
		btnNewButton_40.setIcon(new ImageIcon("GimpFiles\\Countries\\Indonesia.png"));
		Indonesia.b.setBounds(770, 535, 116, 110);
		frame.add(Indonesia.b);
		
		JButton btnNewButton_41 = new JButton((String) null);
		btnNewButton_41.setOpaque(false);
		btnNewButton_41.setContentAreaFilled(false);
		btnNewButton_41.setBorderPainted(false);
		btnNewButton_41.setIcon(new ImageIcon("GimpFiles\\Countries\\NewGuinea.png"));
		NewGuinea.b.setBounds(866, 542, 98, 72);
		frame.add(NewGuinea.b);
		
		JLabel lblNewLabel = new JLabel((String) null);
		lblNewLabel.setIcon(new ImageIcon("GimpFiles\\Map.png"));
		lblNewLabel.setBounds(0, 29, 1194, 831);
		frame.add(lblNewLabel);
		
		
		
		
	}
	
	public JPanel getFrame(){
		return frame;
	}
}
