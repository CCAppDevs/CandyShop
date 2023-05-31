package Game;

public class Candy {
	public String Name;
	public double Cost;
	public double Price;
	
	public Candy(String name, double cost) {
		super();
		Name = name;
		Cost = cost;
		Price = 0;
	}

	@Override
	public String toString() {
		return Name + ", " + Cost;
	}
	
	
}
