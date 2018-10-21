package 第九章;
import java.io.*;
public class demo9_2 {
    public static void main(String[] args)throws IOException{
        FileWriter fw = new FileWriter(".\\filestream.txt");//打开文件输出流
        char array[] = {'文','本','输','入','输','出','实','例','。'};
        for(int i = 0;i < array.length;i++){
            fw.write(array[i]); //写数据到文件输出流，及写入文件
        }
        fw.close(); //关闭文件，即关闭文件输出流
        FileReader fr = new FileReader(".\\filestream.txt");
        int value;
        while((value = fr.read())!= -1){
            System.out.print((char)value);
        }
        fr.close();//关闭文件输入流，即关闭文件
    }
}
