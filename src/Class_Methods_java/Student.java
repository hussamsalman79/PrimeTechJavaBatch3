package Class_Methods_java;

public class Student {
	
	private String name; 
	private int age; 
	private String gender; 
	private int sutdID; 
	private String major; 
	private double gpa; 
	private String school; 
	
	
	 public void setName(String Newname) {
		name = Newname;
	 }
	 
	 public String getNamne() {
		 return name; 
	 }
	 
	 public void setAge(int newAge) {
		  age = newAge; 
	 }
	 public int getAge() {
		 return age;
	 }
	 
	 public void setGender (String newGender) {
		 
		 gender = newGender; 
	 }
	 
	 public String getGender() {
		 return gender; 
	 }
	 
	 public void setSudId (int newID) {	 
		 sutdID = newID;
	 }
	 
	 public int getstudID() {
		 return sutdID; 
	 }
	 
	 public void setMajor(String newMajor) {
		 
		 major = newMajor;
	 }
	 
	 public String getMajor() {
		 return major; 
	 }
	 
	 public void setGba(double newGpa) {
		 gpa =newGpa; 
		 
	 }
	 
	 public double getGpa() {
		 return gpa;
	 }
	 
	 public void setSchool(String newSchool) {
		 school = newSchool; 
	 }
	 
	 public String getSchool() {
		 return school; 
	 }
	 
	  public void printStudentInfo() {
		  System.out.println("Name: " + name );
		  System.out.println("Age: " + age );
		  System.out.println("Gender: " + gender);
		  System.out.println("Student ID: " + sutdID);
		  System.out.println("Major: " + major);
		  System.out.println("Final GPA: " + gpa);
		  System.out.println("School: " + school);
	  }
	 
}

