import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class demo34 {
    public static void main(String[] args) throws IOException {
        System.out.println("------------欢迎来到答题竞技场------------\r\n" + "|         1,每轮你有十次答题的机会        |\r\n" + "|   2,每次输入错误后有3次机会输入你的答案  |\r\n" + "|   3,每轮结束后输入任意数字继续下一轮    |\r\n" + "| 4,开始请输入1若退出在每轮结束后输入2即可 |\r\n" + "-------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        while (loop == 1) {
            double Correctrate = 0; //正确率
            int Opportunity = 3;      //改错机会
            double right = 0;       //正确个数
            for (int i = 0; i < 10; i++) {
                AdditionDecimal s = new AdditionDecimal();
                s.random();
                double x = s.getX();
                String X = String.valueOf(x);
                double y = s.getY();
                String Y = String.valueOf(y);
                double sum = s.getSUM();
                String SUM = String.valueOf(sum);
                System.out.println("你要计算的是 ： " + X + "+" + Y + " = \r\n" + "请输入你的答案按回车结束");
                Scanner Answer = new Scanner(System.in);
                double add = Answer.nextDouble();
                if (add == sum) {
                    System.out.println("恭喜你回答正确\r\n");
                    right++;
                } else if (Opportunity != 0) {
                    System.out.println("再试一次吧" + "\r\n");
                    Scanner Answer2 = new Scanner(System.in);
                    double add2 = Answer2.nextDouble();
                    if (add2 == sum) {
                        System.out.println("恭喜你回答正确\r\n");
                        right++;
                    }
                    else{
                        System.out.println("很可惜你的答案是错误的正确答案是： " + sum + "\r\n");
                    }
                    Opportunity--;
                } else {
                    System.out.println("很可惜你的答案是错误的正确答案是： " + sum + "\r\n");
                }
            }
            Correctrate = right * 10.00;
            System.out.println("你的正确题数将会打印到cj.txt文件");
            String str = "正确个数为:" + String.valueOf(right) + "\r\n";
            String str2 = "正确率为:" + String.valueOf(Correctrate) + "%"  + "\r\n";
            System.out.println(str + str2);
            FileWriter fw = new FileWriter(".\\cj.txt",true);//打开文件输出流
            fw.write(str);
            fw.write(str2);
            fw.close(); //关闭文件，即关闭文件输出流

            System.out.println("你完成了本轮游戏你是否继续 继续请输入1 退出请输入2" + "\r\n");
            Scanner scan2 = new Scanner(System.in);
            loop = scan2.nextInt();
        }
    }
}
class Addition {
    double x,y,X,Y,sum,SUM;
    public void random(){
    }
    public double getX(){
        return this.X;
    }
    public double getY(){
        return this.Y;
    }
    public  double getSUM(){
        return this.SUM;
    }
}
class AdditionDecimal  extends Addition {
    double x,y,X,Y,sum,SUM;
    public double getX(){
        return this.X;
    }
    public double getY(){
        return this.Y;
    }
    public  double getSUM(){
        return this.SUM;
    }
    public void random(){
        Random rx = new Random();
        this.x = rx.nextDouble() * 40 + 10;
        this.X = (double)(Math.round(this.x*100))/100;
        Random ry = new Random();
        this.y = ry.nextDouble() * 40 + 10;
        this.Y = (double)(Math.round(this.y*100))/100;
//        this.sum = this.X + this.Y;
        this.SUM= (double)(Math.round((this.X + this.Y)*100))/100;

    }
}
