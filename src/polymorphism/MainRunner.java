package polymorphism;

public class MainRunner {

	public static void main(String[] args) {
	
		Shirt sh = new Shirt("Tommy Hilfiger", 100.0, 's');
		
		ClothingItem item = sh;
		ClothingItem item1 = new ClothingItem("Vest", 70.0);
		ClothingItem item2 = new Shirt("MK", 70.0, 'S');
		//reference			//object
		Hat hat = new Hat("Gucci", 800.0, "Classic");
		
		System.out.println(item2.toString());
		System.out.println(item1.toString());
		System.out.println(hat.toString());
		sh.printShirtInfo();
		hat.printHatInfo();
		//ONLY REFERENCE TYPE DECIDE ONLY WHAT FIELD AND WHAT METHOS IS ACCESSIBLE
		
		//FOR FIELD:
		//IF WE HAVE SuperType s = new SubType();
		// Electronic e = new Computer();
		//only the 
		
		
		
		

	}

}
