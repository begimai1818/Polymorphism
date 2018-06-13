package polymorphism;

public class Horse extends Animal {
	
	
	@Override
	public void eat() {
		System.out.println("Horse needs to eat");
		
	}
	
	public static void main(String[] args) {
		
		Horse h1 = new Horse();
		Animal a1 = new Horse();
		Mammal m1 = new Horse();
		Object o1 = new Object();
		h1.eat();
		a1.eat();
		m1.eat();
		
		Animal[] farmAnimal = new Animal[3];
		farmAnimal[0] = new Dog();
		farmAnimal[1] = new Horse();
		farmAnimal[2] = new Cat();
		
		for (Animal each : farmAnimal) {
			
			each.eat();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Animal a2 = h1;
		//Mammal m2 = a2;
		
		//just like using
		//int i =10;
		//long l = i;
		
		
	}
	
//ONLY REFENRENCE TYPE CAN DECIDE WHAT YOU CAN ACCESS

}
