
package problemsolve;

import java.util.Scanner;


public class OddEvenNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        if (num%2 ==0){
            System.out.println( num +" is an even  number");
        }else{
            System.out.println(num +" is  an odd  number");
        }
    }
}
