import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class demo46 {
    public static void main(String[] args) {
        System.out.println("输入一行文本");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inputReader = new BufferedReader(isr);
        try {
            String inputLine = inputReader.readLine();
            System.out.println("您输入的文本是" + inputLine);
        }catch(IOException e){
            System.out.println("发生异常" + e);
        }
    }
}
