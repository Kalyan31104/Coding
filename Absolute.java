import java.util.Scanner;
import java.lang.Math;
class Difference{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt(); 
       int add=a+b;
// for finding only difference and neglecting signs we use Modulus as function 
       int diff=Math.abs(a-b);
       System.out.println("Addition: "+add);
       System.out.println("Difference: "+diff);
    }
}
