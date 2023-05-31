package Game;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;


public class MidPanel extends JPanel {
	private JPanel LeftPanel;
	private JPanel CenterPanel;
	private JPanel RightPanel;
	
	private JButton btnAdd;
	private JButton btnRemove;
	
	private JList lstWarehouse;
	private JList lstShop;
	
	private ArrayList<Candy> Warehouse;
	private ArrayList<Candy> Shop;
	
	public MidPanel() {
		super();

		setPreferredSize(new Dimension(800, 575));

		this.Warehouse = new ArrayList<Candy>();
		this.Warehouse.add(new Candy("Jawbreaker", 0.05));
		
		this.Shop = new ArrayList<Candy>();
		this.Shop.add(new Candy("Bubble Gum", 0.05));
		
		this.LeftPanel = new JPanel();

		this.lstWarehouse = new JList(Warehouse.toArray());
		this.lstWarehouse.setPreferredSize(new Dimension(325, 500));
		this.LeftPanel.add(lstWarehouse, BorderLayout.CENTER);
		
		this.CenterPanel = new JPanel();
		this.CenterPanel.setLayout(new BoxLayout(this.CenterPanel, BoxLayout.Y_AXIS));
		
		this.btnAdd = new JButton("Add");
		this.btnAdd.setAlignmentX(CENTER_ALIGNMENT);
		this.CenterPanel.add(this.btnAdd);
		
		this.btnRemove = new JButton("Remove");
		this.btnRemove.setAlignmentX(CENTER_ALIGNMENT);
		this.CenterPanel.add(this.btnRemove);
		
		this.RightPanel = new JPanel();

		this.lstShop = new JList(Shop.toArray());
		this.lstShop.setPreferredSize(new Dimension(325, 500));
		this.RightPanel.add(lstShop);
		
		
		add(this.LeftPanel, BorderLayout.PAGE_START);
		add(this.CenterPanel, BorderLayout.CENTER);
		add(this.RightPanel, BorderLayout.PAGE_END);
	}
	
	
}
