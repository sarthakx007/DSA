import java.util.Scanner;
public class agegrup {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age <= 12) {
            System.out.println("you are a child get the fuck out of this site");
        } else if (age > 12 && age < 18) {
            System.out.println("below 18 naughty boy");
        } else {
            System.out.println("here is your content");
        }
    }

}



