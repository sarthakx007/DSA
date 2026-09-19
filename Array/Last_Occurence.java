import java.util.Scanner;
public class Last_Occurence{
static int check_last(int[]arr,int x){
    int count = -1;
  for(int i = 0;i<arr.length;i++){
    if(arr[i]==x){
     count =i ;
    }
  }
  return count;
}
  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of element");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the x");
        int x = sc.nextInt();
        System.out.println("last occurence is "+ check_last(arr, x));
    }
}
