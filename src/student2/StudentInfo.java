package student2;

public class StudentInfo {
	
	private String name;
	private String StudentID;
	private int age;
	
	public StudentInfo() {}
	
	
	public StudentInfo(String name, String studentID, int age) {
		this.name = name;
		StudentID = studentID;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	

}
