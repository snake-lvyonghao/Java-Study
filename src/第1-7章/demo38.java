public class demo38 {
    public static void main(String[] args){
        Circle3 circle = new Circle3(10);
        Cone<Circle3> oneCone = new Cone<Circle3>(circle);
        oneCone.height = 10;
        oneCone.computeVolume();

        Rctangle3 rectange = new Rctangle3(10,5);
        Cone<Rctangle3>anotherCone = new Cone<Rctangle3>(rectange);
        anotherCone.height = 30;
        anotherCone.computeVolume();
    }
}
class Cone<E>{
    E bottom;
    double height;
    public Cone(E b){
        bottom = b;
    }

    public void computeVolume(){
        String s  = bottom.toString();
        double area  = Double.parseDouble(s);
        System.out.println("体积是" +1.0/3.0 * area * height);
    }
}
class Circle3{
    double area,radius;
    Circle3(double r){
        radius = r;
    }

    public String toString(){
        area = radius * radius * Math.PI;
        return " " + area;
    }
}

class Rctangle3{
    double sideA,sideB,area;

    Rctangle3(double sideA,double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String toString(){
        area = sideA * sideB;
        return " " + area;
    }
}
