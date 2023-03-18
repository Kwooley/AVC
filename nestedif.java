import java.util.Scanner;

public class nestedif {

    public static void main(String[] argv) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            if (num < 100)
                System.out.println(num + " is greater 0 and less than 100");
            else
                System.out.println(num + " is greater than 100");
        }
        sc.close();

    }
}
