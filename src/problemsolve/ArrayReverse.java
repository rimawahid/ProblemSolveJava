
package problemsolve;

public class ArrayReverse {
    public static void main(String[] args) {

        //int [] arr = new int[]{10,20,30,40};
        //int[] arr = {10, 20, 30, 40};
        //using for loop
//        System.out.print("array Reverse : ");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print("\n");



//using while loop
        int[] arr = {10, 20, 30, 40};
        int temp;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("printing an array after Reverse : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
