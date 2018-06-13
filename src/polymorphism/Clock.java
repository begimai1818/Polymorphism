package polymorphism;

public class Clock implements TimeTeller{
	
	static boolean CAN_TELL_TIME = false;

	@Override
	public void tellTime() {
		System.out.println("Telling time");
		
	}
	public static void main(String[] args) {
		
		TimeTeller d = new Clock();
		
		System.out.println(d.CAN_TELL_TIME);
		System.out.println(TimeTeller.CAN_TELL_TIME);
		d.tellTime();
	}

}

