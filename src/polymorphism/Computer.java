package polymorphism;

public class Computer extends Electronic{
	int memorySize = 10;
	public static void main(String[] args) {
		
		Electronic e = new Computer();
		System.out.println(e.memorySize);
		e.doSomething();
		e.printMemorySize();
		
	}
	@Override
	void printMemorySize() {
		System.out.println("from Computer: " + memorySize);
	}
	
	static void doSomething() {
		System.out.println("do computer stuff");
	}
	
	
}
class Electronic{
	
	int memorySize = 100;
	
	void printMemorySize() {
		System.out.println("from Electronic: " + memorySize);
	}
	static void doSomething() {
		System.out.println("do electronic stuff");
	}
	
	
}
