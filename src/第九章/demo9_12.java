package 第九章;
import java.util.Scanner;
public class demo9_12 {
    public static void main(String[] args){
        Scanner s = new Scanner("abcd efgha jkl..sadfas,qweasd usadada");
        s.useDelimiter(" |,|\\.");
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}
