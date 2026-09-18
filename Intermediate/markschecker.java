import java.util.Scanner;
public class markschecker {
    static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = mr.nextInt();

        if ( marks<30){
            if(marks<10) {
                System.out.println("come to my office with your parents");
            } else if (marks<20){
                System.out.println("failed you idiot");
            }
        } else if (marks>=40 && marks<=60) {
            System.out.println("average better next time");
        }else
            System.out.println("excellent");


    }

}