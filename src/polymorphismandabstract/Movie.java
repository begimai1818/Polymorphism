package polymorphismandabstract;

public abstract class Movie {
	
	String name;
	double movieLength;
	
	abstract void printMovieInfo();
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(double movieLength) {
		this.movieLength = movieLength;
	}
	
	

}
