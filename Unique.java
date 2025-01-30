import java.util.Arrays;
import java.util.Scanner;
class Nonempty{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int a=nonempty(arr);
        System.out.println(a);

    }
    
    static int nonempty(int[] arr){
      //sorting array
       Arrays.sort(arr);
       for (int i = 0; i < arr.length; i++) {
        if(arr.length>1){
          // if it is first element then compare with next element alone
          if(i==0&&arr[i]!=arr[i+1]){
              return arr[i];
            }
            // if it is last element check with previous element
            else if(i==arr.length-1 && arr[i]!=arr[i-1]){
              return arr[i];
            }
            // if it is middle element then check with preivous and next element
            else if(i>0 && i<arr.length-1 && arr[i]!=arr[i+1]&& arr[i]!=arr[i-1]){
              return arr[i];
            }
        }
        else{
            return arr[i];
        }
    }
    return -1;
}
}
