import java.util.Scanner;
public class demo40 {
    public static void main(String[] args){
        int sum = 0,n,a,k;
        System.out.println("请输入a 和 项数 (每一项输入后请按回车结束)");
        Scanner scanf1 = new Scanner(System.in);
        Scanner scanf2 = new Scanner(System.in);
        a = scanf1.nextInt();
        k = a;
        n = scanf2.nextInt();
        for(int i = 0 ;i < n; i++){
            sum += a;
            a = a * 10 + k;
        }
        System.out.println(sum);
    }
}
