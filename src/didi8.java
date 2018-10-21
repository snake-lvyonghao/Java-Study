public class didi8 {
    public static void main(String[] args){
        Game1 game1 = new Game1("动作游戏",20000,"2D or 3D");
        System.out.print(game1.toSrting());
        Rpg rpg = new Rpg("RPG角色扮演",1000000,"魔兽世界","3D","暴雪",20);
        System.out.print(rpg.toSrting());
        System.out.print("最大同屏人数: " + rpg.NOP());
    }
}
class Game1{
    String name;
    String Frame;
    double size;
    public Game1(String name,double size,String Frame){
        this.name = name;
        this.size = size;
        this.Frame = Frame;
    }

    public String toSrting(){
        return "游戏类型: " + name + "\r\n" + "游戏大小: " + size + "\r\n" + "游戏画面: " + Frame + "\r\n" ;
    }
}
class Rpg extends Game1{
    String Gamename;
    String GameCompany;
    int NumberOfPeople;

    public Rpg(String name,double size,String Gamename,String Frame,String GameCompany,int NumberOfPeople){
        super(name,size,Frame);
        this.Gamename = Gamename;
        this.GameCompany = GameCompany;
        this.NumberOfPeople = NumberOfPeople;
    }

    public String NOP(){
        int i = 0;
        i = 2 * NumberOfPeople;
        return " " + i;
    }

    public String toSrting(){
        return "游戏类型: " + name + "\r\n" + "游戏大小: " + size + "\r\n" + "游戏画面: " + Frame + "\r\n" + "游戏名字:" + Gamename + "\r\n"+ "游戏公司: " + GameCompany + "\r\n";
    }

}