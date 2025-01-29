import java.util.Scanner;
class Prime{
    public static void main(String[] args)
{
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
// if number is zero or one then it is not a prime number
        if(n==0||n==1){
            return false;
        }
// check whether the number has any factors between 2 to n-1
// if it has any factor then it is not a prime
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
