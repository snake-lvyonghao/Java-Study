package 第九章;
import java.io.*;
public class demo9_5 {
    public  static void main(String[] args)throws IOException{
        char c = 'A';
        int i = 3721;
        long l = 123456;
        float f = 3.14f;
        double d = 3.14159265;
        String str = "基本类型数据输入输出示例";
        DataOutputStream output = new DataOutputStream(new FileOutputStream(".\\datastream.txt"));
        output.writeChar(c);
        output.writeInt(i);
        output.writeLong(l);
        output.writeFloat(f);
        output.writeDouble(d);
//      output.writeUTF(str);
        output.close();
        DataInputStream input = new DataInputStream(new FileInputStream(".\\datastream.txt"));
        char cc = input.readChar(); //从文件中读字符
        int ii = input.readInt();  //从文件中读整数
        long ll = input.readLong();
        float ff = input.readFloat();
        double dd = input.readFloat();
//        String sstr = input.readUTF();
        input.close();
        System.out.print(cc +"\n" + ii +"\n" + ll +"\n" + ff +"\n" + dd +"\n");
    }
}
