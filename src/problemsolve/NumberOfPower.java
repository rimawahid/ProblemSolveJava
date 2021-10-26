
package problemsolve;

import java.util.Scanner;

public class NumberOfPower {
    public static void main(String[] args) {
        double n, p, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for number : ");
        n = input.nextLong();
        System.out.print("Enter value for power : ");
        p = input.nextLong();
        result = 1;
        result= Math.pow(n, p);
        int res = (int)result;
        
        System.out.println("Result : " + res);
    }
}
