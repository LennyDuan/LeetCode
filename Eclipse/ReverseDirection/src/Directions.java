
import java.text.DecimalFormat;

/**
 *Class provides a static method
 *			public static String[] getDirections()
 * that generates and returns an array containing random directions of the  format:
 *  1: Start at 34 Flat Street facing north. Drive 15 miles.
 *  2: Turn left on Morning Light Drive. Drive 4 miles.
 *  3: Turn right on South Park Lane. Drive 3.3 miles.
 *  4: Turn right on San Francisco Lane. Drive 0.4 miles.
 *  5: Stop at 17 San Francisco Lane facing west. 	
*/
public class Directions {

	private static String[] AllStreets = { "Main Street", "Russel Road", 
		"Hampshire Street", "Lagrange Street", "Arlington Street", "Cambridge Street",
		"Frog Pond Road", "Ridge Street", "Forest Street", "Mass Avenue",
		"New England Parkway", "Johnson Road", "Old Country Road", "Franklin Street",
		"Washington Street", "Prospect Street","Michigan Avenue", "River Street", "Western Avenue",
		"Morning Light Drive", "Evening Sunset Avenue", "Boylston Street",
		"Lexington Street"};
	private static String[] streets = new String[AllStreets.length];
	private static String lastStreet = "";
	
	 
	public static void main(String[] args) {
		String[] directions = getDirections();
		print(directions);
	}
 
	/**public static void print(String[] )
	 * prints out all elements of the string array that's passed in. */
	public static void print(String[] directions){
		for (int i = 0; i< directions.length; i++)
			System.out.println(directions[i]);
	}


	/**	public static String[] getDirections()
			- returns an array with randomly generated 
			lines of driving directions as described in the intro comments.
			The returned array is guaranteed to consist of at least 2 elements.		
	 */
	public static String[] getDirections(){
		initStreets();  // initialize the array of streets
		double random = Math.random(); // generate the size of list
		int numItems = (int) (random*(streets.length-3))+2;
		
		// generate the lines of directions
		String [] strDirections = new String [numItems];
		strDirections[0]="1: " + startLine();  // first line
		for (int i = 1; i<= numItems-2; i++)
			strDirections[i] =(i + 1) +": Turn " + leftRight() + " on " +
							generateStreet()+ ". " + generateDistance();		
		strDirections[numItems-1]=numItems +": "+ endLine(); // last line
			
		return strDirections;
	}
	
	
	///===========Private methods===================================
	
	/**	private static void initStreets(){	
	 *  initializes the streets array to be used for generating the directions
	 */
	private static void initStreets(){		
		for (int i = 0; i< AllStreets.length; i++)
			streets[i]=AllStreets[i];
	}
	
	/** private static String leftRight()
	 *   Returns a randmoly generated direction(left or right) */
	private static String leftRight(){
		if (Math.random()>=0.5) return "left";
		else return "right";
	}
	/**	private static String generateDistance ()
	 *    Returns a randmoly generated  distance	
	 */
	private static String generateDistance (){
		double random = Math.random()*100;
		String strDistance = new DecimalFormat("0.0").format(random);
		return "Drive "+  strDistance + " miles.";
	}
	
	/**	private static String generateStreet ()
	 *  Returns a randmoly generated street */
	private static String generateStreet (){
		double random;
		int randInd ;
		// pick an element from the streets array that is not null
		do{
			random = Math.random();	
			randInd = (int) (random*streets.length);
			//System.out.println(randInd);
		}
		while (streets[randInd] == null);
		String result = 	streets[randInd];	
		lastStreet  = result; // record this as the latest street picked  
		// set the picked element of street array to null so the same  
		// street is not repeated again!
		streets[randInd] = null;
		return result;
	}
	
	/**		private static String  startLine (){
	 *  Returns a randmoly generated first line of directions */
	private static String  startLine (){
		return "Start at "
		+ (int)(Math.random()*100) +  " " + generateStreet() + " facing " + direction() 
		+ " " +generateDistance()	;
	}

	/**		private static String  endLine (){
	 *  Returns a randmoly generated last line of directions */
	private static String  endLine (){
		return "Stop at " + 
		(int)(Math.random()*100)+ " " + lastStreet  + " facing " + direction();
	}

	/**		private static String direction()
	 *  Returns a randmoly generated  direction : north, south, east or west */
	private static String direction(){
		String direction = "north.";
		double randVal = Math.random();
		if (randVal>=0.75)
			direction = "south.";
		else if (randVal <0.75 && randVal >=0.5)
			direction = "west.";
		else if (randVal <0.5 && randVal >=0.25)
			direction = "east.";
		return direction;
	}
}
