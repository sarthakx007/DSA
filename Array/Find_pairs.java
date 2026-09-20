import java.util.Scanner;
public class Find_pairs{
 static int Sum_Pairs(int[]arr,int x,int n){
int count = 0;
for (int i =0;i<n;i++){
 for (int j = i+1;j<n;j++){
        if(arr[i]+arr[j]==x){
        count++;
    }
 }
  }
return count;
}
    static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of element");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
          System.out.println("enter target sum value");
           int x = sc.nextInt();
           System.out.println("the total number of pairs is " + Sum_Pairs(arr, x,n));
    }
}

    