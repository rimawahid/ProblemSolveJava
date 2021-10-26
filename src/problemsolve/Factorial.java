
package problemsolve;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact, num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        num = input.nextInt();
        fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
