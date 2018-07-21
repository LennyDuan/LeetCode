/*
 *  Person Class: Used with Assignment 4
 *  Written By: David L. Rude
 *  Date Last Updated: 7/14/2018
 */
import java.util.Random;
public class Person {
	final static int PersonIDMin = 1000;
	final static int PersonIDMax = 9999;
	/*
	 *  Instance Variable for the Person Object Class
	 */
	 private int PersonID;
	 private String FirstName;
	 private String LastName;
	 private String MiddleName;
	 private char MiddleInitial;
	 private String EyeColor;
	 private String HairColor;

	 /*
	  * Creates a person object with no values - No-Arg Constructor.
	  */
	  public Person(){
		this.FirstName = " ";
		this.LastName = " ";
		this.MiddleName = " ";
		this.EyeColor = " ";
		this.HairColor = " ";
		this.MiddleInitial = setMiddleInitial(this.MiddleName);
		this.PersonID = setPersonID(PersonIDMin, PersonIDMax);
	  }
	  
	  /*
	   * 5-Arg Person Constructor
	   */
	  public Person(String fn, String ln, String mn, String ec, String hc){
		    this.FirstName = fn;
		    this.LastName = ln;
		    this.MiddleName = mn;
		    this.EyeColor = ec;
		    this.HairColor = hc;
		    this.MiddleInitial = setMiddleInitial(this.MiddleName);
		    this.PersonID = setPersonID(PersonIDMin, PersonIDMax);
	  }
	  
	  /*
	   *  Get Method for PersonID instance variable
	   */
	  public int getPersonID() {
		  // Add your code here
		  return this.PersonID;
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
	   *  Set Method for FirstName
	   */
	  public void setFirstName(String fn){
		    //Add your code here
		   this.FirstName = fn;
	  }

	  /* 
	   *  Set Method for LastName
	   */
	  public void setLastName(String ln){
		    // Add your code here
		  this.LastName = ln;
	  }

	  /* 
	   *  Set Method for MiddleName
	   */
	  public void setMiddleName(String mn){
		    //Add your code here
		  this.MiddleName = mn;
		  this.MiddleInitial = setMiddleInitial(mn);
	  }
	  
	  /* 
	   *  Set Method for EyeColor
	   */
	  public void setEyeColor(String ec) {
		  // Add your code here
		  this.EyeColor = ec;
	  }
	  
	  /* 
	   *  Set Method for HairColor
	   */
	  public void setHairColor(String hc) {
		  // Add your code here
		  this.HairColor = hc;
	  }

	  /*
	   *  Set Method to create the middle initial
	   */
	  public char setMiddleInitial(String mn) {
		    return mn.toUpperCase().charAt(0);
	  }

	  /*
	   *  Generate a 4 digit random number for PersonID
	   */
	  public int setPersonID(int min, int max) {
		  Random rn = new Random();
		  int range = max - min + 1;
		  return rn.nextInt(range) + min;
	  }
	  
	  /*
	   *  Method to check to see if two Person Objects
	   *  have a relationship (are related by LastName)
	   */
	  public boolean isRelated(Person whatever) {
		  // Add your code here
		  if (this.LastName.equals(whatever.LastName)) {
			  return true;
		  }else {
			  return false;
		  } 
	  }
	  
	  /*
	   *  toString() to Display a complete Person Object
	   */
	  public String toString(){
		  return "PersonID: " + this.getPersonID() + " *Name: " + this.getLastName().toUpperCase() + ", " + this.getFirstName() + " " + this.MiddleInitial 
				  	+ " *Eyes: " + this.getEyeColor() + " *Hair: " + this.getHairColor();
	  }
} // End of Person Class
