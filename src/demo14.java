
public class demo14 {
	public static void main(String[] args) {
		Student s1,s2;
		s1 = new Student();
		s2 = new Student();
		s1.setInfo("赵强","2010038","山西太原");
		s2.setInfo(23.f,"20100089");
		s2.getInfo(23.5f);
		s1.getInfo("山西太原");
	}
}
class Student {
	public String name;
	public String studentID;
	private String address;
	public String mobilePhone;
	protected String major;
	private  float gpa;
	public void register() {
	}
	public  float getgpa() {
		return gpa;
	}
	public void setgpa() {
		gpa = 23.5f;
	}
	public void setInfo(String n,String ID) {
		name = n;
		studentID = ID;
	}
	public void setInfo(String n,String ID,String add) {
		name = n;
		studentID = ID;
		address = add; 
	}	
	public void setInfo(float g,String ID) {
		gpa = g;
		studentID = ID;
	}
	public void getInfo(float g) {
		System.out.println("学号：" + studentID + "\t平均成绩点：" + g);
	}
	public void getInfo(String add) {
		System.out.println("学号：" + studentID + "\t姓名：" + "\t地址" + add);
	}
}

