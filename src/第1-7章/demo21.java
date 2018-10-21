
public class demo21 {
	public static void main(String[] args) {
		Manager mrZhang = new Manager();
		mrZhang.setName("张刚");
		mrZhang.setDepartment("教务处");
		mrZhang.setSalay(2500);
		mrZhang.setSpecial("教务处处长");
		mrZhang.setSubsidy(500);
		System.out.println("****************员工信息*****************");
		System.out.println();
		System.out.print(mrZhang.toString());
	}
}

class Employee{
	protected String name;
	protected double salary;
	protected String department;
	public void setName(String name) {
		this.name = name;
	}
	public void setSalay(double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public double getSaraly() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public String toString() {
		return "姓名" + name + "\t部门：" + department + "\t基本工资：" + salary;
	}
}

class Manager extends Employee{
	private String special;
	private double subsidy;
	public void setSpecial(String special) {
		this.special = special;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}
	public String getSpecial() {
		return special;
	}
	public double getSunisdy(){
		return subsidy;
}
	public String toString() {
		return "姓名" + name + "\t部门：" + department + "\t基本工资：" + salary + "\t职务： " + special + "\t津贴" + subsidy;
	}
}