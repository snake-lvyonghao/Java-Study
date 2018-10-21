import javax.naming.InsufficientResourcesException;
public class demo49 {
    public static void main(String[] args){
        try {
            Bank ba = new Bank(50);
            ba.withrawal(100);
            System.out.println("取款成功！");
        }catch (InsufficientFundsException e){
            System.out.println(e.toString());
            System.out.println(e.excepMessage());
        }
    }
}
//银行类
class Bank{
    double balance; //存款余额
    Bank(double balance){
        this.balance = balance;
    } //构造方法
    public void deposite(double dAmount){
        if(dAmount > 0.0) balance += dAmount;
    }
    public void withrawal(double dAmount) throws InsufficientFundsException{
        if(balance < dAmount)
            throw new InsufficientFundsException(this,dAmount);
        balance = balance - dAmount;
    } //取款方法
    public void showBlance(){
        System.out.println("The balance is" + (int)balance);
    }
}
class InsufficientFundsException extends Exception{
    private Bank excepbank; //银行对象
    private double excepAmout; // 取款额
    InsufficientFundsException(Bank ba,double dAmout){ //异常类构造方法
        super("取款异常");
        excepbank = ba;
        excepAmout = dAmout;
    }
    public String excepMessage(){
        String str = "银行存款是：" + excepbank.balance + "\n" + "要取的钱是：" + excepAmout;
        return str;
    }
}