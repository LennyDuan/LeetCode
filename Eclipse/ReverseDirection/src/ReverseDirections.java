
public class ReverseDirections {

	public static void main(String[] args) {
		String [] directions = Directions.getDirections();
		System.out.println("----------Directions------------");
		Directions.print(directions);
		String [] reverseDirections = reverseDirections(directions);
		System.out.println("\n------Reversed Directions-------"); 
		Directions.print(reverseDirections);
	}

	public static String[] reverseDirections (String[] dir) { 
		int lastLineNumber = dir.length - 1;
		String [] reversed = new String[dir.length];
		reversed[lastLineNumber] = changeFirstLine(dir); 
		reversed[0] = changeLastLine(dir);
		if (lastLineNumber >= 2) {
			reversed[reversed.length - 2] = changeLineBeforeLastLine(dir); 
			reverseOtherLines(dir, reversed);
		}
		return reversed;
	}
	
	// Create function reverseOtherLines
	public static void reverseOtherLines(String[] dir, String[] reversed) {
		// Loop the innerlines 
		for(int line = 1; line < dir.length - 2; line++) {
			String changedLine = dir[dir.length - 2 - line];
			// replace 'left' to 'RIGHT' and 'right' to 'LEFT
			if (changedLine.contains("left")) {
				reversed[line] = changedLine.replace("left", "RIGHT");
			} else if (changedLine.contains("right")) {
				reversed[line] = changedLine.replace("right", "LEFT");
			}
		}
	};
	
	public static String changeFirstLine(String[] lines) {
		String changedLine = "";
		// Call the changeCompassDirection method to change the facing direction changedLine = changeCompassDirection(lines[0]);
		// add missing function: changeCompassDirection
		changedLine = changeCompassDirection(lines[0]);
		// Call the StopStart method to change Start to Stop
		changedLine = changeStopStart(changedLine);
		// find the index of the character ":"
		int ind = changedLine.indexOf(":");
		// clear the line number "1" and save the String
		changedLine = changedLine.substring(ind).trim();
		// change the direction line number from 1 to last line
		changedLine = lines.length + changedLine;
		// find the index of the first period "."
		int indexOfPeriod1 = changedLine.indexOf(".");
		// Get rid of the Drive x miles
		changedLine = changedLine.substring(0, indexOfPeriod1 + 1);
		return changedLine; 
	}
	
	public static String changeLastLine(String[] lines) {
		String changedLine = "";
		// CallchangeCompassDirection method to change the facing direction changedLine = changeStopStart(changedLine); 
		changedLine = changeCompassDirection(lines[lines.length - 1]); 
		// Call the StopStart method to change Start to Stop
		// add missing function: changeStopStart
		changedLine = changeStopStart(changedLine);
		int indexOfPeriod2 = lines[lines.length - 2].indexOf("."); 
		// find the index of the first period "."
		String milesFirstLine = lines[lines.length - 2].substring(indexOfPeriod2+ 1);
		// Grab the Drive x miles part of previous line and save it as a new String 
		changedLine = changedLine + milesFirstLine; 
		// Concatenate the last direction line with the milesFirstLine String from previous direction line
		int ind = changedLine.indexOf(":");
		// find the index of the character ":"
		changedLine = changedLine.substring(ind).trim(); 
		// clear the line number "5" and save the String
		changedLine = "1" + changedLine; 
		// Change the line number of the last line to be the first line and save the String
		return changedLine;
	}
	
	public static String changeLineBeforeLastLine(String[] lines){ 
		String changedLine = "";
		String newTurnDirection = "";
		String directionOne = lines[0];
		int addressStart = directionOne.indexOf("at");
		int addressEnd = directionOne.indexOf("facing");
		int startOfDrive = directionOne.indexOf(".");
		String justStreet = directionOne.substring(addressStart + 5, addressEnd).trim();
		String milesDrivePart = directionOne.substring(startOfDrive + 2).trim(); 
		newTurnDirection = turnLeftRight(lines[1]);
		changedLine = (lines.length - 1) + ": Turn "+ newTurnDirection
		+ " on " + justStreet + ". " + milesDrivePart; return changedLine;
	}
	
	public static String changeCompassDirection(String line){ 
		String changedLine = "";
		changedLine = line;
		if (changedLine.contains("north")){
	       changedLine = changedLine.replace("north", "SOUTH");
	    }
		else if (changedLine.contains("south")) {
			changedLine = changedLine.replace("south", "NORTH");
		}
		if (changedLine.contains("east")){
			changedLine = changedLine.replace("east", "WEST");
		}
		else if (changedLine.contains("west")) {
            changedLine = changedLine.replace("west", "EAST");
        }
		return changedLine;
	}
	
	public static String changeStopStart(String line) { 
		String changedLine = "";
		changedLine = line;
		if (changedLine.contains("Start")) {
		    changedLine = changedLine.replace("Start", "STOP");
		}
		else if (changedLine.contains("Stop")) {
			changedLine = changedLine.replace("Stop", "START");
		}
		return changedLine;
	}
	
	private static String turnLeftRight(String line) { 
		String turnValue = "";
		if (line.contains("left")) {
		    turnValue = "RIGHT";
		}
		else {
			turnValue = "LEFT";
		}
	return turnValue;
	}

}
