import java.util.Scanner;
public class SUM {
    static void main(String[] args) {
        Scanner pr= new Scanner (System.in);
        System.out.println("enter first number");
        int num_1 = pr.nextInt();
         System.out.println( " enter second number");
         int num_2 = pr.nextInt();
         int sum = num_1 + num_2;

         System.out.println( "your number sum is : "+sum);

    }
}
