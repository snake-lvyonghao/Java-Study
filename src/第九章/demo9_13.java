package 第九章;
import  java.util.Scanner;
public class demo9_13 {
    public static void main(String[] args){
        Scanner s = new Scanner("123 3.1415 true abcdef");
        System.out.print(s.nextInt());
        System.out.print(s.nextFloat());
        System.out.print(s.nextBoolean());
        System.out.print(s.next());
    }
}
