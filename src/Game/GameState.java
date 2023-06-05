package Game;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class GameState {
	public int Day;
	public double Bank;
	public double Debt;
	public DefaultListModel<Candy> Warehouse;
	public DefaultListModel<Candy> Shop;
	
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
	
	public boolean buyCandy(Candy item) {
		// do we have enough money to buy the item?
			// if not, return false
		System.out.println("Buying candy" + item.Name);
		
		if (this.Bank < item.Cost) {
			return false;
		}
		
		// subtract the money
		this.Bank = this.Bank - item.Cost;
		
		// add the new candy to the shop
		this.Shop.addElement(item);
		
		return true;
	}
	
	
}
