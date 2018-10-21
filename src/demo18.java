public class demo18 {
	public static void main(String[] args) {
		Employee1 zhangGang = new Employee1(18,"taiyuan","王五",350);
		President1 missliu = new President1(35,"北京","刘总管",200,"102198");
		missliu.question(zhangGang);
		Manager1 YHY = new Manager1();
		YHY.getEmployeeInformation();
	}
}
class Employee1 {
	public int EmployeeAge;
	protected String EmployeeAddr;
	String EmployeeName;
	private int EmployeeAccount;
	
	public Employee1(int EmployeeAge,String EmployeeAddr,String EmployeeName,int EmployeeAccount) {
		this.EmployeeAccount = EmployeeAccount;
		this.EmployeeAddr = EmployeeAddr;
		this.EmployeeAge = EmployeeAge;
		this.EmployeeName = EmployeeName;
	}

	public Employee1() {
		this.EmployeeAge = 22;
	}
}
class Manager1 extends Employee1{
	void getEmployeeInformation() {
		System.out.println("name is " + EmployeeAddr + "（如果输出为null则验证成功）");//验证
		System.out.println("age is " + EmployeeAge);
		System.out.println("accout is " + EmployeeAddr + "（如果输出为null则验证成功）");//验证
		
	}
}
class President1 {
	public int age;
	protected String addr;
	String name;
	private int account;
	String PresidentID;
	
	public President1(int age,String addr,String name,int account,String teacherID) {
		this.age = age;
		this.addr = addr;
		this.name = name;
		this.account = account;
		this.PresidentID = teacherID;
	}
	public void Setinfo(String teacherID) {
		this.PresidentID = teacherID;
	}
	public void question(Employee1 s) {
		System.out.print(s.EmployeeAddr + "\t" + s.EmployeeAge + "\t" + s.EmployeeName + "\r\n");
	}
}
