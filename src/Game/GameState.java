package Game;

import java.util.ArrayList;

public class GameState {
	public int Day;
	public double Bank;
	public double Debt;
	public ArrayList<Candy> Warehouse;
	public ArrayList<Candy> Shop;
	
	public GameState() {
		super();
		this.Day = 1;
		this.Bank = 200;
		this.Debt = 0;
		
		this.Warehouse = new ArrayList<Candy>();
		this.Warehouse.add(new Candy("Jawbreaker", 0.05));
		this.Warehouse.add(new Candy("Bubble Gum", 0.05));
		this.Warehouse.add(new Candy("Gummy Bears", 0.40));
		this.Warehouse.add(new Candy("Chocolate Bar", 1.25));
		
		this.Shop = new ArrayList<Candy>();
		// TODO: add some candy
	}
	
	public boolean buyCandy(Candy item) {
		// do we have enough money to buy the item?
			// if not, return false
		if (this.Bank < item.Cost) {
			return false;
		}
		
		// subtract the money
		this.Bank = this.Bank - item.Cost;
		
		// add the new candy to the shop
		this.Shop.add(item);
		
		return true;
	}
	
	
}
