
public class demo33 {
    public static void main(String[] args){
        int sum = 0,a = 2;
        for(int i = 1; i <= 50; i++){
            sum += a;
            a += 2;
        }
        System.out.println(sum);
    }
}
