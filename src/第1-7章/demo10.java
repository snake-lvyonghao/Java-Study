
public class demo10 {
	public static void main(String args[]) {
		int result = 0;
		for(int i = 1; i<= 10;i++) {
			int temp = 1;
			for(int j = 1; j <= i; j++) {
				temp *= j;
			}
			result += temp;
		}
		System.out.println(result);
	}
}
