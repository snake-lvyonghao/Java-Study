import java.util.Scanner;
public class demo4 {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("请输入成绩: ");
        int score = sc.nextInt();
        if(score >= 0 && score <= 100) {
        	System.out.println("成绩： " + score);
        }
        else
        	System.out.println("输入成绩应该在0~100之间");
        sc.close();
	}
}
