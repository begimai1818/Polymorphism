package polymorphism;

public class Hat extends ClothingItem {
	
	String type;
	
	public Hat(String name, double price, String type) {
		super(name, price);
		this.type = type;
	}
	
//	@Override
//	public String toString() {
//		
//		return "Hat [name=" + name + ",price= "+ price ;
//	}
	
	public void printHatInfo() {
		System.out.println("Printing Hat Info");
	}

	@Override
	public String toString() {
		return "Hat [type=" + type + ", price= " + price + ",name=" + name + "]";
	}

	
	}

	



