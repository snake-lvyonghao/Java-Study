
public class demo25 {
	public static void main(String[] args) {
		C c = new D();
		c.n = 3.1415926;
		//c.w = 300;
		//c.cry();
		c.m = 186;
		c.f();
		c.g();
		D d = (D)c;
		d.n = 555;
		d.f();
		d.g();
		d.cry();
	}
}
class C{
	int m;
	double n;
	
	void f() {
		System.out.println("被子类继承的方法发（）");
	}
	
	void g() {
		System.out.println("你好，n=" + n + "m = " + m);
	}
}

class D extends C{
	int n = 12;
	int w;
	
	void g() {
		System.out.println("子类重写方法g（）， n =" + n + "m =" + m);
	}
	
	void cry() {
		System.out.println("子类新增的方法");
	}
}
