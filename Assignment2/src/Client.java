import java.util.Scanner;

/***
 * Johnson Seto
 * 20116600
 * COMP503/10
 * Programming Assignment Part B 
 * 
 * Client Class
 * Main Method 
 */
//Interface
interface Play {
//public DigitalContent getCurrentStream(), 
	  public DigitalContent getCurrentStream(); 
//public void stream(String query);
	  public void stream(String query);
//public void stop();	  
	  public void stop();
	}

public class Client implements Play{
//Variables
	private DigitalContent currentlyStreamed;
	private StreamingService service; 
//Constructor
	public Client(StreamingService service) {
	this.service = service; 
	this.currentlyStreamed = null;
		}
//GetCurrentStream
	public DigitalContent getCurrentStream(){
		return this.currentlyStreamed;
	}
//Stream(String query)
	public void  stream(String query)
	{
		//If not empty 
		if(!service.match(query).isEmpty())
		{
			currentlyStreamed = service.match(query).get(0);
		}
		else
		{
			System.out.println("Nothing is currently streaming \n");
		}
	}
//Stop
//	Will set currentlyStreamed to null
	public void stop()
	{
		this.currentlyStreamed = null;
	}
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		StreamingService streamingservice = new StreamingService();
		streamingservice.add(new Film("Jumanji", "Disney", "2020", "Patrick"));
		streamingservice.add(new Film("Peter Pan", "Warner Bros", "2002", "Spongebob"));
		streamingservice.add(new Film("Shrek", "Warner Bros", "2002", "Donkey"));
		streamingservice.add(new Film("Spider-Man", "Marvel", "2005", "Tony"));
		streamingservice.add(new Film("Sonic", "Warner Bros", "2020", "Tails"));
		streamingservice.add(new Music("MegaMind", "Pixel", "2010", "Taylor Swift"));
		streamingservice.add(new Music("Avengers", "Marvel", "2012", "Adele"));
		streamingservice.add(new Music("Big Hero 6", "Pixel", "2014", "Legends"));
		streamingservice.add(new Music("Ratatouille", "Pixel", "2000", "Beyonce"));
		streamingservice.add(new Music("Frozen", "Disney", "2018", "J Cole"));
		Client client = new Client(streamingservice);			
//		A. Display Digital Content library 
//		B. Display currently streaming DigitalContent 
//		C. Match Digital Content to Stream 
//		D. Stop streaming 
//		E. Quit Client Application
		int exit_char = 0;
		
		while (exit_char < 1) {
			System.out.println("A. Display inventory \r\n"
					+ "B. Display currently streaming DigitalContent \r\n"
					+ "C. Match Digital Content to Stream \r\n"
					+ "D. Stop Streaming \r\n"
					+ "E. Exit ");
			char user_char = keyboard.next().charAt(0);
			//A Display inventory
			if(user_char == 'A') {
				System.out.println(streamingservice.toString());
		//LAST } FOR A
			} 
			//B Display currently streaming DigitalContent
			if(user_char == 'B') {
				System.out.println("This is what is currently streaming!");
				if(!(client.getCurrentStream() == null))
				{
					System.out.println(client.getCurrentStream() + "\n");
				}
				else {
					System.out.println("Nothing is currently streaming \n");
					}
		//LAST } FOR B
				}
			//C Match Digital Content to Stream
			if(user_char == 'C')
			{
				System.out.println("Match Digital Content to Stream");
				System.out.println("What movie are you trying to find?");
				String results = keyboard.next();
				client.stream(results);
		//LAST } FOR C	
			}
			//D Stop Streaming
			if(user_char == 'D')
			{
				System.out.println("Stop Streaming \n");
				client.stop();
		//E LAST } FOR D
			}
			if(user_char == 'E')
			{
				exit_char ++;
		//LAST } FOR E AND STOPS PROGRAM
			}
//While END}
		}
		System.out.println("That's the end folks!");
		
	keyboard.close();
//Main
	}
//Last
}
