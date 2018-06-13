package polymorphismandabstract;

public class MovieManager {

	public static void main(String[] args) {
		
		Movie m1 = new Action("Taken", 2.30, 9);
		Movie m2 = new Drama("Caillou", 3.0, 7);
		Action m3 = new Action("Titanic", 2.50, 7);
		
		displayMovieInfo(m1);
		displayMovieInfo(m2);
		displayMovieInfo(m3);
		
		displayMovieInfo(new Drama("Vienna", 1.30, 10));
		
	}
	
		public static void displayMovieInfo(Action m) {
			m.printMovieInfo();
			System.out.println("first method");
		}
			
	
		public static void displayMovieInfo(Movie m) {
			m.printMovieInfo();
			System.out.println("second method");
		}
		
	
		static Movie getTitanicMovie() {
			Action m = new Action("Taken", 2.30, 9);
			return m;
		}
		
		
		
		
		
		
		
	
}
