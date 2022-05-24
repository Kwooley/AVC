import java.util.Scanner;

public class while1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		int num;

		while (flag) {
			num = sc.nextInt();
			System.out.println("Input number is " + num);
			if (num == -1)
				flag = false;

		}
		System.out.println("While loop is terminated");
		sc.close();
	}
}
