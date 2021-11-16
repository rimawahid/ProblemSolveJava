//The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
package hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; sc.hasNext()== true; i++) {
            System.out.println(i+" "+ sc.nextLine());
        }
    }
}
