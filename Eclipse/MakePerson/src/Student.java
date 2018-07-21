import java.util.Arrays;

public class Student extends Person {
	private String schoolName;
	private int year;
	private String yearName;
	private Course[] courseList;
	
	public Student() {
		super();
	}
	
	public Student(String fn, String ln, String mn, String ec, String hc, 
			String schoolName, int year, Course[] courseList) {
		super(fn, ln, mn, ec, hc);
		this.schoolName = schoolName;
		this.year = year;
		convertYearToName(year);
		this.courseList = courseList;
	}


	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getYearName() {
		return yearName;
	}
	public void setYearName(String yearName) {
		this.yearName = yearName;
	}
	// Freshmen for 1, Sophmore for 2, Junior for 3, and Senior for 4
	private void convertYearToName(int year) {
		if (year == 1) {
			this.yearName = "Freshmen";
		} else if (year == 2) {
			this.yearName = "Sophmore";
		} else if (year == 3) {
			this.yearName = "Junior";
		} else if (year == 4) {
			this.yearName = "Senior";
		}
	}
	
	public String toString(){
		String courseListToString  = " ";
		for (Course course : courseList) {
			if (course != null) {
				courseListToString += course.toString() + "\n";
			}
		}
		  return "Student-PersonID: " + super.getPersonID() + " *Name: " + super.getLastName().toUpperCase() + ", " + super.getFirstName() + " " + super.getMiddleInitial() 
				  	+ " *Eyes: " + super.getEyeColor() + " *super: " + this.getHairColor() + "\n" 
				  	+ " *School: " + this.schoolName + " *Year: " + this.yearName + " \n" + courseListToString;
	}
}
