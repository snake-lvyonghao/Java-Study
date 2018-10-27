package 第十章;

public class demo10_1 extends Thread {   //  创建一个类继承Thread类
    String studentName;

    public demo10_1(String studentName) {    //定义类的构造函数，传递参数；
        System.out.print(studentName + "申请访问服务器\n");
        this.studentName = studentName;
    }

    public void run() {  //用需在此线程中执行的代码覆盖Thread类的run()方法
        for (int i = 0; i < 5; i++) {
            System.out.print("当前的服务对象是：" + studentName + "同学\n");
            try {
                Thread.sleep((int) (Math.random() * 2000));
            } catch (InterruptedException ex) {
                System.err.print(ex.toString());
            }
        }
    }

    public static void main(String[] args) {
        demo10_1 t1 = new demo10_1("张三");       //用new实例化对象
        demo10_1 t2 = new demo10_1("李四");
        t1.start();
        t2.start();
    }
}