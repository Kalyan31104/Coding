import java.util.Scanner;

class reverse{
    public static void reverse(int number) {
        String num=String.valueOf(number);
        char[] nums= num.toCharArray();
//using two pointer method
        int j=0;
// j will be at starting and i will be at ending of char array.

       for(int i=nums.length-1;i>=0;i--){
//at each time ith and jth index values are swapped untill i<j .because it reached middle if we didnot stop again it will be swapped leads to same number as starting.
      if(i<=j){
            break;
        }
        else{
            char temp =nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
        }
        
       }
       System.out.println(String.valueOf(nums));
     
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverse(n);
    }

}
