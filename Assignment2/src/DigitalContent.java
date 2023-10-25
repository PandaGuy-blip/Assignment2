/***
 * Johnson Seto
 * 20116600
 * COMP503/10
 * Programming Assignment Part B 
 * 
 * DigitalContent 
 * First Class 
 */

public class DigitalContent {
	private String title;
	private String Publisher;
	private String release;
//Title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
//Publisher
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String Publisher) {
		this.Publisher =Publisher;
	}
//Release
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
//Constructor 
	public DigitalContent(String title, String Publisher, String release)
	{
		this.title = title;
		this.Publisher = Publisher;
		this.release = release;
	}
//toString
	public String toString() {
		return "Title: " +this.title+ " Publisher: " +this.Publisher+ 
				" Release Date: " +this.release;
	}
//Boolean 
	public boolean match(String query)
    {
		boolean isEqual = false;
        if(this.title.toLowerCase().contains(query.toLowerCase()) ||  
        		this.Publisher.toLowerCase().contains(query.toLowerCase()) ||  
        		this.release.contains(query.toLowerCase()))
        {
        	isEqual = true;
        }

        return isEqual;
    }
//Last }
}