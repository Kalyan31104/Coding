import java.util.Scanner;
import java.lang.Math;
class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=prime(n);
        if(b)
        {
             System.out.println("It is a prime");
        }
        else{
            System.out.println("It is not a prime");
        }
    }
    static boolean prime(int n){
        if(n==0||n==1){
            return false;
        }
//checking whether the number has any factors till sqrt(n)
//if it has any factor then it is not a prime number
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
