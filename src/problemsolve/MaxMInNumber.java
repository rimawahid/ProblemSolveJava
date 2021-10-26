
package problemsolve;

import java.util.Scanner;

public class MaxMInNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[3];
        int max = 0;
        int min = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the value : ");
            a[i] = scan.nextInt();           
            if (i == 0) {
                max = a[i];
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            } else {
                continue;
            }
        }
        System.out.println("Highest number is: " + max);
        System.out.println("Lowest number is: " + min);
    }
}
