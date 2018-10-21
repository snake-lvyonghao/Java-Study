import java.io.*;
public class demo44 {
    public static int calc(int x){
        int z = 0;
        z = 110/x;
        return z;
    }
    public static void main(String[] args){
        int a = 0;
        try{
            a = calc(0);
            System.out.println("a= " + a);
        }catch (ArithmeticException e){
            System.out.println("调用方法calc时发生异常" + e.getMessage());
            e.printStackTrace();
        }
    }
}
