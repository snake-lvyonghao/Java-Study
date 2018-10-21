public class didi3 {

    public static void main(String[] args){
        for(int i=2; i<100; i++)
        {
            if(2==i || 3==i){
                System.out.print(i+" ");
                continue;
            }
            int j=2;
            while(j<i){
                if(i%j==0){
                    break;
                }
                j++;
            }
            if(j==i){
                System.out.print(i+" ");
            }
        }
    }
}
