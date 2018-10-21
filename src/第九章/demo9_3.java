package 第九章;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo9_3 {
    public static void main(String[] args)throws IOException {
        String str = "Welcome to Java!";
        FileWriter fw = new FileWriter(".\\filestream.txt",true);//打开文件输出流
        fw.write(str);
        fw.close(); //关闭文件，即关闭文件输出流
        FileReader fr = new FileReader(".\\filestream.txt");
        int value;
        while((value = fr.read())!= -1){
            System.out.print((char)value);
        }
        fr.close();//关闭文件输入流，即关闭文件
    }
}
