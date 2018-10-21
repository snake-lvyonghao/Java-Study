package 第九章;
import java.io.File;
public class demo9_9 {
    public static void main(String[] args){
        System.out.print("系统路径分隔符" +File.pathSeparator );
        System.out.print("系统默认路径分隔符" + File.pathSeparatorChar);
        System.out.print("系统名称分隔符" + File.separator);
        System.out.print("系统默认名称分隔符" + File.separatorChar);
    }
}
