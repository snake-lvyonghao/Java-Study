
public class demo29 {
	public static void main(String[] args) {
		System.out.println(staticTestFunction.addUP(10, 5));
		staticTestFunction test = new staticTestFunction();
		System.out.println(test.sub());
	}
}
class staticTestFunction{
	int x = 10,y = 6;
	static int z = 9;
	public static int addUP(int a,int b) {
		return a + b + z;
	}
	
	public int sub() {
		return x - y;
	}
	
	//public static int addUP() { 类方法不能使用实例变量
	//	return x + y;
	//}
}
