import java.util.Random;
import java.util.Scanner;
public class demo34 {
    public static void main(String[] args) {
        System.out.println("------------欢迎来到答题竞技场------------\r\n" + "|         1,每轮你有三次答题的机会        |\r\n" + "|   2,每次输入后你有一次机会确认你的答案  |\r\n" + "|   3,每轮结束后输入任意数字继续下一轮    |\r\n" + "| 4,开始请输入1若退出在每轮结束后输入2即可 |\r\n" + "-------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        while ( loop == 1) {
            for(int i = 0; i < 3 ; i++) {
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
                System.out.println("你确定你的答案是" + add + "嘛？" + "确定按1修改按0\r\n");
                Scanner data = new Scanner((System.in));
                int Data = data.nextInt();
                if(Data == 1){
                    if(add == sum){
                        System.out.println("恭喜你回答正确\r\n");
                    }
                    else
                        System.out.println("很可惜你的答案是错误的正确答案是： " + Y + "\r\n");
                }
                if(Data == 0) {
                    System.out.println("请输入你要修改的数值\r\n");
                    Scanner modify = new Scanner(System.in);
                    add = modify.nextDouble();
                    if(add == sum){
                        System.out.println("恭喜你回答正确\r\n");
                    }
                    else
                        System.out.println("很可惜你的答案是错误的正确答案是： " + Y + "\r\n");
                }
            }
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
        this.x = rx.nextDouble() * 5;
        this.X = (double)(Math.round(this.x*100))/100;
        Random ry = new Random();
        this.y = ry.nextDouble() * 5;
        this.Y = (double)(Math.round(this.y*100))/100;
        //this.sum = this.X + this.Y;
        this.SUM= (double)(Math.round((this.X + this.Y)*100))/100;

    }
}
