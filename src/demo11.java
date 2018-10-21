import java.util.Scanner;
public class demo11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数");
		int n = sc.nextInt();
		boolean flag = true;
		for (int i = 2; i < n;i++) {
			if(n % i == 0) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.print("是素数");
		else
			System.out.print("不是素数");
	}
}
