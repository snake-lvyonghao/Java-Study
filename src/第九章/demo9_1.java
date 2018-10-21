package 第九章;
import java.io.*;
public class demo9_1 {
    public static void main(String[] args)throws IOException{
        FileOutputStream fos;
        fos = new FileOutputStream(".\\123.txt");
        byte[] array = {1,3,5,7,9,11,13,15,17,19};
        for(int i = 0; i < array.length; i++){
            fos.write(array[i]);    //写数据到文件输出流，即写入文件
        }
        fos.close();    //关闭文件输出流，及关闭文件
        FileInputStream fis = new FileInputStream(".\\123.txt");
        //打开文件输入流
        int value;
        while((value = fis.read()) != -1){ //读入文件
            System.out.print(value + " ");
        }
        fis.close(); //关闭文件输入流，即关闭文件
    }
}
