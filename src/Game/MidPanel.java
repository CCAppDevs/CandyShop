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
	
	private GameActionButton btnAdd;
	private GameActionButton btnRemove;
	private GameActionButton btnNextDay;
	
	private JList lstWarehouse;
	private JList lstShop;
	
	private GameState gameState;
	
	public MidPanel(GameState state) {
		super();
		this.gameState = state;
		setPreferredSize(new Dimension(800, 575));
		
		
		this.LeftPanel = new JPanel();

		this.lstWarehouse = new JList(this.gameState.Warehouse);
		this.lstWarehouse.setPreferredSize(new Dimension(325, 500));
		this.LeftPanel.add(lstWarehouse, BorderLayout.CENTER);
		
		this.CenterPanel = new JPanel();
		this.CenterPanel.setLayout(new BoxLayout(this.CenterPanel, BoxLayout.Y_AXIS));
		
		this.btnAdd = new GameActionButton("Add", this.gameState, "add");
		this.CenterPanel.add(this.btnAdd);
		
		this.btnRemove = new GameActionButton("Remove", this.gameState, "remove");
		this.CenterPanel.add(this.btnRemove);
		
		this.btnNextDay = new GameActionButton("Next Day", this.gameState, "next");
		this.CenterPanel.add(this.btnNextDay);
		
		this.RightPanel = new JPanel();

		this.lstShop = new JList(this.gameState.Shop);
		this.lstShop.setPreferredSize(new Dimension(325, 500));
		this.RightPanel.add(lstShop);
		
		
		add(this.LeftPanel, BorderLayout.PAGE_START);
		add(this.CenterPanel, BorderLayout.CENTER);
		add(this.RightPanel, BorderLayout.PAGE_END);
	}
}
