public class demo37 {
    public static void main (String[] args){
        Chorous<Singer,MusicalInstryments> model = new Chorous<Singer,MusicalInstryments>();
        model.makeChorus(new Singer(),new MusicalInstryments());
    }
}
class Chorous<E,F>{
    void makeChorus(E person,F yueqi){
        yueqi.toString();
        person.toString();
    }
}
class Singer{
    public String toString(){
        System.out.println("好一朵美丽的茉莉花");
        return " ";
    }
}
class MusicalInstryments{
    public String toString(){
        System.out.println("|3 34 62 26 |5 56 5 - |");
        return " ";
    }
}