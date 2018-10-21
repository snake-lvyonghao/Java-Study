import java.io.*;
public class demo45 {
    public static int calc(int x)throws Exception{
        int z = 0;
        if(x == 0){
            throw new Exception("除数为零！"); //显示抛出异
        }
        z = 110 / x;
        return z;
    }
    public static void  main(String[] args){
        int a = 0;
        try{
            a = calc(0);
            System.out.println("a=" + a);
        }catch (Exception z){
            System.out.println("调用方法calc时发生异常：" + z.getMessage());
            z.printStackTrace();
        }
    }
}
