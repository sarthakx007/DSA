
 import java.util.Scanner;
public class Input_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of element");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("here is your array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
