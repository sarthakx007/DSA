import java.util.Arrays;
import java.util.Scanner;
public class smlrArray{

    static int[] smallestlargest(int[]arr){
        Arrays.sort(arr);
        int[]ans={arr[0],arr[arr.length-1]};
        return ans;
    //     for(int i =0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
   }
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n of element");
        int n = sc.nextInt();
    int[]arr = new int[n];
     System.out.println("enter the elements");
     for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
     }
        int[]ans=smallestlargest(arr);
        System.out.println("smallest array is " + ans[0]);
        System.out.println("largest array is " + ans[1]);
         }
  
}
