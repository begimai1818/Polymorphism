package polymorphismandabstract;

public class SailBoat extends Boat {

	double width;
	
	
	@Override
	public void move() {
		System.out.println("Move SailBoat");
		
	}

	public void sail() {
		System.out.println("sailing");
	}

	@Override
	public void aFloat() {
		System.out.println("Floating SailBoat");
		
	}
	
}
