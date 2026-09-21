import java.util.Scanner;
public class unique_value{
 static int special(int[]arr,int n){
   for(int i =0;i<n;i++){
    for(int j =i+1;j<n;j++){
       if(arr[i]==arr[j]){
        arr[i]=-1;
        arr[j]=-1;
       }
     }
   }
   int ans = -1;
for(int i =0;i<n;i++){
    if(arr[i]>0){
        ans=arr[i];
    }
}
return ans;
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
        
           System.out.println("special no is " + special(arr,n));
    }
}

    