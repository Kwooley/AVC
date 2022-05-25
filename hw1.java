import java.util.Arrays;
import java.util.Random;

public class hw1 {
	public static void main(String[] args) {
		final int N = 5;
		int[] num = new int[N];
		int min, max, sum;
		min = max = sum = 0;
		Random rd = new Random(System.currentTimeMillis());

		for (int i = 0; i < N; i++) {
			num[i] = rd.nextInt(10);
			sum += num[i];
			if (i == 0) {
				min = max = num[i];
			} else {
				min = num[i] < min ? num[i] : min;
				max = num[i] > max ? num[i] : max;
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println("min: " + min + " max: " + max);
		sum -= min + max;
		System.out.println("Sum: " + sum);
	}
}
