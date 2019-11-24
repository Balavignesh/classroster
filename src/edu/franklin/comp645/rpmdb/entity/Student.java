/**
 * 
 */
package edu.franklin.comp645.rpmdb.entity;

/**
 * @author BalaVignesh
 *
 */
public class Student {
	
	private Double studentId;
	private String name;
	private String emailAddress;

	private String phoneNumer;
	private String experience;

	private String gender;
	private String language;

	private String programmingLevel;
	private String location;

	private String courseName;
	

	private char[] StudentPic;

	public Double getStudentId() {
		return studentId;
	}

	public void setStudentId(Double studentId) {
		this.studentId = studentId;
	}

	public char[] getStudentPic() {
		return StudentPic;
	}

	public void setStudentPic(char[] studentPic) {
		StudentPic = studentPic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getProgrammingLevel() {
		return programmingLevel;
	}

	public void setProgrammingLevel(String programmingLevel) {
		this.programmingLevel = programmingLevel;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	

}
