
public class Occurence{

  static int checktheXcount(int[]arr,int x){
        int count=0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
   public static void main(String[]args){
        int[]arr={2,3,4,4,5,};
        int x= 4;
         
         System.out.println("count is " + checktheXcount(arr, x));
    }
}