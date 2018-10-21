import java.util.Scanner;
public class didi4 {
    public static void main(String[] args){
        float x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        if(x < 1)   y  = x;
        else if(x < 10) y = 3*x - 2;
        else y = 4*x;
        System.out.println(y);
    }
}
