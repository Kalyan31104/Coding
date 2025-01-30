import java.util.Scanner;
class Perfect{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=perfect(n);
//using ternary operator to check whether the number is true or false
        boolean b=(a==n)? true:false;
        System.out.println(b);

    }
//A perfect number will be number whose factors sum is equal to that number itself.
    static int perfect(int n){
        int count=1;
// iterating from 2 to less to find factors for given number.

        for(int i=2;i<n;i++){
            if(n%i==0){
                count=count+i;
            }
        }
    
        return count;    
    }
}
