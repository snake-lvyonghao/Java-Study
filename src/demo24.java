
public class demo24 {
	public static void main(String[] args) {
		Specialist d = new Specialist();
	}
}

class Doctor{
	String name;
	int ID;
	String address;
	
	public  Doctor(String name1,int ID1,String address1) {
		name = name1;
		ID = ID1;
		address = address1;
		
		System.out.println("名字" + name);
		System.out.println("编号" + ID);
		System.out.println("地址" + address);
	}
	
	public Doctor() {}
}
class Specialist extends Doctor{
	public Specialist(String name1,int ID1,String address1) {
		super(name1,ID1,address1);
	}
	public Specialist() {
		//super();
		name = "10";
		System.out.println("名字" + name);
		System.out.println("编号" + ID);
		System.out.println("地址" + address);
	}
}