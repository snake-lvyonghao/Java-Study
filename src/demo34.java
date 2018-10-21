import java.util.Random;
import java.util.Scanner;
public class demo34 {
    public static void main(String[] args){
        int Correct = 0;
        System.out.print("如果选择整数计算请输入1之后回车，如果选择小数计算请输入2之后回车" + "\n\r");
        Scanner choose = new Scanner(System.in);
        int choose1 = choose.nextInt();
        if(choose1 == 2) {
            for (int t = 1; t <= 10; t++) {
                AdditionDecimal s = new AdditionDecimal();
                s.random();
                double x = s.getX();
                double y = s.getY();
                double sum = s.getSUM();
                System.out.println(x + " + " + y + " = ");
                Scanner scan = new Scanner(System.in);
                double add = scan.nextDouble();
                //System.out.print(add);
                if (add == sum) {
                    System.out.print("回答正确分数加1 进行下一题" + "\n\r");
                    Correct++;
                } else {
                    System.out.print("回答错误，还有一次机会，请再次输入答案" + "\n\r");
                    Scanner scan1 = new Scanner(System.in);
                    double add1 = scan1.nextDouble();
                    if (add1 == sum) {
                        System.out.print("回答正确分数加1 进行下一题" + "\n\r");
                        Correct++;
                    } else {
                        System.out.print("回答错误分数减1" + "\n\r");
                        Correct--;
                    }
                }
            }
            System.out.print("你的最后得分为 " + Correct + "\r\n");
            if (Correct <= -5) {
                System.out.print("很弱了，能不能好好算算" + "\n\r");
            } else if (Correct > -5 && Correct <= 5) {
                System.out.print("还行吧，能力有待提升" + "\n\r");
            } else if (Correct > 5 && Correct < 10) {
                System.out.print("能力很好哦，加油吧" + "\n\r");
            } else {
                System.out.print("哇塞全对了，你太棒了" + "\n\r");
            }
        }
        else {
            for (int t = 1; t <= 10; t++) {
                AdditionInteger s = new AdditionInteger();
                s.random();
                double x = s.getX();
                double y = s.getY();
                double sum = s.getSUM();
                System.out.println(x + " + " + y + " = ");
                Scanner scan = new Scanner(System.in);
                double add = scan.nextDouble();
                //System.out.print(add);
                if (add == sum) {
                    System.out.print("回答正确分数加1 进行下一题" + "\n\r");
                    Correct++;
                } else {
                    System.out.print("回答错误，还有一次机会，请再次输入答案" + "\n\r");
                    Scanner scan1 = new Scanner(System.in);
                    double add1 = scan1.nextDouble();
                    if (add1 == sum) {
                        System.out.print("回答正确分数加1 进行下一题" + "\n\r");
                        Correct++;
                    } else {
                        System.out.print("回答错误分数减1" + "\n\r");
                        Correct--;
                    }
                }
            }
            System.out.print("你的最后得分为 " + Correct + "\r\n");
            if (Correct <= -5) {
                System.out.print("很弱了，能不能好好算算" + "\n\r");
            } else if (Correct > -5 && Correct <= 5) {
                System.out.print("还行吧，能力有待提升" + "\n\r");
            } else if (Correct > 5 && Correct < 10) {
                System.out.print("能力很好哦，加油吧" + "\n\r");
            } else {
                System.out.print("哇塞全对了，你太棒了" + "\n\r");
            }
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
class AdditionInteger  extends Addition {
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
        this.X = (double)rx.nextInt(10000);
        //this.X = (double)(Math.round(this.x*100))/100;
        Random ry = new Random();
        this.Y = (double)ry.nextInt(10000);
        //this.Y = (double)(Math.round(this.y*100))/100;
        this.SUM = this.X + this.Y;
        //this.SUM= (double)(Math.round((this.X + this.Y)*100))/100;
    }
}
