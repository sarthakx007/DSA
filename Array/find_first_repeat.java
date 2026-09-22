public class find_first_repeat{

    static int find_repeat(int[]arr){
        for(int i =0;i<arr.length;i++){
           for(int j = i+1;j<arr.length;j++){
             if (arr[i]==arr[j]){
             return arr[i];
           }
        }
        }
return -1;
    }
    static void main (String[]args){
        int []arr={123,134,5,4,122};
      System.out.println(find_repeat(arr));
    }
}
