import java.util.Arrays;
import java.util.Scanner;
public class nthsmlrArray{

    static int[] nthsmallest(int[]arr,int x){
        Arrays.sort(arr);
        int[]ans={arr[0],arr[x-1]};
        return ans;
   }

   static int[] nthlargest(int[]arr,int x){
        Arrays.sort(arr);
        int[]lr={arr[arr.length-1],arr[(arr.length)-(x-1)]};
        return lr;
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
     int x = sc.nextInt();
        int[]ans=nthsmallest(arr,x);
         System.out.println("smallest array is " + ans[0]);
         System.out.println("nthsmallest array is " + ans[1]);
        int []lr=nthlargest(arr, x);
          System.out.println("smallest array is " + lr[0]);
         System.out.println("nthsmallest array is " + lr[1]);
         }
}
