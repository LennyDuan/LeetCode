/*
 *  PersonAddressDriver Class used with Assignment4
 *  Written By: David L. Rude
 *  Date Last Updated: 7/14/2018
 */
import java.util.Scanner;

public class MakePerson {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); // Scanner object to input from the user
		Person[] personList = new Person[5]; // Array to hold Person, Student, and/or Instructor objects
		int personCount = 0; // Used to keep track which Person object is being created and stored in the personList array
		
		/*
		 *  Create a Student of Instructor Object
		 */
		System.out.println("Provide inputs for first Person object...");
		System.out.print("Enter First Name: ");
		String fn = kb.nextLine();
		System.out.print("Enter Last Name: ");
		String ln = kb.nextLine();
		System.out.print("Enter Middle Name: ");
		String mn = kb.nextLine();
		System.out.print("Enter Eye Color: ");
		String ec = kb.nextLine();
		System.out.print("Enter Hair Color: ");
		String hc = kb.nextLine();
		
		personCount = addStuInst(kb, personList, personCount, fn, ln, mn, ec, hc); // Call the addStuInst method to create object
		
		/*
		 *  Create another Student of Instructor Object
		 */
		System.out.println("\nProvide inputs for second Person object...");
		System.out.print("Enter First Name: ");
		fn = kb.nextLine();
		System.out.print("Enter Last Name: ");
		ln = kb.nextLine();
		System.out.print("Enter Middle Name: ");
		mn = kb.nextLine();
		System.out.print("Enter Eye Color: ");
		ec = kb.nextLine();
		System.out.print("Enter Hair Color: ");
		hc = kb.nextLine();

		personCount = addStuInst(kb, personList, personCount, fn, ln, mn, ec, hc); // Call the addStuInst method to create object

		/*
		 *  Create a Person Object that is neither a Student of an Instructor
		 *  Calling the No-Arg Person Constructor
		 */
		personList[personCount] = new Person();
		System.out.println("Creating the third Person object\n" + personList[personCount]);
		
		/*
		 *  Call the mutator methods of the third Person object
		 */
		personList[personCount].setFirstName("Joseph");
		personList[personCount].setLastName("Smith");
		personList[personCount].setMiddleName("Clark");
		personList[personCount].setEyeColor("Green");
		personList[personCount].setHairColor("Red");
		
		System.out.println("\nCalling all set methods to modify Person object 3");
		System.out.println("This person object is an instance of Student: " + (personList[personCount] instanceof Student));
		System.out.println("This person object is an instance of Instructor: " + (personList[personCount] instanceof Instructor));
		System.out.println("This person object is an instance of Person: " + (personList[personCount] instanceof Person));
		System.out.println("Person Object Information\n" + personList[personCount]);
		
		kb.close();
	} // End of main() method
	
	
	/*
	 *  Prompt the user for the type of object to create (Student or Instructor),
	 *  then prompt the user for the number of courses to add and then get the course
	 *  information for each course to add to the Student of the Instructor
	 */
	public static int addStuInst(Scanner sc, Person[] pArray, int loc, String fn, String ln, String mn, String ec, String hc) {
		char whichOne = ' ';
		do {
			System.out.print("\nDo you want to create a Student Person or an Instructor Person (S/s or I/i): ");
			whichOne = sc.nextLine().toUpperCase().charAt(0);
		}while( whichOne != 'I' && whichOne != 'S');
		
		if(whichOne == 'S') {
			Course[] studentCourses = new Course[5];
			System.out.print("Enter School Name: ");
			String schoolName = sc.nextLine();
			System.out.print("Enter School Year: ");
			int year = sc.nextInt();
			sc.hasNextLine();
			System.out.println();
			
			int numOfCourses = -1;
			do {
				System.out.print("Enter number of courses to add: ");
				numOfCourses = sc.nextInt();
				sc.nextLine();
			}while(numOfCourses > studentCourses.length && numOfCourses < 0);
			
			if(numOfCourses > 0)
				addCourses(sc, studentCourses, numOfCourses); // call the method to add courses to Student object
			
			pArray[loc] = new Student(fn, ln, mn, ec, hc, schoolName, year, studentCourses);
			System.out.println("This person object is an instance of Student: " + (pArray[loc] instanceof Student));
			System.out.println("This person object is an instance of Instructor: " + (pArray[loc] instanceof Instructor));
			System.out.println("This person object is an instance of Person: " + (pArray[loc] instanceof Person));
			System.out.println("Student Person Object Information\n" + pArray[loc]);
			return loc++;
		}
		else {
			Course[] instructorCourses = new Course[5];
			System.out.print("Enter School Name: ");
			String schoolName = sc.nextLine();
			System.out.print("Enter Department Name: ");
			String Department = sc.nextLine();
			System.out.println();
			
			int numOfCourses = -1;
			do {
				System.out.print("Enter number of courses to add: ");
				numOfCourses = sc.nextInt();
				sc.nextLine();
			}while(numOfCourses > instructorCourses.length && numOfCourses < 0);
			
			if(numOfCourses > 0)
				addCourses(sc, instructorCourses, numOfCourses); // call method to add courses to Instructor object
			
			pArray[loc] = new Instructor(fn, ln, mn, ec, hc, schoolName, Department, instructorCourses);
			System.out.println("This person object is an instance of Student: " + (pArray[loc] instanceof Student));
			System.out.println("This person object is an instance of Instructor: " + (pArray[loc] instanceof Instructor));
			System.out.println("This person object is an instance of Person: " + (pArray[loc] instanceof Person));
			System.out.println("Instructor Person Object Information\n" + pArray[loc]);
			return loc++;
		}
	} // End of addStuInst() method
	
	
	/*
	 *  Add courses to the Student or Instructor object
	 */
	public static void addCourses(Scanner input, Course[] courses, int numOfCourses) {
		for(int i = 0; i < numOfCourses; i++) {
			System.out.print("Enter Course ID: ");
			String cid = input.nextLine();
			System.out.print("Enter Department Name: ");
			String dn = input.nextLine();
			System.out.print("Enter Course Name: ");
			String cn = input.nextLine();
			
			courses[i] = new Course(cid, dn, cn);
			System.out.println();
		}
	} // End of addCourses() method
} // End of MakePerson Class
