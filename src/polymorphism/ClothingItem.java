package polymorphism;

public class ClothingItem {
	
	String name;
	double price;
	
	public ClothingItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		//System.out.println("Displaying ClothingItem");
		return "ClothingItem [name=" + name + ",price= "+ price ;
	}
	
	
	
	

}
