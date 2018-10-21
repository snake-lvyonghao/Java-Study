import java.util.Scanner;;
public class demo6 {
	public static void main(String[] args) {
		int random = 1 + (int)(Math.random() * 4);
		switch(random) {
		case 1:
			System.out.println("i feel fine");
			break;
		case 2:
			System.out.println("i've been better");
			break;
		case 3:
			System.out.println("i feel horrible");
			break;
		case 4:
			System.out.println("i feel terrific");
		}
	}
}
