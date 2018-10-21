package course;

public class Course {
	public String courseID;
	public float credit;
	protected String courseCharacter;
	String description;
	private String term;
	public Course() {
}
	public Course(String courseID,float credit,String courseCharacter,String description,String term) {
		this.courseCharacter = courseCharacter;
		this.courseID = courseID;
		this.credit = credit;
		this.description = description;
		this.term = term;
	}
}
 class Student1{
	public int studentAge;
	protected String studentAddr;
	String studentName;
	private int studentAccount;
	
	public Student1(int studentAge,String studentAddr,String studentName,int studentAccount) {
		this.studentAccount = studentAccount;
		this.studentAddr = studentAddr;
		this.studentAge = studentAge;
		this.studentName = studentName;
	}
	public Student1() {
		this.studentAge = 18;
	}
}
class Manger extends Student1{
	void getStudentInformation() {
		System.out.println("name is " + studentName);
		System.out.println("age is " + studentAge);
		System.out.println("accout is" + studentAddr);//A行
		
	}
}
class Teacher{
	public int age;
	protected String addr;
	String name;
	public int account;
	String teacherID;
	
	public Teacher(int age,String addr,String name,int account,String teacherID) {
		this.age = age;
		this.addr = addr;
		this.name = name;
		this.account = account;
		this.teacherID = teacherID;
	}
	public void Setinfo(String teacherID) {
		this.teacherID = teacherID;
	}
	public void question(Student1 s) {
		System.out.print(s.studentAddr + "\t" + s.studentAge + "\t" + s.studentName);
	}
}