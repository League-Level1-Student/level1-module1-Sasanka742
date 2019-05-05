
public class PigPlusCandy {
	private String make;
	private boolean isChocolatey;
	private double price;
	public PigPlusCandy(String make, boolean isChocolatey, double price) {
		this.make = make;
		this.isChocolatey = isChocolatey;
		this.price = price;
	}
	
	public static void main(String[] args) {
		PigPlusCandy candy = new PigPlusCandy("Willy Wonka", true, 25.00);
	}
}
