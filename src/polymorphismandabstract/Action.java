package polymorphismandabstract;

public class Action extends Movie {
	
	int actionLevel;


	public Action(String name, double movieLength, int actionLevel) {
		super();
		this.actionLevel = actionLevel;
		this.name = name;
		this.movieLength = movieLength;
		
	}
	
	@Override
	void printMovieInfo() {
		System.out.println("All movie name : " + name + " movieLength: " 
	+  movieLength + " actionLevel: " +  actionLevel);
		
	}
	
	
	
	
	

}
