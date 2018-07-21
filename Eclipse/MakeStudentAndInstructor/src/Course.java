/*
 *  Course Class: Used with Assignment 4
 *  Written By: David L. Rude
 *  Date Last Updated: 7/14/2018
 */
public class Course {
	private String courseID;
	private String deptName;
	private String courseName;
	
	public Course() {
	}
	
	public Course(String cid, String dn, String cn) {
		this.courseID = cid;
		this.deptName = dn;
		this.courseName = cn;
	}
	
	public String getCourseID() {
		return this.courseID;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseID(String cid) {
		this.courseID = cid;
	}
	
	public void setDeptName(String dept) {
		this.deptName = dept;
	}
	
	public void setCourseName(String cn) {
		this.courseName = cn;
	}
	

	
	public String toString() {
		return "*CRS ID: " + getCourseID() + " *Dept: " + getDeptName() + " *CRS Name: " + getCourseName();
	}
	
}
