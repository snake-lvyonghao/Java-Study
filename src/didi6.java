public class didi6 {
    public static void main(String[] args){
        int sum = 0;
        for(int year = 1900;year <= 2100;year++){
            if(year%4==0&&year%100!=0||year%400==0){
                System.out.print(year + " ");
                sum++;
                if(sum == 5){
                    System.out.print("\n\r");
                    sum = 0;
                }
            }

        }
    }
}
