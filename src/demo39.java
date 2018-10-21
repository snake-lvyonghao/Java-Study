public class demo39 {
    public static void main(String[] args){
        Chorous2<Singer2,MusicalInstruments2> model = new Chorous2<Singer2,MusicalInstruments2>();
        model.makeChorous(new Singer2(),new MusicalInstruments2());
    }
}
interface  Computer<E,F>{
    void makeChorous(E x,F y);
}
class Chorous2<E,F> implements Computer<E,F>{
    public void makeChorous(E x,F y){
        x.toString();
        y.toString();
    }
}
class Singer2{
    public String toString() {
        System.out.println("好一朵美丽的茉莉花");
        return " ";
    }
}
class MusicalInstruments2{
    public String toString(){
        System.out.println("|3 34 61 16 |5 56 5 -");
        return "";
    }
}