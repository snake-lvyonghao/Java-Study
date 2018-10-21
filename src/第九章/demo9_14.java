package 第九章;
import java.util.Scanner;
public class demo9_14 {
    public static void main(String[] args){
        int count = 0;
        double sum = 0.0,average,x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        while(Math.abs(x) > 1e-5){
            sum += x;
            count++;
            x = scan.nextDouble();
        }
        average = sum / count;
        System.out.println("平均值=" + average);
    }
}
