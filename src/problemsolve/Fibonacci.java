
package problemsolve;

import java.util.Scanner;

public class Fibonacci {

    
    public static void main(String[] args) {
        int first, second,fibo;
       Scanner input = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int num = input.nextInt();
        
        first = 0;
        second = 1;
        System.out.println("Fibonacci : ");
        System.out.print(first + " " + second);
        for (int i = 3; i <= num; i++) {
             fibo = first+ second;
            first= second;
            second = fibo;

            System.out.print(" " + fibo);
        }
        System.out.println("\n");
        
    }
    
}
