import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int ans = 0; // binary number
        int pow = 1;

        while (num > 0) {
            int rem = num % 2;
            ans += rem * pow;
            pow *= 10;
            num /= 2;

        }
        System.out.println(ans);
        sc.close();
    }
}