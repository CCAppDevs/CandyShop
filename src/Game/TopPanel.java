package Game;

import java.awt.*;
import javax.swing.*;

public class TopPanel extends JPanel {

	private JLabel lblMoney;
	private JLabel lblBank;
	private JLabel lblDebtLabel;
	private JLabel lblDebt;
	
	private double bank;
	private double debt;
	
	public TopPanel() {
		super();
		setPreferredSize(new Dimension(800, 25));
		this.bank = 100;
		this.debt = 0;
		
		this.lblMoney = new JLabel("Money:");
		this.lblBank = new JLabel("$" + this.bank);
		this.lblDebtLabel = new JLabel("Debt:");
		this.lblDebt = new JLabel("$" + this.debt);
		
		add(this.lblMoney, BorderLayout.CENTER);
		add(this.lblBank, BorderLayout.CENTER);
		add(this.lblDebtLabel, BorderLayout.CENTER);
		add(this.lblDebt, BorderLayout.CENTER);
	}
	
}
