package Window;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import Player.Player;
import World.Country;

public class CountryButton{
	public String name;
	public BufferedImage image;
	public JButton b;
	public Country country;
	private JLabel label;
	
	public CountryButton(BufferedImage i, String name, Country c){
		this.image = i;
		this.country = c;
		c.setButton(this);
		this.name = name;
		
		this.label = new JLabel(1 + ""); // defining the label that will say the number of troops
		this.label.setHorizontalAlignment(SwingConstants.CENTER);
		this.label.setForeground(Color.RED);
		this.label.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		this.b = new JButton(new ImageIcon(image)) {
	        @Override
	        public boolean contains(int x, int y) {
	            Rectangle viewRect = getBounds();
	            Insets insets = getInsets();
	            viewRect.x = insets.left;
	            viewRect.y = insets.top;
	            viewRect.width -= insets.left + insets.right;
	            viewRect.height -= insets.top + insets.bottom;
	            Rectangle iconR = new Rectangle();
	            SwingUtilities.layoutCompoundLabel(this, this.getFontMetrics(this.getFont()), this.getText(), this.getIcon(),
	                    this.getVerticalAlignment(), this.getHorizontalAlignment(), this.getVerticalTextPosition(),
	                    this.getHorizontalTextPosition(), viewRect, iconR, new Rectangle(), this.getIconTextGap());
	            if (!iconR.contains(x, y)) {
	                return false;
	            }
	            x -= iconR.x;
	            y -= iconR.y;
	            Color c = new Color(image.getRGB(x, y), true);
	            return c.getAlpha() != 0 && (c.getRed() < 255 || c.getGreen() < 255 || c.getBlue() < 255);
	        }
	    };
	    b.setOpaque(false);
	    b.setContentAreaFilled(false);
	    b.setBorderPainted(false);
	    b.addActionListener(new ActionListener(){
	    	@Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(b, "You clicked on the " + country.getName() + " button");
            }
	    });
	}
	
	
	public void setDoubleBounds(int x, int y, int w, int h) {
		this.b.setBounds(x, y, w, h);
		this.label.setBounds(x, y, w, h);
	}
	
	public JLabel getLabel()  {
		return this.label;
	}
	
	public void updateLabel(Player p) {
		this.label.setText("" + this.country.getTroops().size());
		this.label.setForeground(p.getColor());
	}
	
	
}