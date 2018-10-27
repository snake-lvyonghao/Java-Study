package 第十章;

public class demo10_2 {
    CardAccount cardaccount;
    Thread messConsume,shoolingConsume;
    Thread mobileConsme,libtaryCinsume,marketConsume;
    demo10_2(){
        cardaccount = new CardAccount();
        messConsume = new Thread(cardaccount);
        shoolingConsume = new Thread(cardaccount);
        mobileConsme = new Thread(cardaccount);
        libtaryCinsume = new Thread(cardaccount);
        marketConsume = new Thread(cardaccount);
        messConsume.setName("messConsume");
        shoolingConsume.setName("schoolConsume");
        mobileConsme.setName("mobileConsume");
        marketConsume.setName("marketConsume");
        libtaryCinsume.setName("libaryConsume");
    }

    public static void main(String[] args){
        demo10_2 ex = new demo10_2();
        ex.caserun();
    }

    public void caserun(){
        try{
            messConsume.start();
            libtaryCinsume.start();
            marketConsume.start();
            mobileConsme.start();
            shoolingConsume.start();
        }catch (Exception e){
            System.err.println(e.toString());
        }
    }
}
class CardAccount implements Runnable{
    int fund = 1000;
    String accsessType;
    public void setFund(int num){
        fund = num;
    }
    public synchronized void accountAccess(int num,boolean k) {
        for (int i = 0; i < 3; i++) {
            accsessType = Thread.currentThread().getName();
            if (k) {
                fund = num;
            } else
                fund -= num;
            try {
                System.out.println("当前线程是" + accsessType + "账户资金为： " + fund + "。");
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public void run(){
        accsessType = Thread.currentThread().getName();
        if(accsessType.equals("messConsume"))
            accountAccess(5,false);
        else if (accsessType.equals("schoolingConsume"))
            accountAccess(100,false);
        else if (accsessType.equals("mobileConsume"))
            accountAccess(20,false);
        else if(accsessType.equals("libaryConsume"))
            accountAccess(2,false);
        else if(accsessType.equals("marketConsume"))
            accountAccess(6,false);
    }
}