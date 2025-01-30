
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Uniquesum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
        }
        int c=unique(arr);
        System.out.println(c);
        
    }

    public static int unique(int[] arr){
      int sum=0;
      ArrayList<Integer> list=new ArrayList<>();
      Arrays.sort(arr);
      for (int i = 0; i < arr.length; i++) {
          if(arr.length>1){
// if it is first element then compare with next element and if it is unique add in list
            if(i==0&&arr[i]!=arr[i+1]){
                list.add(arr[i]);
              }
// if it is last element then compare with previous element and if it is unique add in list
              else if(i==arr.length-1 && arr[i]!=arr[i-1]){
                list.add(arr[i]);
              }
// if it is middle element then compare with previous element and next element and if it is unique add in list
              else if(i<arr.length-1 && arr[i]!=arr[i+1]&& arr[i]!=arr[i-1]){
                list.add(arr[i]);
              }
          }
// if the array has only one element then directly add it.
          else{
            list.add(arr[i]);
          }
          

          
      }
iterate over list using for each loop and calculate sum of unique elements
      for (int num : list) {
        sum += num;
    }
      return sum;

}
}
