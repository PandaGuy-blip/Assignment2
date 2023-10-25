/***
 * Johnson Seto
 * 20116600
 * COMP503/10
 * Programming Assignment Part B 
 * 
 * Film 
 * Extends DigitalContent
 */

public class Film extends DigitalContent{
//Variables
	private String cast;
//Getters
	public String getCast() {
		return cast;
	}
//Setters
	public void setCast(String cast) {
		this.cast = cast;
	}
//Constructor 
	public Film(String title, String Publisher, String release, String cast)
	{
		super(title, Publisher, release);
		
		this.setCast(cast);
	}
//toString 
	public String toString(){
		return super.toString() + " Cast: " +this.cast;
	}
//Override 
	public boolean match(String query)
	{
		super.match(query);
		boolean isEqual = false;
		if(query != null) {
			if(this.cast.toLowerCase().contains(query.toLowerCase()))
					{
				isEqual = true;
					}
		}
		return isEqual;	
	}
}
