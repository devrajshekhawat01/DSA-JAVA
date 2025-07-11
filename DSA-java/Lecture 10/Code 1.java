//Number system properties

import java.util.Scanner;

public class code_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Binary representation
        int ans = 0;
        int ab = 1;

        while (num > 0) {
            int digit = num % 10;
            ans += (digit * ab);
            num /= 10;
            ab *= 2;
        }
        System.out.println(ans);
        sc.close();
    }
}