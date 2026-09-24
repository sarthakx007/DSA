public class In_place_reverse{
    static void printArray(int[]arr) {
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

          static void swaparray(int[]arr, int i , int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }

        static  void inplace_reverse(int[]arr){
            int i=0,j=arr.length-1;
        while(i<j){
            swaparray(arr, i, j);
        i++;
      j--;
           }

        }

    static void main(String[]args){
        int []arr= {1,2,3,4,5 };
        inplace_reverse(arr);
        printArray(arr);
    }
}