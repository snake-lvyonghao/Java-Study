package 第九章;
import java.io.*;
public class demo9_4 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//打开文本文件写
        BufferedWriter bout = new BufferedWriter(new FileWriter(".\\buffer.txt")); //字符流转化为缓冲流
        String str;
        while(true){
            str = br.readLine();//从键盘读一行字符
            if(str.equals("end")){
                break;
            }
            bout.write(str);
            bout.newLine();
        }
        bout.close();   //关闭文件
         //打开文本读
        BufferedReader bin = new BufferedReader(new FileReader(".\\buffer.txt")); //字符流转化为缓冲流
        while((str = bin.readLine())!= null){//从文件中读一行字符
            System.out.print(str + "\r\n"); //显示
        }
        bin.close();
    }
}
