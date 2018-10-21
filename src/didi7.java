public class didi7 {
    public static void main(String[] args){
        Car Audi = new Car("Audi",4,2000);
        Electricvehicle Tesla = new Electricvehicle("Tesla",4,3400,"台电 ",1000,40000);

    }
}
class Car{
    public String name;
    public double mileage;
    public double engine;

    public String getName() {
        return name;
    }

    public double getengine() {
        return engine;
    }

    public double getMileage() {
        return mileage;
    }
    public Car(String name,double engine,double mileage){
        this.engine = engine;
        this.mileage = mileage;
        this.name = name;
        System.out.println("车名：" + this.name + "发动机数：" + engine + "里程数：" + mileage + "km" + "\n");
    }
}

class Electricvehicle extends Car{
    private String battery ;
    private double batterycapacity ;
    
    public Electricvehicle(String name,double engin,double mieage,String battery,double battercapacity, double batterycapacity) {
    	super(name,engin,mieage);
    	this.battery = battery;
    	this.batterycapacity = batterycapacity;
    	System.out.print("电池品牌：" + battery + "电池容量：" + batterycapacity + "毫安");
    }

    
    public String toString(){
        return "电池品牌：" + battery + "电池容量：" + batterycapacity + "毫安";
    }
}