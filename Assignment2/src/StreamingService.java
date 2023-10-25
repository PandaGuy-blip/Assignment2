import java.util.ArrayList;

/***
 * Johnson Seto
 * 20116600
 * COMP503/10
 * Programming Assignment Part B 
 * 
 * StreamingService 
 */

public class StreamingService{
//Array list
	private ArrayList<DigitalContent> list;
//Constructor 
	public StreamingService()
	{
		list = new ArrayList<>();
	}
//AddMethod
	public void add(DigitalContent add)  {
        if (this.list == null) {
            this.list = new ArrayList<DigitalContent>();
        }
        this.list.add(add);
    }
//Boolean Method
	public ArrayList<DigitalContent> match(String query) {
		ArrayList<DigitalContent> match = new ArrayList<>();
		
		for(DigitalContent l : list) {
			if(l.match(query))
				match.add(l);
		}
		return match;
	}

//toString
	public String toString() {
	    String results = "";
	    for(DigitalContent l : list) {
	        results += l.toString() +"\n";
	    }
	    return results;
	  }
}
