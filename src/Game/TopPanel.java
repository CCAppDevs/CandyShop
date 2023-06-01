package Game;

import java.awt.*;
import javax.swing.*;

public class TopPanel extends JPanel {

	private JLabel lblMoney;
	private JLabel lblBank;
	private JLabel lblDebtLabel;
	private JLabel lblDebt;

	private GameState gameState;
	
	public TopPanel(GameState state) {
		super();
		
		this.gameState = state;

		setPreferredSize(new Dimension(800, 25));
		
		this.lblMoney = new JLabel("Money:");
		this.lblBank = new JLabel("$" + this.gameState.Bank);
		this.lblDebtLabel = new JLabel("Debt:");
		this.lblDebt = new JLabel("$" + this.gameState.Debt);
		
		add(this.lblMoney, BorderLayout.CENTER);
		add(this.lblBank, BorderLayout.CENTER);
		add(this.lblDebtLabel, BorderLayout.CENTER);
		add(this.lblDebt, BorderLayout.CENTER);
	}
	
}
