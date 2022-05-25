import java.util.Random;

public class ifelse {
	public static void main(String[] args) {
		Random rd = new Random(System.currentTimeMillis());
		int num = rd.nextInt(100);

		if (num % 2 == 0) {
			System.out.println(num + " is an Even number");
		} else {
			System.out.println(num + " is an odd number");
		}
		System.out.println("Program terminated");
	}

}
