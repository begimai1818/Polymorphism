package polymorphism;

public class Shirt extends ClothingItem {
	
	char size;
	
	public Shirt(String name, double price, char size) {
		super(name, price);
		this.size =  size;
		
	}
	@Override
	public String toString() {
		
		return "Shirt [name=" + name + ",price= "+ price ;
	}
	
	public void printShirtInfo() {
		System.out.println("Printing Shirt Info");
	}
	
	

}
