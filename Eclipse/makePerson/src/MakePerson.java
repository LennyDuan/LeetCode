/*
 *  Person Driver Class
 *  Written By: 
 *  Date Last Updated:
 */
import java.util.Scanner;
import java.util.ArrayList;

public class MakePerson {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Person> PersonList = new ArrayList<Person>();
		// Add your code here
		
		// Create Person Object 1
		System.out.println("Enter First Name:");
		String P1FirstName = input.nextLine();
		System.out.println("Enter Last Name:");
		String P1LastName = input.nextLine();
		System.out.println("Enter Middle Name:");
		String P1MiddleName = input.nextLine();
		System.out.println("Enter Eye Color:");
		String P1EyeColor = input.nextLine();
		System.out.println("Enter Hair Color:");
		String P1HairColor= input.nextLine();
		
		System.out.println("\n");
		
		System.out.println("Calling 5-arg Constructor to create Person object 1");
		Person p1 = new Person(P1FirstName, P1LastName, P1MiddleName, P1EyeColor, P1HairColor);
		System.out.println("Person Object 1");
		System.out.println(p1.toString());
		PersonList.add(p1);
		
		System.out.println("\n");

		// Create Person Object 2
		System.out.println("Calling No-arg Constructor to create Person object 2");
		Person p2 = new Person();
		System.out.println("Person Object 2");
		// If p2 PersonId is not unique, set a new PersonId until it is unique
		while(Person.idExistInPersonArray(p2.getPersonID(), PersonList)) {
			p2.setPersonID();
		}
		System.out.println(p2.toString());
		
		System.out.println("\n");

		System.out.println("Calling all set methods to modify Person object 2");
		p2.setLastName("SMITH");
		p2.setFirstName("Joseph");
		p2.setMiddleName("Cho");
		p2.setMiddleInitial();
		p2.setHairColor("Red");
		p2.setEyeColor("Green");
		System.out.println("Person Object 2");
		System.out.println(p2.toString());
		PersonList.add(p2);

		System.out.println("\n");

		// Create Person Object 3
		System.out.println("Enter First Name:");
		String P3FirstName = input.nextLine();
		System.out.println("Enter Last Name:");
		String P3LastName = input.nextLine();
		System.out.println("Enter Middle Name:");
		String P3MiddleName = input.nextLine();
		System.out.println("Enter Eye Color:");
		String P3EyeColor = input.nextLine();
		System.out.println("Enter Hair Color:");
		String P3HairColor= input.nextLine();
		
		System.out.println("Calling 5-arg Constructor to create Person object 3");
		Person p3 = new Person(P3FirstName, P3LastName, P3MiddleName, P3EyeColor, P3HairColor);
		// If p3 PersonId is not unique, set a new PersonId until it is unique
		while(Person.idExistInPersonArray(p3.getPersonID(), PersonList)) {
			p3.setPersonID();
		}
		System.out.println("Person Object 3");
		System.out.println(p1.toString());
		PersonList.add(p3);
		
		System.out.println("\n");

		// Check relationships
		System.out.println("Checking to see if Person 1 is related to Person 2 ...");
		System.out.println("\n");

		if(!p1.isRelated(p2)) {
			System.out.println("Person 1 is not related to Person 2. They have different last names");
		} else {
			System.out.println("Person 1 is related to Person 2. They have the same last names");
		}
		System.out.println("\n");
		System.out.println("Checking to see if Person 1 is related to Person 3 ...");
		System.out.println("\n");
		if(!p1.isRelated(p3)) {
			System.out.println("Person 1 is not related to Person 3. They have different last names");
		} else {
			System.out.println("Person 1 is related to Person 3. They have the same last names");
		}
		System.out.println("\n");
		System.out.println("Person Object Count: " + Person.count);
	}
}
