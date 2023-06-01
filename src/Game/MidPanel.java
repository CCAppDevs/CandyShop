package Game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class MidPanel extends JPanel {
	private JPanel LeftPanel;
	private JPanel CenterPanel;
	private JPanel RightPanel;
	
	private JButton btnAdd;
	private JButton btnRemove;
	private JButton btnNextDay;
	
	private JList lstWarehouse;
	private JList lstShop;
	
	private GameState gameState;
	
	public MidPanel(GameState state) {
		super();
		this.gameState = state;
		setPreferredSize(new Dimension(800, 575));
		
		
		this.LeftPanel = new JPanel();

		this.lstWarehouse = new JList(this.gameState.Warehouse.toArray());
		this.lstWarehouse.setPreferredSize(new Dimension(325, 500));
		this.LeftPanel.add(lstWarehouse, BorderLayout.CENTER);
		
		this.CenterPanel = new JPanel();
		this.CenterPanel.setLayout(new BoxLayout(this.CenterPanel, BoxLayout.Y_AXIS));
		
		this.btnAdd = new JButton("Add");
		this.btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				this.gameState.buyCandy(new Candy("Jawbreaker", 0.05));
			}
			
		});
		this.btnAdd.setAlignmentX(CENTER_ALIGNMENT);
		this.CenterPanel.add(this.btnAdd);
		
		this.btnRemove = new JButton("Remove");
		this.btnRemove.setAlignmentX(CENTER_ALIGNMENT);
		this.CenterPanel.add(this.btnRemove);
		
		this.btnNextDay = new JButton("Next Day");
		this.btnNextDay.setAlignmentX(CENTER_ALIGNMENT);
		this.CenterPanel.add(this.btnNextDay);
		
		this.RightPanel = new JPanel();

		this.lstShop = new JList(this.gameState.Shop.toArray());
		this.lstShop.setPreferredSize(new Dimension(325, 500));
		this.RightPanel.add(lstShop);
		
		
		add(this.LeftPanel, BorderLayout.PAGE_START);
		add(this.CenterPanel, BorderLayout.CENTER);
		add(this.RightPanel, BorderLayout.PAGE_END);
	}
	
	
}
