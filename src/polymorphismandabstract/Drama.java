package polymorphismandabstract;

public class Drama extends Movie {

	int dramaLevel;
	
	public Drama(String name, double movieLength, int dramaLevel) {
		super();
		this.dramaLevel = dramaLevel;
		this.name = name;
		this.movieLength = movieLength;
		
	}
	
	@Override
	void printMovieInfo() {
		System.out.println("All movie Information: "  );
		
		
	}

}
