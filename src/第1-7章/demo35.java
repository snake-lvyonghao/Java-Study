public class demo35 {
    public static void main(String[] args){
        Teacher2 zhang = new Teacher2();
        Student3 liu = new Student3(){
            void speak(){
                System.out.println("这是匿名类的方法");
            }
        };
        zhang.look(liu);
    }
}
abstract class Student3{
    abstract void speak();
}
class Teacher2 {
    void look(Student3 s){
        s.speak();
    }
}