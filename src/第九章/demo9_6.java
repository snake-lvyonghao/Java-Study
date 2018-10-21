package 第九章;
import java.io.*;
public class demo9_6 {
    public static void main(String[] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            DataInputStream din = new DataInputStream(System.in);
            System.out.print("请输入一个整数");
            String str = br.readLine();
//            int x = Integer.parseInt(str);

            System.out.print("输入的整数是" + str);
    }
}
