/*
 *  Person Class
 *  Written By: 
 *  Date Last Updated:
 */
import java.util.ArrayList;
import java.util.Random;
public class Person {
	/*
	 *  Instance Variable for the Person Object Class
	 */
	 // Add you code here	  
	private int PersonId;
	private String FirstName;
	private String LastName;
	private String MiddleName;
	private char MiddleInitial;
	private String EyeColor;
	private String HairColor;
	public static int count;

	 /*
	  * Creates a person object with no values - No-Argue * Constructor.
	  */
	  public Person(){
		  setPersonID();
		  this.FirstName = " ";
		  this.LastName = " ";
		  this.MiddleName = " ";
		  this.EyeColor = " ";
		  this.HairColor = " ";
		  incCount();
	  }
	  
	  /*
	   * 5-Argue Person Constructor
	   */
	
	  public Person(String firstName, String lastName, String middleName,
			String eyeColor, String hairColor) {
		FirstName = firstName;
		LastName = lastName;
		MiddleName = middleName;
		EyeColor = eyeColor;
		HairColor = hairColor;
		setPersonID();
		setMiddleInitial();
		incCount();
	  }

	/*
	   *  Get Method for PersonID instance variable
	   */
	  public int getPersonID() {
		  return this.PersonId;
	  }
	  /*
	   *  Get Method for FirstName instance variable
	   */
	  public String getFirstName(){
		    //Add your code here
		  return this.FirstName;
	  }

	  /*
	   *  Get Method for LastName instance variable
	   */
	  public String getLastName(){
		    //Add your code here
		  return this.LastName;
	  }
	   /*
	    *  Get Method for the MiddleInitial instance variable
	    */
	  public char getMiddleInitial(){
		    // Add your code here
		  return this.MiddleInitial;
	  }

	  /*
	   *  Get Method for the MiddleName instance variable
	   */
	  public String getMiddleName(){
		    // Add your code here
		  return this.MiddleName;
	  }
	  
	  /*
	   *  Get Method for EyeColor instance variable
	   */
	  public String getEyeColor() {
		  // Add your code here
		  return this.EyeColor;
	  }
	  
	  /*
	   *  Get Method for HairColor instance variable
	   */
	  public String getHairColor() {
		  //Add your code here
		  return this.HairColor;
	  }
	  
	  /*
	   * Get static Method for the count variable
	   */
	  public static int getPersonCount() {
		  // Add your code here
		  return count;
	  }
	  
	  // Id array List have same length of Person array, return count.
	  public static int getIdArrayLength() {
		  // Add your code here
		  return getPersonCount();
	  }
	  
//	  public static int getIdArrayValue(int) {
//		  // Add your code here
//	  }
	 
	  /**
	   * If this personId is in the Person ArrayList, it will return true
	   * @param id PersonId
	   * @param persons Person Array
	   * return true or false
	   */ 
	  public static boolean idExistInPersonArray(int id, ArrayList<Person> persons) {
		  // Add your code here
		  for(Person person: persons) {
			  if (person.getPersonID() == id) {
				  return true;
			  }
		  }
		  return false;
	  }
	  
	  /* 
	   *  Set Method for FirstName
	   */
	  public void setFirstName(String firstName){
		    //Add your code here
		  this.FirstName = firstName;
	  }

	  /* 
	   *  Set Method for LastName
	   */
	  public void setLastName(String lastName){
		    // Add your code here
		  this.LastName = lastName.toUpperCase();
	  }

	  /* 
	   *  Set Method for MiddleName
	   */
	  public void setMiddleName(String middleName){
		    //Add your code here
		  this.MiddleName = middleName;
	  }
	  
	  /* 
	   *  Set Method for EyeColor
	   */
	  public void setEyeColor(String eyeColor) {
		  // Add your code here
		  this.EyeColor = eyeColor;
	  }
	  
	  /* 
	   *  Set Method for HairColor
	   */
	  public void setHairColor(String hairColor) {
		  // Add your code here
		  this.HairColor = hairColor;
	  }
	  
	  /* 
	   *  Set static Method for count
	   */
	  public static void incCount(){
		    //Add your code here
		 ++count;
	  }

	  /*
	   *  Set Method to create the middle initial
	   */
	  public void setMiddleInitial() {
		    //Add your code here
		  this.MiddleInitial = MiddleName.charAt(0);
	  }

	  /*
	   *  Generate a 4 digit random number for PersonID
	   */
	  public void setPersonID() {
		  // Add your code here
		  Random random = new Random();
		  this.PersonId = random.nextInt(9999 + 1 - 1000) + 1000;
	  }
	  
	  /*
	   *  Method to check to see if two Person Objects
	   *  have a relationship (are related by LastName)
	   */
	  public boolean isRelated(Person personTwo) {
		  // Add your code here
		  return getLastName().equals(personTwo.getLastName());
	  }
	  
	  /*
	   *  toString() to Display a complete Person Object
	   */
	  public String toString(){
		    // Add your code here
		  return "*ID: " + getPersonID() 
		  + " *Name: " + getLastName() + ", " + getFirstName() + " " + getMiddleInitial()
		  + " *HairColor: " + getHairColor() + " *EyeColor:" + getEyeColor();
	  }
} // End of Person Class
