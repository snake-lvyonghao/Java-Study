public class didi2 {
    public static void main(String[] args){
        int a = 100,ge,shi,bai;
        for(int i = 1;i <= 900;i++){
            bai = a / 100;
            shi = (a % 100) / 10;
            ge = (a % 100) % 10;
            if(a == bai*bai*bai + shi*shi*shi + ge*ge*ge){
                System.out.println(a);
            }
            a++;
        }
    }
}
