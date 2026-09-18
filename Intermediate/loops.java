import java.util.Scanner;
public class loops {
  static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter num n");
      int n = sc.nextInt();
      int num=1;
      // int sum =0;
      while (num<=n){
        System.out.println(num);
          // sum= sum + num;
          num++;
      }

  }
}
