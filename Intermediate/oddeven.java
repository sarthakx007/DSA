import java.util.Scanner;
public class oddeven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
      int num_1 = sc.nextInt();
      //   if (num_1 % 2 == 0) {
        //     System.out.println("number is even");
         //} else{
           //    System.out.println("number is odd");
            // }
        //

        //String ans ;
        //ans = (num_1 % 2==0) ? "even": "odd";
        //System.out.println(ans);
 if ( num_1%2==0){
     if(num_1%3==0){
         System.out.println("num is even and divisible by 3");
     }else{
         System.out.println("num is even but not divisible by 3");
     }
 }else {
      System.out.println("odd");
 }
         }


    }

