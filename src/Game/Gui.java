package Game;

import java.awt.*;
import javax.swing.*;


public class Gui extends JFrame {
	
	private JPanel mainPanel;
	private TopPanel topPanel;
	private JPanel midPanel;

	public Gui() {
		setMinimumSize(new Dimension(800, 600));
		
		// setup panels
		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));
		add(this.mainPanel);
		
		this.topPanel = new TopPanel();
		this.mainPanel.add(this.topPanel);
		
		this.midPanel = new JPanel();
		this.midPanel.setLayout(new BoxLayout(this.midPanel, BoxLayout.X_AXIS));
		this.mainPanel.add(this.midPanel);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gui();
	}

}