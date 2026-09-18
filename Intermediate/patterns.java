import java.util.Scanner;
public class patterns {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give r");
        int r = sc.nextInt();
        int c =sc.nextInt();
        // print rectangle
//        for(int i= 1;i<=r;i++){
//            for(int j= 1;j<=c;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // hollow rectangle
//        for(int i= 1;i<=r;i++){
//            for(int j= 1;j<=c;j++){
//                if(i==1||i==r||j==1||j==c)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//                }
//            System.out.println();
//                }
        // triangle
//        for (int i=1;i<=r;i++){
//            for(int j=1;j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
       // inverted triangle

//        for (int i=1;i<=r;i++){
//            for(int j=1;j<=r+1-i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // pyramid
//
//        for (int i= 1 ; i<=r;i++){
//            for(int j=1; j<=r-i;j++){
//                System.out.print(" ");
//            }
//                for(int k=1;k<=2*i-1;k++){
//                    System.out.print("*");
//                }
//            System.out.println();
//        }

        // numerical print

        for (int i = 1;i<=r;i++){
            for(int j= 1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
      }
    }

