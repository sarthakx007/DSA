import java.util.Scanner;

public class percentage {
    static void main(String[] args) {
        Scanner hr= new Scanner(System.in);
        System.out.println("enter message");
        float  num_1 =  hr.nextInt();
       float num_2= num_1/100 ;
       System.out.println("here is your number:" + num_2);
    }
}
