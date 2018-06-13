package polymorphismandabstract;

public class WaterFun {

	public static void main(String[] args) {
		
		
		Boat b1 = new SailBoat();
		Boat b2 = new RowBoat();
		
		SailBoat s1 = new SailBoat();
		Boat b3  = s1;
		System.out.println(b1.capacity);
		
		b1.move();
		b1.aFloat();
		b2.aFloat();
		
		
//		Boat[] boats1 = new Boat[] {b1,b2,b3};
//		Boat[] boats2 = {b1,b2,b3};
//		
		Boat[] boats = new Boat[3];
		boats[0] = b1;
		boats[1] =  b2;
		boats[2] = b3;
		
		
		for (int i = 0; i < boats.length; i++) {
			boats[i].move();
			
		}
		
		Floatable f1 = new SailBoat();
		Floatable f2 =  new RowBoat();
		Floatable f3 = new Duck();
		
		f1.aFloat();//from subClass we are calling because Interface has no body
		
		Floatable[] floating = new Floatable[] {f1,f2,f3};
		floating[0]=f1;
		floating[1]=f2;
		floating[2] = f3;
		
		for (Floatable each : floating) {
			each.aFloat();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
