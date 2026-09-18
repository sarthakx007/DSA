import java.util.Scanner;
public class problemloop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        // sum of the digits code

//        int sumofdigits=0;
//       int originalnum=n;
//        while(n>0) {
//            sumofdigits+=n%10;
//            n=n/10;
//        }
//        System.out.println("sum of digits "+ sumofdigits);

        // reverse the digit code

//        int ans=0;
//        while(n>0){
//            ans=ans*10+n%10;
//            n=n/10;
//        }
//        System.out.println(ans);

        // sum of the following series
//        int ans=0;
//        for(int i=1;i<=n;i++){
//            if(i%2==0){
//                ans-=i;
//            }else {
//                ans+=i;
//            }
//        }
//        System.out.println(ans);
        int fact =1;
        for(int i=1; i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
      }

    }

