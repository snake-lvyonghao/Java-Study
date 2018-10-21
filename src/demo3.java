import java.util.Scanner;
public class demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入成绩\n");
		int score = sc.nextInt();
		
		if(score >= 0 && score <= 100) {
			System.out.println("成绩 " + score +"\n");
		}
		sc.close();
	}
}
