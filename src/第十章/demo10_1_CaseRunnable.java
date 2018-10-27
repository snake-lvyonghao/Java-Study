package 第十章;

public class demo10_1_CaseRunnable implements Runnable{
    String studentName;
    public demo10_1_CaseRunnable(String studentName){       //定义类的构造函数
        System.out.println(studentName + "申请访问服务器");
        this.studentName = studentName;
    }

    public void run(){      // 覆盖thread的run方法
        for (int i = 0; i < 5; i++){
            System.out.println("当前的服务对象是" + studentName);
            try{
                Thread.sleep((int)(Math.random() * 2000));
            }catch(InterruptedException ex){
                System.err.println(ex.toString());
            }
        }
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new demo10_1_CaseRunnable("张三"));
        Thread t2 = new Thread(new demo10_1_CaseRunnable("李四"));
        t1.start();
        t2.start();
    }
}
