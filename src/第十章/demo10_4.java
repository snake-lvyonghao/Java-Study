package 第十章;

public class demo10_4 {
    private int seatResource;   //共享缓冲区
    private boolean empty = true;    //seatResource 是否为空的新的信号量
    public void setEmpty(){
        empty = true;
    }
    public synchronized void push(int pubResource){
        while(!empty){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        seatResource = pubResource; //将生成的座位号放到缓冲区
        empty = false;  //  设置缓冲区满状态
        notify();   //  唤醒其他等待线程
    }
    public synchronized int pop(){  //  从缓冲区订座位
        while(empty) {
            try {
                wait();//当缓冲区空的时候，等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            int popResource = seatResource;
            seatResource = 0;
            empty = true;   //设置缓冲区状态
            notify();
            return popResource; //  返回锁定座位号
    }
    public static void main(String[] args){
        demo10_4 so = new demo10_4();
        SeatProcedure sp = new SeatProcedure(so);
        sp.start();
        SeatConsumer sc = new SeatConsumer(so);
        sc.start();
        SeatRelease sr = new SeatRelease(so);
        sr.start();
    }
}
class SeatProcedure extends Thread{
    private demo10_4 so;

    public SeatProcedure(demo10_4 so){
        this.so = so;
    }
    public void run(){
        for(int i = 1; i <= 30;i++){
            int pubResource = i;
            so.push(pubResource);
            System.out.println("第" + pubResource + "号座位为空");
            try{
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class SeatConsumer extends Thread{
    private demo10_4 so;
    public SeatConsumer(demo10_4 so){
        this.so = so;
    }
    public void run(){
        for(int i = 1; i < 50;i++){
            synchronized (so){
                int sh = so.pop();
                if(sh != 0){
                    System.out.println("学生" + i + " " + "占了第" + sh +"座位号");
                }
                else{
                    System.out.println("没有座位，请等待！");
                }
            }
            try{
                sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class SeatRelease extends Thread{
    private demo10_4 so;

    public SeatRelease(demo10_4 so){
        this.so = so;
    }

    public void run(){
        try{
            sleep(2000);
            this.so.setEmpty();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for(int i = 1;i <= 30;i++ ){
            int pubResource = i;
            so.push(pubResource);
            System.out.println("第" + pubResource + "号座位取消预定");
            try{
                sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}