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
					JFrame frame1 = new JFrame();
					frame1.setResizable(false);
					frame1.setTitle("Risk - The Game of Global Domination");
					frame1.getContentPane().setBackground(Color.LIGHT_GRAY);
					frame1.setBounds(100, 100, 1200, 900);
					frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame1.setVisible(true);
					frame1.getContentPane().setLayout(new CardLayout(0, 0));
					
					JPanel thing = new JPanel();
					thing.setLayout(null);
					Game window = new Game(thing);
					frame1.getContentPane().add(thing);
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
		
		int x = 9;
		int y = 165;
		
		Alaska.b.setBounds(x, y, 101, 100);
		frame.add(Alaska.b);
		
		
		NWTerritory.b.setBounds(x + 75, y - 18, 175, 83);
		frame.add(NWTerritory.b);
		
		
		Quebec.b.setBounds(x + 231, y + 50, 87, 118);
		frame.add(Quebec.b);
		
		
		Alberta.b.setBounds(x + 83, y + 58, 96, 71);
		frame.add(Alberta.b);
		
		
		Ontario.b.setBounds(x + 166, y + 57, 75, 90);
		frame.add(Ontario.b);
		
		
		EasternUS.b.setBounds(x + 151, y + 125, 127, 118);
		frame.add(EasternUS.b);
		
		
		WesternUS.b.setBounds(x + 90, y + 123, 101, 100);
		frame.add(WesternUS.b);
		
		
		CenAm.b.setBounds(x + 93, y + 197, 107, 118);
		frame.add(CenAm.b);
		
		
		Venezuela.b.setBounds(x + 170, y + 278, 127, 71);
		frame.add(Venezuela.b);
		
		
		Argentina.b.setBounds(x + 202, y + 408, 94, 175);
		frame.add(Argentina.b);
		
		
		Brazil.b.setBounds(x + 191, y + 310, 188, 168);
		frame.add(Brazil.b);
		
		
		Peru.b.setBounds(x + 158, y + 322, 128, 128);
		frame.add(Peru.b);
		
		
		NorthAfrica.b.setBounds(x + 371, y + 269, 168, 163);
		frame.add(NorthAfrica.b);
		
		
		Congo.b.setBounds(x + 481, y + 384, 101, 100);
		frame.add(Congo.b);
		
		
		SouthAfrica.b.setBounds(x + 491, y + 450, 116, 132);
		frame.add(SouthAfrica.b);
		
		
		EastAfrica.b.setBounds(x + 530, y + 338, 116, 160);
		frame.add(EastAfrica.b);
		
		
		Egypt.b.setBounds(x + 485, y + 276, 100, 83);
		frame.add(Egypt.b);
		
		
		Madagascar.b.setBounds(x + 585, y + 455, 78, 110);
		frame.add(Madagascar.b);
		
		
		Greenland.b.setBounds(x + 200, y - 50, 198, 133);
		frame.add(Greenland.b);
		
		
		Iceland.b.setBounds(x + 368, y + 42, 87, 81);
		frame.add(Iceland.b);
		
		
		Britain.b.setBounds(x + 339, y + 92, 116, 96);
		frame.add(Britain.b);
		
		
		Scandinavia.b.setBounds(x + 429, y + 12, 120, 112);
		frame.add(Scandinavia.b);
		
		
		Ukraine.b.setBounds(x + 512, y + 12, 158, 224);
		frame.add(Ukraine.b);
		
		
		WesternEurope.b.setBounds(x + 373, y + 172, 90, 116);
		frame.add(WesternEurope.b);
		
		
		NorthernEurope.b.setBounds(x + 424, y + 107, 118, 94);
		frame.add(NorthernEurope.b);
		
		
		SouthernEurope.b.setBounds(x + 449, y + 175, 100, 114);
		frame.add(SouthernEurope.b);
		
		
		MiddleEast.b.setBounds(x + 527, y + 222, 160, 153);
		frame.add(MiddleEast.b);
		
				
		Afghanistan.b.setBounds(x + 607, y + 121, 121, 120);
		frame.add(Afghanistan.b);
		
		
		India.b.setBounds(x + 666, y + 214, 122, 172);
		frame.add(India.b);
		
		
		Siam.b.setBounds(x + 770, y + 268, 82, 104);
		frame.add(Siam.b);
		
		
		China.b.setBounds(x + 705, y + 144, 172, 154);
		frame.add(China.b);
		
		
		Mongolia.b.setBounds(x + 764, y + 111, 144, 96);
		frame.add(Mongolia.b);
		
		
		Ural.b.setBounds(x + 653, y - 11, 86, 178);
		frame.add(Ural.b);
		
		
		Siberia.b.setBounds(x + 676, y - 44, 124, 210);
		frame.add(Siberia.b);
		
		
		Irkutsk.b.setBounds(x + 756, y + 54, 112, 86);
		frame.add(Irkutsk.b);
		
		
		Yakutsk.b.setBounds(x + 772, y - 26, 104, 94);
		frame.add(Yakutsk.b);
		
		
		Kamchatka.b.setBounds(x + 829, y - 14, 302, 172);
		frame.add(Kamchatka.b);
		
		
		Japan.b.setBounds(x + 883, y + 108, 68, 118);
		frame.add(Japan.b);
		
		
		WesternAustralia.b.setBounds(x + 816, y + 414, 122, 158);
		frame.add(WesternAustralia.b);
		
		
		EasternAustralia.b.setBounds(x + 890, y + 407, 104, 178);
		frame.add(EasternAustralia.b);
		
		
		Indonesia.b.setBounds(x + 763, y + 358, 116, 110);
		frame.add(Indonesia.b);
		
		
		NewGuinea.b.setBounds(x + 859, y + 365, 98, 72);
		frame.add(NewGuinea.b);
				
	}
	
	public JPanel getFrame(){
		return frame;
	}
}
