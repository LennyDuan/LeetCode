import java.util.Arrays;

public class Instructor extends Person {
	private String schoolName;
	private String Dept;
	private Course[] courseList;
	
	
	public Instructor() {
		super();
	}
	
	
	public Instructor(String fn, String ln, String mn, String ec, String hc,
			String schoolName, String Dept, Course[] courseList) {
		super(fn, ln, mn, ec, hc);
		this.schoolName = schoolName;
		this.Dept = Dept;
		this.courseList = courseList;
	}


	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	
	public String toString(){
		String courseListToString  = " ";
		for (Course course : courseList) {
			if (course != null) {
				courseListToString += course.toString() + "\n";
			}
		}
		  return "Instructor-PersonID: " + super.getPersonID() + " *Name: " + super.getLastName().toUpperCase() + ", " + super.getFirstName() + " " + super.getMiddleInitial() 
				  	+ " *Eyes: " + super.getEyeColor() + " *super: " + this.getHairColor() + "\n" 
				  	+ " *School: " + this.schoolName + " *Dept: " + this.Dept + " \n" + courseListToString;
	}
}
