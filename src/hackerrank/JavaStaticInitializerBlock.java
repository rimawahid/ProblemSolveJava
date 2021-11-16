package hackerrank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int B = input.nextInt();
            int H = input.nextInt();
            if (B>0 && H>0) {
                System.out.println(B*H);
            }else{
               throw new Exception("Breadth and height must be positive");
                // System.out.println("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
