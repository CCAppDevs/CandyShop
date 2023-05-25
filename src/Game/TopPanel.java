package Game;

import java.awt.*;
import javax.swing.*;

public class TopPanel extends JPanel {

	private JLabel lblMoney;
	private JLabel lblBank;
	private double bank;
	
	public TopPanel() {
		super();
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.bank = 100;
		
		this.lblMoney = new JLabel("Money:");
		this.lblBank = new JLabel("$" + this.bank);
		
		add(this.lblMoney);
		add(this.lblBank);
	}
	
}
