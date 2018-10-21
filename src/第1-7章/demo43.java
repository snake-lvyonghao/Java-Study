import java.io.*;
public class demo43 {
    public static void main(String[] args){
        int age = 200;
        try {
            if(age < 0 || age >120)
                throw new Exception("年冷超出范围");
            System.out.println("age =" + age);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
