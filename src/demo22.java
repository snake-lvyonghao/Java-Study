
public class demo22 {
	public static void main(String[] args) {
		Aclass aclass= new Aclass();
		Bclass bclass= new Bclass();
		
		aclass.p1();
		bclass.p1();
		
	}
}
class Aclass{
	int a;
	float a1;
	public Aclass() {
		a = 50;
		a1 = 99.99f;
	}
	
	public void p1() {
		System.out.println("this is a method of A");
		System.out.println("a = " + a);
	}
}
class Bclass extends Aclass{
	int a;
	
	public Bclass() {
		a = 10;
		a1 = 123.6f;
	}
	
	public void p1() {
		System.out.println("this is a method of B");
		System.out.println("a = " + a);
		super.p1();
		System.out.println("super.a = " + super.a);
	}
}
