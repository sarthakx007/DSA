class array {
   void oneDarray(){
    int[]ages=new int [3];
      ages[0]= 1;
     ages[1]= 2;
      ages [2]= 3;

     for(int i =0; i<3; i++){
        System.out.println(ages[i]);
       }
   }

    void multiDimensional(){
        int [][] oranges = new int [3][2];
        oranges[0][0]=4;
    oranges[0][1]=3;
       oranges[0][2]=4;

     oranges[1][0]=3;
       oranges[1][1]=4;


   }

  void sum(){
       int [] number ={1,5,3};
       int sum = 0;
       for (int i = 0; i <number.length;i++) {
           sum += number[i];
       }
      System.out.println(sum);
    }

    void max(){
      int [] arr = {5,6,7,4,3,2,1};
      int ans = 0;
      for(int i = 0; i< arr.length;i++){
            if (arr[i]>ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }

    void find(){
      int[]arr ={1,3,4,5};
      int x=5;
      int ans = -1;
      for(int i=0;i<arr.length;i++){
          if(x==arr[i]){
              ans=i; break;
          }
      }
        System.out.println(ans);
    }


    void size(){
      int [] arr = {1,5,6};
        System.out.println(arr.length);
    }
}
public class basic_oops {
    static void main(String[] args) {
     array obj1 = new array();
obj1.oneDarray();
        obj1.sum();
obj1.max();
obj1.find();
obj1.size();
    }
}