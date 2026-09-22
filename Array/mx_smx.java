public class mx_smx{

    static int find_max(int[]arr,int mx) {
         for (int i =0;i<arr.length;i++){
        //    if(arr[i]>mx){
        //     mx=arr[i];
        //    }
        mx= Math.max(mx,arr[i]);
        }
        return mx;
    }

    static int  find_smx(int[]arr,int smx,int mx){
    int max=find_max(arr,mx);
        for (int i =0;i<arr.length;i++){
        if(arr[i]!=max){
           smx=Math.max(smx,arr[i]);
        }
    }
    return smx;
    }
    static void main(String[]args){
        int[] arr= {153,153,45,123,123,54};
        int Smx = Integer.MIN_VALUE;
        int mx = Integer.MIN_VALUE;
System.out.println("the max value is " + find_max(arr, mx));
System.out.println("the second max is "+ find_smx(arr, mx, Smx));
    }
}
