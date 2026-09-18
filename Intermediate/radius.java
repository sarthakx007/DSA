import java.util.Scanner;
public class radius {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int num_1 = sc.nextInt();
        int radius = num_1 * num_1;
        double area = Math.PI * radius;
        System.out.println(area);
    }

}
