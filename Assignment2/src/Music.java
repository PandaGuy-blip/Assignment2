/***
 * Johnson Seto
 * 20116600
 * COMP503/10
 * Programming Assignment Part B 
 * 
 * Music
 * Extends DigitalContent 
 */

public class Music extends DigitalContent{
//Variables
	private String artist;
//Getter
	public String getArtist() {
		return artist;
	}
//Setter
	public void setArtist(String artist) {
		this.artist = artist;
	}
//Constructor 
	public Music(String title, String Publisher, String release, String artist)
	{
		super(title, Publisher, release);
		
		this.setArtist(artist);
	}
//toString 
	public String toString(){
		return super.toString() + " Artist: " +this.artist;
	}
//Override
	public boolean match(String query)
	{
		super.match(query);
		boolean isEqual = false;
		if(query != null) {
			if(this.artist.toLowerCase().contains(query.toLowerCase()))
					{
				isEqual = true;
					}
		}
		return isEqual;	
	}
}
