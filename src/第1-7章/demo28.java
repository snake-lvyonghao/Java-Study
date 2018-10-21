
public class demo28 {
	public static void main(String[] args) {
		System.out.println("目前出生人数" + Person.totaNum);
		Person wang = new Person("wang");
		Person liu = new Person("liu");
		Person zhao = new Person("zhao");
		
		System.out.println("目前出生人数" + Person.totaNum);
		System.out.println("目前出生人数" + wang.totaNum);
	}
}
class Person{
	static long totaNum = 10000;
	int age;
	String name;
	String id;
	
	public Person(String name) {
		totaNum ++;
		this.name = name;
		age = 1;
	}
}