import java.util.Scanner;
class fibbo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
        
    }
    static void fib(int n){
      // oth and 1st fibonacci are 0 and 1
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
      // we are iterating a loop from 2 to n as we know 1st two fibonacci
        for(int i=2;i<=n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
