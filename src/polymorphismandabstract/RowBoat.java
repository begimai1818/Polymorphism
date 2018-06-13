package polymorphismandabstract;

public class RowBoat  extends Boat{

	int paddleCount;
	
	@Override
	public void move() {
		System.out.println("Move RowBoat");
	
	}
	
	public void row() {
		System.out.println("rowing");
	}

	@Override
	public void aFloat() {
		System.out.println("RowBoat Floating");
	
	}

}
