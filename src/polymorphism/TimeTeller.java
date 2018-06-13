package polymorphism;

public interface TimeTeller {
	
	boolean CAN_TELL_TIME = true;
	
	default void tellTime() {
		System.out.println("default");
	}
	
	

}
