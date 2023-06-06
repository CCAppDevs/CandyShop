package Game;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class GameState {
	public int Day;
	public double Bank;
	public double Debt;
	public DefaultListModel<Candy> Warehouse;
	public DefaultListModel<Candy> Shop;
	
	public int warehouseSelectedIndex = -1;
	public int shopSelectedIndex = -1;
	
	public GameState() {
		super();
		this.Day = 1;
		this.Bank = 200;
		this.Debt = 0;
		
		this.Warehouse = new DefaultListModel<Candy>();
		this.Warehouse.addElement(new Candy("Jawbreaker", 0.05));
		this.Warehouse.addElement(new Candy("Bubble Gum", 0.05));
		this.Warehouse.addElement(new Candy("Gummy Bears", 0.40));
		this.Warehouse.addElement(new Candy("Chocolate Bar", 1.25));
		
		this.Shop = new DefaultListModel<Candy>();
	}
	
	public boolean buyCandy() {
		Candy purchased = this.Warehouse.getElementAt(warehouseSelectedIndex);
		System.out.println("Buying candy" + purchased.Name);
		
		if (this.Bank < purchased.Cost) {
			return false;
		}
		
		this.Bank = this.Bank - purchased.Cost;
		
		this.Shop.addElement(purchased);
		
		return true;
	}
	
	// removeCandy function

	// next Day function 
}
