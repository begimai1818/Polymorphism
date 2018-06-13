package polymorphismandabstract;

public class ReferenceTypeParameters {
	public static void main(String[] args) {
		
		printStuff(new String("abc"));
		Object o = new String("aaa");
		printStuff(o);
	}

	static void printStuff(String s) {
		System.out.println("String method " + s.charAt(0) );
	}
	
	static void printStuff(Object o) {
		System.out.println("Object method");
	}
}
