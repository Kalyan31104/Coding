
import java.util.Scanner;

class Year{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
//Checking whether the year is a Century year
        if(year%100==0){
// For a century Leap year it should be completely divisible by 400
            if(year%400==0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
        else{
// if it is a normal year it should be divisble by 4 for a leap year
            if(year%4==0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
    }
}
